package com.ebstecnologia.api.controle.equipamentos.services.switchService;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.repositories.SwitchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SwitchServiceUpdate {

    private final SwitchRepository switchRepository;
    private final SwitchServiceFindById switchServiceFindById;

    public void upadateCadastro(Integer id, Switch switchUpdate){
        Switch obj = switchServiceFindById.findById(id);
        obj.setId(id);
        obj = switchUpdate;
        switchRepository.save(obj);

    }
}
