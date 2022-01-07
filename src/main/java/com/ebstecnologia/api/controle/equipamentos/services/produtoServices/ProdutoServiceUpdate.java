package com.ebstecnologia.api.controle.equipamentos.services.produtoServices;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoServiceUpdate {

    private final ProdutoRepository repository;
    private final ProdutoServiceFindById produtoServiceFindById;
    private final ProdutoServiceSave produtoServiceSave;

    public void produtoUpdate(Integer id, Produto produtoAtualizado){
        Produto obj = produtoServiceFindById.findById(id);
        obj.setId(id);
        obj = produtoAtualizado;
        produtoServiceSave.save(obj);
    }
}
