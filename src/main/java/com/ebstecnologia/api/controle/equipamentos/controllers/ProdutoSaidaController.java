package com.ebstecnologia.api.controle.equipamentos.controllers;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.services.ProdutoSaidaService;
import com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices.ProdutoSaidaServiceSave;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceSave;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos-saidas")
@AllArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
public class ProdutoSaidaController {

    private final ProdutoSaidaService produtoSaidaService;
    private final ProdutoSaidaServiceSave produtoServiceSave;


    @PostMapping
    public ProdutoSaida save(@RequestBody ProdutoSaidaDTO produtoSaida){
        return produtoServiceSave.save(produtoSaida);
    }

}
