package com.ebstecnologia.api.controle.equipamentos.service.computador;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.model.*;
import com.ebstecnologia.api.controle.equipamentos.repositories.ComputadorRepositoy;
import com.ebstecnologia.api.controle.equipamentos.service.*;
import com.ebstecnologia.api.controle.equipamentos.service.exception.Computador.MyExceptionSectorConflicts;
import com.ebstecnologia.api.controle.equipamentos.service.softwareService.SoftwareServiceFindById;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ComputadorServiceSave {



    private final ComputadorRepositoy repositoy;
    private final ProcessadorService processadorService;
    private final SwitchService switchService;
    private final SetorService setorService;
    private final IpAdrressService ipAdrressService;
    private final SoftwareServiceFindById softwareServiceFindById;
    private final ImpressoraService impressoraService;

    public Computador save(ComputadorDTO com){

        //Buscando os componentes agregados aos Computadores.
        Processador processador = processadorService.findById(com.getProcessadorId());
        Switch switchObj =  switchService.findById(com.getSwitchId());
        Setor setor = setorService.findById(com.getSetorId());
        IpAdrress ipAdrress = ipAdrressService.findById(com.getIpId());
//        Software software = softwareServiceFindById.findByID(com.getSoftwareId());
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
