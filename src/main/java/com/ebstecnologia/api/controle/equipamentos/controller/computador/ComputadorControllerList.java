package com.ebstecnologia.api.controle.equipamentos.controller.computador;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.service.computador.ComputadorServiceList;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computadores")
@AllArgsConstructor
public class ComputadorControllerList {

    private final ComputadorServiceList service;

    @GetMapping
    public Page<Computador> list(Pageable pageable) {
        return service.list(pageable);
    }
}