package com.ebstecnologia.api.controle.equipamentos.services.monitorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.repositories.MonitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonitorServiceListPageable {

    private final MonitorRepository monitorRepository;

    public Page<Monitor> listPageable(Pageable pageable){
        return monitorRepository.findAll(pageable);
    }
}
