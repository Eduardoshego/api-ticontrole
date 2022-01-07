package com.ebstecnologia.api.controle.equipamentos.controllers.monitorController;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.services.monitorServices.MonitorServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/monitores/{id}")
public class MonitorControllerFindById {

    private final MonitorServiceFindById monitorService;

    @GetMapping
    public Monitor findById(@PathVariable Integer id){
        return monitorService.findById(id);
    }
}
