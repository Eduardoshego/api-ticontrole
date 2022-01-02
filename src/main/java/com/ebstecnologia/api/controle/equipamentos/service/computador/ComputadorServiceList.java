package com.ebstecnologia.api.controle.equipamentos.service.computador;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.repositories.ComputadorRepositoy;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ComputadorServiceList {

    private final ComputadorRepositoy repositoy;

    public Page<Computador> list(Pageable pageable){
        return repositoy.findAll(pageable);
    }
}
