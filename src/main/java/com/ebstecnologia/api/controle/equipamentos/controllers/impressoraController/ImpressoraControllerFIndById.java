package com.ebstecnologia.api.controle.equipamentos.controllers.impressoraController;


import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraFindByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/impressoras/{id}")
@RequiredArgsConstructor
public class ImpressoraControllerFIndById {

    private final ImpressoraFindByIdService service;

    @GetMapping
    public Impressora findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
