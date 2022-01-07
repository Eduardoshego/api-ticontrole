package com.ebstecnologia.api.controle.equipamentos.controllers;

import com.ebstecnologia.api.controle.equipamentos.model.RegistroImpressora;
import com.ebstecnologia.api.controle.equipamentos.services.RegistroImpressoraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros_impressoras")
@AllArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
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