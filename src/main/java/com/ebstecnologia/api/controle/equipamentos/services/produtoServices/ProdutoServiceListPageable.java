package com.ebstecnologia.api.controle.equipamentos.services.produtoServices;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProdutoServiceListPageable {

    private final ProdutoRepository produtoRepository;

    public Page<Produto> listaPaginada(Pageable pageable){
        return produtoRepository.findAll(pageable);
    }
}
