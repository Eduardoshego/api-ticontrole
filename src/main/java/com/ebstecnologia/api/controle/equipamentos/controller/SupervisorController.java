package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Supervisor;
import com.ebstecnologia.api.controle.equipamentos.service.SupervisorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supervisores")
@AllArgsConstructor
public class SupervisorController {

    private final SupervisorService service;

    @PostMapping
    public Supervisor save(@RequestBody Supervisor supervisor){
        return service.save(supervisor);
    }
    @GetMapping
    public List<Supervisor> findAll(){
        return service.findAll();
    }
    @GetMapping("{id}")
    public Supervisor findById(@PathVariable Integer id){
        return service.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(Integer id){
        service.deleteById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, Supervisor sup){
        service.update(id, sup);
    }
}
