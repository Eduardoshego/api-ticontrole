package com.ebstecnologia.api.controle.equipamentos.controllers.produtoContoller;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceListPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/produtos")
public class ProdutoListAll {

    private final ProdutoServiceListPageable produtoServiceListPageable;

    @GetMapping
    public Page<Produto> listaPaginada(Pageable pageable){
        return produtoServiceListPageable.listaPaginada(pageable);
    }
}
