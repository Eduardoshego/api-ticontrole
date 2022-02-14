package com.ebstecnologia.api.controle.equipamentos.controllers.computadorController;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.controllers.dto.dtoComputador.ComputadorDtoResponse;
import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceSave;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/computadores")
@AllArgsConstructor
public class ComputadorControllerSave {


    private final ComputadorServiceSave serviceSave;

    @PostMapping
    public ComputadorDtoResponse save(@RequestBody  ComputadorDTO dto){
        return serviceSave.save(dto);
    }
}
