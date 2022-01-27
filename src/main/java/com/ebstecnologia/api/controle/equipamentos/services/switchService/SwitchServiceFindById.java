package com.ebstecnologia.api.controle.equipamentos.services.switchService;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.repositories.SwitchRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SwitchServiceFindById {

    private final SwitchRepository switchRepository;

    public Switch findById(Integer id) {
        return switchRepository.findById(id).
                orElseThrow(
                        () -> new MyObjectNotFoundException(
                                "Nenhum registro foi recuperado com esse id:" + id + "informa a consulta novamente"
                        )
                );
    }
}
