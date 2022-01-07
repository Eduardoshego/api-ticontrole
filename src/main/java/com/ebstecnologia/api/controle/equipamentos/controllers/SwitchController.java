package com.ebstecnologia.api.controle.equipamentos.controllers;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.services.SwitchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/switchs")
@AllArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
public class SwitchController {

    private final SwitchService switchService;

    @PostMapping
    public Switch save(@RequestBody Switch sw){
        return switchService.save(sw);
    }
    @GetMapping
    public List<Switch> findAll(){
        return switchService.findAll();
    }
    @GetMapping("/{id}")
    public Switch findById(Integer id){
        return switchService.findById(id);

    }

}
