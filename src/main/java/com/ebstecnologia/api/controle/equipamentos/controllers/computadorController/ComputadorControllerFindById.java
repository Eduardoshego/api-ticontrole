package com.ebstecnologia.api.controle.equipamentos.controllers.computadorController;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/computadores")
@RequiredArgsConstructor
public class ComputadorControllerFindById {

    private final ComputadorServiceFindById service;

    @GetMapping("/{id}")
    public Computador findById(@PathVariable Integer id){
        return service.findById(id);
    }

}
