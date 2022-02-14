package com.ebstecnologia.api.controle.equipamentos.services.util;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.ImpressoraDto;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.impressora.CompartilhamentoImpressoraException;
import com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices.IpAdrresServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ValidationSaveImpressora {

    private final IpAdrresServiceFindById ipAdrresServiceFindById;
    private final ComputadorServiceFindById computadorServiceFindById;
    private final CheckSectorConflit sectorConflit;

    public Impressora validationSave(ImpressoraDto impressoraDto){

        if(impressoraDto.getIpID() != null || impressoraDto.getComputadorId() != null){
            if(impressoraDto.getIpID() != null) {
                Impressora impressora = new Impressora();
                impressora.setIpOrigem(ipAdrresServiceFindById.findById(impressoraDto.getIpID()));
                impressora.setComputador(null);
                impressora.setIpAtual(impressora.getIpOrigem());
                return impressora;

            }
            else{
                sectorConflit.validationImpressora(impressoraDto.getSetorId(), impressoraDto.getSetorId());

                Impressora impressora = new Impressora();

                impressora.setComputador(computadorServiceFindById.findById(impressoraDto.getComputadorId()));
                impressora.setIpOrigem(null);
                impressora.setIpAtual(null);
                return impressora;
            }

        }
        else{
            throw new CompartilhamentoImpressoraException(
                    "É preciso informar ao menos um tipo de compartilhamento de impressoras!"
            );
        }
    }
}
