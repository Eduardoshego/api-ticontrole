package com.ebstecnologia.api.controle.equipamentos.controllers.impressoraController;

import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraPaginatorListService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/impressoras")
public class ImpressoraControllerListPage {

    private final ImpressoraPaginatorListService service;

    @GetMapping
    public Page<Impressora> listPagenade(Pageable page){
        return service.pageList(page);
    }
}
