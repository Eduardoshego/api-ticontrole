package com.ebstecnologia.api.controle.equipamentos.controllers.switchController;

import com.ebstecnologia.api.controle.equipamentos.services.switchService.SwitchServiceDeleteById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/switchs/{id}")
public class SwitchControllerDeleteById {

    private final SwitchServiceDeleteById switchServiceDeleteById;

    @DeleteMapping
    public void deleteById(@PathVariable Integer id){
        switchServiceDeleteById.deleteById(id);
    }
}
