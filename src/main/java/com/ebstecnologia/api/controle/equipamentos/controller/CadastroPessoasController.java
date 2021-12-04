package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.CadastroPessoaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.CadastroPessoas;
import com.ebstecnologia.api.controle.equipamentos.service.CadastroPessoasService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supervisores")
@AllArgsConstructor

public class CadastroPessoasController {

    private final CadastroPessoasService service;

    @PostMapping
    public CadastroPessoas save(@RequestBody CadastroPessoaDTO supervisor){
        return service.save(supervisor);
    }
    @GetMapping
    public List<CadastroPessoas> findAll(){
        return service.findAll();
    }
    @GetMapping("{id}")
    public CadastroPessoas findById(@PathVariable String id){
        return service.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(String id){
        service.deleteById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable String id, CadastroPessoas sup){
        service.update(id, sup);
    }
}
