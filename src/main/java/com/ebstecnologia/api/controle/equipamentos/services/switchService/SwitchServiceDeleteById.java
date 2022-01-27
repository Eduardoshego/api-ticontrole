package com.ebstecnologia.api.controle.equipamentos.services.switchService;

import com.ebstecnologia.api.controle.equipamentos.repositories.SwitchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SwitchServiceDeleteById {

    private final SwitchRepository switchRepository;
    private final SwitchServiceFindById switchFindById;

    public void deleteById(Integer id){
        switchFindById.findById(id);
        switchRepository.deleteById(id);
    }
}
