package com.ebstecnologia.api.controle.equipamentos.services.produtoServices;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoServiceFindById {

    private final ProdutoRepository repository;

    public Produto findById(Integer id){
        return repository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Nenhum registro foi recuperado refaça a pesquisa novamente"
                )
        );
    }
}
