package com.ebstecnologia.api.controle.equipamentos.controllers.estabilizadorController;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.services.estabilizadorServices.EstbilizadorServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/estabilizadores/{id}")
@RequiredArgsConstructor
public class EstabilizadorControllerFindById {

    private final EstbilizadorServiceFindById service;

    @GetMapping()
    public Estabilizador findBYId(@PathVariable Integer id){
        return service.findById(id);
    }
}
