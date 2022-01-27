package com.ebstecnologia.api.controle.equipamentos.controllers.monitorController;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.services.monitorServices.MonitorServiceListPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/monitores")
public class MonitorControllerListPageable {

    private final MonitorServiceListPageable monitorService;

    @GetMapping
    public Page<Monitor> listPageable(Pageable pageable){
        return monitorService.listPageable(pageable);
    }
}
