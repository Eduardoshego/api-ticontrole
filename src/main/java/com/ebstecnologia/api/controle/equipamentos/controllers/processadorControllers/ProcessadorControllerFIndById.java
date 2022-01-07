package com.ebstecnologia.api.controle.equipamentos.controllers.processadorControllers;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.services.processadorServices.ProcessadorServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/processadores/{id}")
@RequiredArgsConstructor
public class ProcessadorControllerFIndById {

    private final ProcessadorServiceFindById processadorServiceFindById;

    @GetMapping
    public Processador findById(@PathVariable Integer id){
        return processadorServiceFindById.findById(id);
    }

}
