package com.ebstecnologia.api.controle.equipamentos.services.estabilizadorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.repositories.EstabilizadorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstbilizadorServiceFindById {

    private final EstabilizadorRepository estabilizadorRepository;

    public Estabilizador findById(Integer id){
        return estabilizadorRepository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Estabilizador não encontrado na base de dados Faça a consulta novamente"
                )
        );
    }
}
