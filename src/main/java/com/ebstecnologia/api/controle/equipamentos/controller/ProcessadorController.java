package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.service.ProcessadorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/processadores")
@AllArgsConstructor
public class ProcessadorController {

    private final ProcessadorService processadorService;

    @PostMapping
    public Processador save(@RequestBody Processador processador){
        return processadorService.save(processador);
    }
    @GetMapping
    public List<Processador> findAll(){
        return processadorService.findAll();
    }
    @GetMapping("{id}")
    public Processador findById(@PathVariable Integer id){
        return processadorService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id){
        processadorService.deletById(id);
    }
}
