 package com.ebstecnologia.api.controle.equipamentos.services.impressoraServices;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.ImpressoraDto;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.repositories.ImpressoraRepositroy;
import com.ebstecnologia.api.controle.equipamentos.services.setorServices.SetorServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.util.ValidationSaveImpressora;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImpressoraServiceSave {

    private final ImpressoraRepositroy repositroy;
    private final ValidationSaveImpressora validationSaveImpressora;
    private final SetorServiceFindById setorServiceFindById;

    public Impressora save(ImpressoraDto impressoraDto){

        Impressora obj  = validationSaveImpressora.validationSave(impressoraDto);
        Impressora impressora = new Impressora();

        impressora = obj;
        impressora.setSetor(setorServiceFindById.findById(impressoraDto.getSetorId()));
        impressora.setModelo(impressoraDto.getModelo());
        impressora.setMarca(impressoraDto.getMarca());
        impressora.setNumSerie(impressoraDto.getNumeroDeSerie());
        return repositroy.save(impressora);







    }
}
