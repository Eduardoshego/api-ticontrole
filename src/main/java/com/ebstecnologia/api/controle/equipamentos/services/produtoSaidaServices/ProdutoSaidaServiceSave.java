package com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoSaidaRepository;
import com.ebstecnologia.api.controle.equipamentos.services.SetorService;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceUpdate;
import com.ebstecnologia.api.controle.equipamentos.services.util.ValidaSaidaProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoSaidaServiceSave {

    private final ProdutoSaidaRepository repository;
    private final SetorService setorService;
    private final ProdutoServiceFindById produtoService;
    private final ProdutoServiceUpdate produtoServiceUpdate;
    private final ValidaSaidaProduto validaSaidaProduto;

    public ProdutoSaida save(ProdutoSaidaDTO dto){
        validaSaidaProduto.validaSaida(dto);
        Produto produto = produtoService.findById(dto.getIdProduto());
        produto.setQuantidade(produto.getQuantidade() - dto.getQuant());
        produtoServiceUpdate.produtoUpdate(produto.getId(), produto);
        ProdutoSaida produtoSaida= new ProdutoSaida();
        produtoSaida.setQuantProdutoSaida(dto.getQuant());
        produtoSaida.setProdutoDecricao(produto.getDescricao());
        produtoSaida.setProduto(produtoService.findById(produto.getId()));
        produtoSaida.setSetor(setorService.findById(dto.getIdSetor()));
        return repository.save(produtoSaida);
    }
}
