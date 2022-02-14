package com.ebstecnologia.api.controle.equipamentos.controllers.computadorController;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceFindBySetor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/computadores/find")
@RequiredArgsConstructor
public class ComputadorControllerFindBySetor {

    private final ComputadorServiceFindBySetor computadorServiceFindBySetor;

    @GetMapping
    public List<Computador> findBySetor(@RequestParam(value = "nome", required = false, defaultValue = "") String nome){
        return computadorServiceFindBySetor.listPorSetor(nome);
    }
}
