package com.ebstecnologia.api.controle.equipamentos.controllers.impressoraController;

import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/impressoras/{id}")
public class ImpressoraControllerDeleteById {

    private final ImpressoraDeleteService service;

    @DeleteMapping
    public void deleteById(Integer id){
        service.deleteById(id);
    }
}
