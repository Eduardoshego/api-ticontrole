package com.ebstecnologia.api.controle.equipamentos.controllers;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices.ProdutoSaidaServiceSave;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos-saidas")
@RequiredArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
public class ProdutoSaidaController {


    private final ProdutoSaidaServiceSave produtoServiceSave;


    @PostMapping
    public ProdutoSaida save(@RequestBody ProdutoSaidaDTO produtoSaida){
        return produtoServiceSave.save(produtoSaida);
    }

}
