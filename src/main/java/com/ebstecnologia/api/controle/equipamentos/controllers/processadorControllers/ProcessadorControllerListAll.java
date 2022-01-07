package com.ebstecnologia.api.controle.equipamentos.controllers.processadorControllers;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.services.processadorServices.ProcessadorServiceListAll;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/computadores")
@RequiredArgsConstructor
public class ProcessadorControllerListAll {

    private final ProcessadorServiceListAll service;

    public List<Processador> listAll(){
        return service.processadorList();
    }
}
