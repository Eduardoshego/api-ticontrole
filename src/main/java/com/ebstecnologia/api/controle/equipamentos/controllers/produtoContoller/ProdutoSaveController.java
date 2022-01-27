package com.ebstecnologia.api.controle.equipamentos.controllers.produtoContoller;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/produtos")
@RequiredArgsConstructor
public class ProdutoSaveController {

    private final ProdutoServiceSave produtoServiceSave;

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        return produtoServiceSave.save(produto);
    }
}
