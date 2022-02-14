package com.ebstecnologia.api.controle.equipamentos.services.util;

import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.computadorExceptions.MyExceptionSectorConflicts;
import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraFindByIdService;
import com.ebstecnologia.api.controle.equipamentos.services.setorServices.SetorServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CheckSectorConflit {

    private final ImpressoraFindByIdService impressoraFindByIdService;
    private final SetorServiceFindById setorServiceFindById;
    private final MessageConflictSetores messageConflictSetores;


    public Impressora validationImpressora(Integer impressoraId, Integer sertorId){

        if(impressoraId != null && sertorId !=null){

            Impressora impressora = impressoraFindByIdService.findById(impressoraId);
            Setor setor = setorServiceFindById.findById(sertorId);

            if(impressora.getSetor() == setor){

                return impressora;
            }
            else{
                 messageConflictSetores.alert(impressora.getSetor().getSetorNome(), setor.getSetorNome());
            }


        }
        return null;
    }
}
