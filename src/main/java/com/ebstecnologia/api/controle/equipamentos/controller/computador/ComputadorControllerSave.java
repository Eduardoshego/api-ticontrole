package com.ebstecnologia.api.controle.equipamentos.controller.computador;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.service.computador.ComputadorServiceSave;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computadores")
@AllArgsConstructor
public class ComputadorControllerSave {

    private final ComputadorServiceSave serviceSave;

    @PostMapping
    public Computador save(@RequestBody ComputadorDTO dto){
        return serviceSave.save(dto);
    }
}
