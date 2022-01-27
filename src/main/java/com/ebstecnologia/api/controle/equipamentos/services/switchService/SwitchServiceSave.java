package com.ebstecnologia.api.controle.equipamentos.services.switchService;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.repositories.SwitchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SwitchServiceSave {

    private final SwitchRepository switchRepository;

    public Switch salvarCadastroSwitch(Switch obj){
        return switchRepository.save(obj);
    }
}
