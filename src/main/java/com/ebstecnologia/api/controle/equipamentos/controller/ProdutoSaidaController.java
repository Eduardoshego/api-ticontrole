package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.service.ProdutoSaidaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos-saidas")
@AllArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
public class ProdutoSaidaController {

    private final ProdutoSaidaService produtoSaidaService;

    @PostMapping
    public ProdutoSaida save(@RequestBody ProdutoSaidaDTO produtoSaida){
        return produtoSaidaService.save(produtoSaida);
    }
    @GetMapping
    public List<ProdutoSaida> produtoSaidaList(){
        return produtoSaidaService.listProdutoSaida();
    }
}
