package com.ebstecnologia.api.controle.equipamentos.controllers.monitorController;

import com.ebstecnologia.api.controle.equipamentos.services.monitorServices.MonitorServiceDeleteById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/monitores/{id}")
@RequiredArgsConstructor
public class MonitorControllerDeleteById {

    private final MonitorServiceDeleteById monitorService;

    @DeleteMapping
    public void delete( @PathVariable Integer id) {
        monitorService.deleteById(id);
    }
}
