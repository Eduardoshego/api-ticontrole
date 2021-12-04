package com.ebstecnologia.api.controle.equipamentos.controller;

import java.util.List;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.service.ComputadorService;

import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/computadores")
public class ComputadorController {

    private final ComputadorService computadorService;

    @PostMapping
    public Computador save(@RequestBody ComputadorDTO computador){
        return computadorService.save(computador);
    }
    @GetMapping
    public List<Computador> findAll(){
        return computadorService.findAll();
    }
    @GetMapping("{id}")
    public Computador findById(@PathVariable Integer id){
        return computadorService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleById(@PathVariable Integer id){
        computadorService.deleteById(id);
    }
}
