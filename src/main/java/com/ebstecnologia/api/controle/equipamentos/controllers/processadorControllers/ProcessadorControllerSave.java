package com.ebstecnologia.api.controle.equipamentos.controllers.processadorControllers;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.services.processadorServices.ProcessadorServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/processadores")
@RequiredArgsConstructor
public class ProcessadorControllerSave {

    private final ProcessadorServiceSave processadorServiceSave;

    @PostMapping
    public Processador save(@RequestBody Processador processador){
        return processadorServiceSave.save(processador);
    }
}
