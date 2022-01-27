package com.ebstecnologia.api.controle.equipamentos.controllers.switchController;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.services.switchService.SwitchServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/switchs/{id}")
public class SwitchControllerFindById {

    private final SwitchServiceFindById switchServiceFindById;

    @GetMapping()
    public Switch findById(@PathVariable Integer id){
        return switchServiceFindById.findById(id);
    }
}
