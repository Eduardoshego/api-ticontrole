package com.ebstecnologia.api.controle.equipamentos.services.produtoServices;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoServiceSave {

    private final ProdutoRepository repository;

    public Produto save(Produto produto){
        return repository.save(produto);
    }
}
