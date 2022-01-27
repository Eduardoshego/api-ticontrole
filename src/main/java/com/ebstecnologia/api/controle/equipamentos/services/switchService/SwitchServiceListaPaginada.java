package com.ebstecnologia.api.controle.equipamentos.services.switchService;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.repositories.SwitchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SwitchServiceListaPaginada {

    private final SwitchRepository switchRepository;

    public Page<Switch> listaPaginada(Pageable pageable){
        return switchRepository.findAll(pageable);
    }
}
