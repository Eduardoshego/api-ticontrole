package com.ebstecnologia.api.controle.equipamentos.services.monitorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.repositories.MonitorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import com.ebstecnologia.api.controle.equipamentos.services.util.MessageNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonitorServiceFindById {

    private final MonitorRepository monitorRepository;
    private final MessageNotFound msg;

    public Monitor findById(Integer id){
        return monitorRepository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Monitor" + msg.getMessage()
                )
        );
    }
}
