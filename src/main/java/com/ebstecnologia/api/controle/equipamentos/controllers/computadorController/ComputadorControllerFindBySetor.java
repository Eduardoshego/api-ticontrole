package com.ebstecnologia.api.controle.equipamentos.controllers.computadorController;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceFindBySetor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/computadores")
@RequiredArgsConstructor
public class ComputadorControllerFindBySetor {

    private final ComputadorServiceFindBySetor computadorServiceFindBySetor;

    public List<Computador> findBySetor(@Param("nome") String nome){
        return computadorServiceFindBySetor.findBySetor(nome);
    }
}
