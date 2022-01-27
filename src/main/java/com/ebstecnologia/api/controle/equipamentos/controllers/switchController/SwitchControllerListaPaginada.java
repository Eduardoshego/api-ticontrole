package com.ebstecnologia.api.controle.equipamentos.controllers.switchController;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.services.switchService.SwitchServiceListaPaginada;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/switchs")
public class SwitchControllerListaPaginada {

    private final SwitchServiceListaPaginada switchServiceListaPaginada;

    @GetMapping
    public Page<Switch> listaPaginada(Pageable pageable){
        return switchServiceListaPaginada
                .listaPaginada(pageable);

    }
}
