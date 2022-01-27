package com.ebstecnologia.api.controle.equipamentos.controllers.switchController;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.services.switchService.SwitchServiceUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/switchs")
public class SwitchControllerUpdate {

    private final SwitchServiceUpdate switchServiceUpdate;

    @PutMapping
    public void cadastroUpdate(@RequestBody Integer id, Switch obj){
        switchServiceUpdate.upadateCadastro(id, obj);
    }
}
