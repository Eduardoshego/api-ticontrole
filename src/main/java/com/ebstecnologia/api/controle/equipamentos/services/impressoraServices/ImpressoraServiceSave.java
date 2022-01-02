package com.ebstecnologia.api.controle.equipamentos.services.impressoraServices;

import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.repositories.ImpressoraRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImpressoraServiceSave {

    private final ImpressoraRepositroy impRepo;

    public Impressora save(Impressora imp){

        return impRepo.save(imp);
    }
}
