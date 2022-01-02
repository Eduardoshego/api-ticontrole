package com.ebstecnologia.api.controle.equipamentos.services.monitorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.repositories.MonitorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonitorServiceFindById {

    private final MonitorRepository monitorRepository;

    public Monitor findById(Integer id){
        return monitorRepository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Monitor não encontrado na base de dados! Refaça a pesquisa novamente"
                )
        );
    }
}
