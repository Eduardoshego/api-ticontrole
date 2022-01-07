package com.ebstecnologia.api.controle.equipamentos.services.produtoEntradaServices;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.ProdutoEntradaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoEntrada;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoEntradaRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto.MyExceptionValorInvalido;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoEntradaSave {

    private ProdutoEntradaRepository repository;
    private ProdutoServiceFindById produtoServiceFindById;
    private ProdutoServiceUpdate produtoServiceUpdate;

    public ProdutoEntrada save(ProdutoEntradaDTO produtoEntradaDto){
        Produto produto = produtoServiceFindById.findById(produtoEntradaDto.getIdProduto());
        if(produtoEntradaDto.getQuant() > 0){
            produto.setQuantidade(produto.getQuantidade() + produtoEntradaDto.getQuant());
            produtoServiceUpdate.produtoUpdate(produtoEntradaDto.getIdProduto(), produto);
            ProdutoEntrada produtoEntrada = new ProdutoEntrada();
            produtoEntrada.setQuant(produtoEntradaDto.getQuant());
            produtoEntrada.setProdutoDecricao(produto.getDescricao());
            produtoEntrada.setProduto(produto);
            return repository.save(produtoEntrada);
        }
        else{
            throw new MyExceptionValorInvalido(
                    "Quantidade de produto a ser lançado Inválido! refaça sua operação. "
            );
        }

    }
}
