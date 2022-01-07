package com.ebstecnologia.api.controle.equipamentos.controllers.computadorController;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceSave;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(ComputadorControllerSave.URL)
@AllArgsConstructor
public class ComputadorControllerSave {

    public final static String URL = "/api/computadores";
    private final ComputadorServiceSave serviceSave;

    @PostMapping
    public Computador save(@RequestBody @Valid ComputadorDTO dto){
        return serviceSave.save(dto);
    }
}
