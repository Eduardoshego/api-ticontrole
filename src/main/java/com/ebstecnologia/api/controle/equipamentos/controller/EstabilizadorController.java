package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.service.EstabilizadorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estabilizadores")
@AllArgsConstructor
public class EstabilizadorController {

    private final EstabilizadorService service;

    @PostMapping
    public Estabilizador save(Estabilizador est){
        return service.save(est);
    }
    @GetMapping
    public List<Estabilizador> list(){
        return service.listEstabilizador();
    }
    @GetMapping("/id")
    public Estabilizador findById(@PathVariable Integer id){
        return service.findById(id);
    }
    @PutMapping("/{id}")
    public void update(Estabilizador est, Integer id){
        service.update(est, id);
    }
    @DeleteMapping("/{id}")
    public void delete(Integer id){
        service.delete(id);
    }
}
