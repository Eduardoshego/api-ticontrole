package com.ebstecnologia.api.controle.equipamentos.services.estabilizadorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.repositories.EstabilizadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstabilizadorSaveService {

    private final EstabilizadorRepository estabRepo;

    public Estabilizador save(Estabilizador obj){
        return estabRepo.save(obj);
    }


}

