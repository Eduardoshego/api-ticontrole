package com.ebstecnologia.api.controle.equipamentos.controllers.computadorController;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceListPageable;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ComputadorControllerSave.URL)
@AllArgsConstructor
public class ComputadorControllerListPageable {

    public final static String URL = "api/computadores";
    private final ComputadorServiceListPageable service;

    @GetMapping
    public Page<Computador> listPageable( Pageable pageable) {
        return service.list(pageable);
    }
}