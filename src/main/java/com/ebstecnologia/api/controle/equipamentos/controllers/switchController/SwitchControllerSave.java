package com.ebstecnologia.api.controle.equipamentos.controllers.switchController;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.services.switchService.SwitchServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/switchs")
public class SwitchControllerSave {

    private final SwitchServiceSave switchServiceSave;

    @PostMapping
    public Switch salvarCadastro(@RequestBody Switch obj){
        return switchServiceSave.salvarCadastroSwitch(obj);
    }

}
