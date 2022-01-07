package com.ebstecnologia.api.controle.equipamentos.controllers.estabilizadorController;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.services.estabilizadorServices.EstabilizadorSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/estabilizadores")
@RequiredArgsConstructor
public class EstabilizadorControllerSave {

    private final EstabilizadorSaveService service;

    @PostMapping
    public Estabilizador save(@RequestBody Estabilizador estabilizador){
        return service.save(estabilizador);
    }
}
