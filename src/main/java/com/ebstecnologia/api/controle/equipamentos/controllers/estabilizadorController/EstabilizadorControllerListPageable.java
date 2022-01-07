package com.ebstecnologia.api.controle.equipamentos.controllers.estabilizadorController;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.services.estabilizadorServices.EstabilizadorServiceListPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/estabilizadores")
@RequiredArgsConstructor
public class EstabilizadorControllerListPageable {

    private final EstabilizadorServiceListPageable service;

    @GetMapping
    public Page<Estabilizador> listPageable(Pageable pageable){
        return service.listPage(pageable);
    }
}
