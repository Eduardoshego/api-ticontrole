package com.ebstecnologia.api.controle.equipamentos.service.computador;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.repositories.ComputadorRepositoy;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComputadorServiceFindById {

    private final ComputadorRepositoy repositoy;

    public Computador findById(Integer id){
        return repositoy.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Computador não encontrado na base de dados verifique novamente"
                )
        );
    }
}
