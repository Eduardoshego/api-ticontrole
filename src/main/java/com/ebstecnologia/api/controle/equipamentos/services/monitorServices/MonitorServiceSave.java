package com.ebstecnologia.api.controle.equipamentos.services.monitorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.repositories.MonitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonitorServiceSave {

    private final MonitorRepository monitorRepository;

    public Monitor save(Monitor monitor){
        return monitorRepository.save(monitor);
    }
}
