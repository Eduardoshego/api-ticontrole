package com.ebstecnologia.api.controle.equipamentos.services.monitorServices;

import com.ebstecnologia.api.controle.equipamentos.repositories.MonitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonitorServiceDeleteById {

    private final MonitorRepository monitorRepository;
    private final MonitorServiceFindById monitorServiceFindById;

    public void deleteById(Integer id){
        monitorServiceFindById.findById(id);
        monitorRepository.deleteById(id);
    }
}
