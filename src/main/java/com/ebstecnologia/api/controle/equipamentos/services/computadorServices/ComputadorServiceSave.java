package com.ebstecnologia.api.controle.equipamentos.services.computadorServices;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.model.*;
import com.ebstecnologia.api.controle.equipamentos.repositories.ComputadorRepositoy;
import com.ebstecnologia.api.controle.equipamentos.services.*;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.computadorExceptions.MyExceptionSectorConflicts;
import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraFindByIdService;
import com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices.IpAdrresServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.softwareServices.SoftwareServiceFindById;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ComputadorServiceSave {



    private final ComputadorRepositoy repositoy;
    private final ProcessadorService processadorService;
    private final SwitchService switchService;
    private final SetorService setorService;
    private final IpAdrresServiceFindById ipAdrressService;
    private final SoftwareServiceFindById softwareServiceFindById;
    private final ImpressoraFindByIdService impressoraService;

    public Computador save(ComputadorDTO com){

        //Buscando os componentes agregados aos Computadores.
        Processador processador = processadorService.findById(com.getProcessadorId());
        Switch switchObj =  switchService.findById(com.getSwitchId());
        Setor setor = setorService.findById(com.getSetorId());
        IpAdrress ipAdrress = ipAdrressService.findById(com.getIpId());
        Software software = softwareServiceFindById.findByID(com.getSoftwareId());
        Impressora impressora = impressoraService.findById(com.getImpressoraId());


        Computador computador = new Computador();

        computador.setProcessador(processador);
        computador.setASwitch(switchObj);
        computador.setSetor(setor);
        if(computador.getSetor() == impressora.getSetor()){
            computador.setImpressora(impressora);
        }
        else {
            throw new MyExceptionSectorConflicts(
                    "Impressora não pode ser adcionada a um computador em setores diferentes:" +
                            "Setor computador: " + computador.getSetor()
                            + "Setor impressora: " + impressora.getSetor());
        }


        computador.setHostName(computador.getHostName());
        computador.setModelo(com.getModelo());
        computador.setMarca(com.getMarca());
        computador.setIpAdrress(ipAdrress);
        if(computador.getPatrimonio() != null){
            computador.setPatrimonio(computador.getPatrimonio());

        }
        else{
            computador.setPatrimonio("Não informado!");
        }

        return repositoy.save(computador);
    }
}
