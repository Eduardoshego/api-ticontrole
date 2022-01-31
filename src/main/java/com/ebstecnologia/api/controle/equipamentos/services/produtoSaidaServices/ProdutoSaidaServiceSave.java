package com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoSaidaRepository;
import com.ebstecnologia.api.controle.equipamentos.services.SetorService;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto.MyExceptionSemEstoque;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoSaidaServiceSave {

    private final ProdutoSaidaRepository repository;
    private final SetorService setorService;
    private final ProdutoServiceFindById produtoService;
    private final ProdutoServiceUpdate produtoServiceUpdate;

    public ProdutoSaida save(ProdutoSaidaDTO dto){
        Produto produto = produtoService.findById(dto.getIdProduto());
        Setor setor = setorService.findById(dto.getIdProduto());
        if(dto.getQuant() > produto.getQuantidade()){
            throw new MyExceptionSemEstoque(
                    "Produto com estoque menor do que o solicitado " +
                            ", verifique o saldo do produto e tente novamente"
            );
        }
        else{
            produto.setQuantidade(produto.getQuantidade() - dto.getQuant());
            produtoServiceUpdate.produtoUpdate(produto.getId(), produto);
            ProdutoSaida produtoSaida =  new ProdutoSaida();
            produtoSaida.setProdutoDecricao(produto.getDescricao());
            produtoSaida.setQuantProdutoSaida(dto.getQuant());
            produtoSaida.setProduto(produto);
            produtoSaida.setSetor(setor);
            produtoSaida.setQuantProdutoSaida(dto.getQuant());
           return repository.save(produtoSaida);

        }
    }
}
