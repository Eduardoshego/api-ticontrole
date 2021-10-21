package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.RegistroImpressora;
import com.ebstecnologia.api.controle.equipamentos.service.RegistroImpressoraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros_impressoras")
@AllArgsConstructor
public class RegistroImpressoraController {
    private final RegistroImpressoraService registroImpressoraService;

    @PostMapping
    public RegistroImpressora save(@RequestBody RegistroImpressora reg) {
        return registroImpressoraService.save(reg);
    }
    @GetMapping
    public List<RegistroImpressora> findAll(){
        return registroImpressoraService.findAll();
    }
    @GetMapping("{id}")
    public RegistroImpressora findById(@PathVariable Integer id){
        return registroImpressoraService.findById(id);
    }
}