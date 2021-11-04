package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoSaidaRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyExceptionSemEstoque;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoSaidaService {
    private final ProdutoSaidaRepository produtoSaidaRepository;
    private final ProdutoService produtoService;
    private final SetorService setorService;

    public ProdutoSaida save(ProdutoSaidaDTO produtoSaidaDTO){
        Produto produto = produtoService.findById(produtoSaidaDTO.getIdProduto());
        Setor setor = setorService.findById(produtoSaidaDTO.getIdSetor());
        if (produto.getQuantidade() >= produtoSaidaDTO.getQuant()){
            produto.setQuantidade(produto.getQuantidade() - produtoSaidaDTO.getQuant());
            produto.setId(produtoSaidaDTO.getIdProduto());
            produtoService.save(produto);
            ProdutoSaida produtoSaida = new ProdutoSaida();
            produtoSaida.setProduto(produto);
            produtoSaida.setSetor(setor);
            return produtoSaidaRepository.save(produtoSaida);
        }
        else{
            throw new MyExceptionSemEstoque(
                    "Produto com estoque menor do que o solicitado " +
                            ", verifique o saldo do produto e tente novamente" );
        }
    }
    public List<ProdutoSaida> listProdutoSaida(){
        return produtoSaidaRepository.findAll();
    }

}
