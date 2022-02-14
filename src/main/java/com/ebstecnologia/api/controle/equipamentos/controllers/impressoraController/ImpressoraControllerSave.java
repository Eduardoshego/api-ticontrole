package com.ebstecnologia.api.controle.equipamentos.controllers.impressoraController;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.ImpressoraDto;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/impressoras")
@RequiredArgsConstructor
public class ImpressoraControllerSave {

    private final ImpressoraServiceSave service;

    @PostMapping
    public Impressora save(@RequestBody ImpressoraDto impressora){
        return service.save(impressora);
    }
}
