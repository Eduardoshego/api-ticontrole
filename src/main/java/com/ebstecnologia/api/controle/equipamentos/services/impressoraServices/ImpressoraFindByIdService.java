package com.ebstecnologia.api.controle.equipamentos.services.impressoraServices;

import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.repositories.ImpressoraRepositroy;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImpressoraFindByIdService {

    private final ImpressoraRepositroy impRepo;

    public Impressora findById(Integer id){
        return impRepo.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Impressora não encontrada na base de dados"
                )
        );
    }
}