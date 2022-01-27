package com.ebstecnologia.api.controle.equipamentos.controllers.produtoSaidaControllers;

import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices.ProdutoSaidaServiceListPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/produtos-saidas")

public class ProdutoSaidaControllerListPageable {

    private final ProdutoSaidaServiceListPageable service;

    @GetMapping
    public List<ProdutoSaida> listALL(){
        return service.listAll();
    }
}
