package com.ebstecnologia.api.controle.equipamentos.controllers.monitorController;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.services.monitorServices.MonitorServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/monitores")
@RequiredArgsConstructor
public class MonitorControllerSave {

    private final MonitorServiceSave monitorService;

    @PostMapping
    public Monitor save(@RequestBody Monitor monitor){
        return monitorService.save(monitor);
    }
}
