package com.ebstecnologia.api.controle.equipamentos.services.computadorServices;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.controllers.dto.dtoComputador.ComputadorDtoResponse;
import com.ebstecnologia.api.controle.equipamentos.model.*;
import com.ebstecnologia.api.controle.equipamentos.repositories.computadoresRepository.ComputadorRepositoy;
import com.ebstecnologia.api.controle.equipamentos.services.*;
import com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices.IpAdrresServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.processadorServices.ProcessadorServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.util.PatrimonioValidation;
import com.ebstecnologia.api.controle.equipamentos.services.util.CheckSectorConflit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ComputadorServiceSave {



    private final ComputadorRepositoy repositoy;
    private final ProcessadorServiceFindById processadorService;
    private final SwitchService switchService;
    private final SetorService setorService;
    private final IpAdrresServiceFindById ipAdrressService;
    private final CheckSectorConflit impressoraService;
    private final PatrimonioValidation patrimonioValidation;

    public ComputadorDtoResponse save(ComputadorDTO computadorDTO) {

        Setor setor = setorService.findById(computadorDTO.getSetorId());
        IpAdrress ipAdrress =  ipAdrressService.findById(computadorDTO.getIpId());
        Switch switchObj = switchService.findById(computadorDTO.getSwitchId());
        Processador processador = processadorService.findById(computadorDTO.getProcessadorId());
        Impressora impressora = impressoraService.validationImpressora(computadorDTO.getImpressoraId(),setor.getId());

        Computador computador = new Computador();

        computador.setImpressora(impressora);
        computador.setPatrimonio(patrimonioValidation.patrimonioValidation(computadorDTO.getPatrimonio()));
        computador.setMarca(computadorDTO.getMarca());
        computador.setModelo(computadorDTO.getModelo());
        computador.setHostName(computadorDTO.getNomeComputador());
        computador.setArmazenamentoRam(computadorDTO.getQuantRam());
        computador.setASwitch(switchObj);
        computador.setCapaciDisco(computadorDTO.getQuantDisco());
        computador.setTipoDisco(computadorDTO.getTipoDisco());
        computador.setIpAdrress(ipAdrress);
        computador.setSetor(setor);

        Computador obj = repositoy.save(computador);
        ComputadorDtoResponse computadorDtoResponse = new ComputadorDtoResponse();

        computadorDtoResponse.setId(obj.getId());
        computadorDtoResponse.setHostName(obj.getHostName());
        computadorDtoResponse.setIp(ipAdrress.getIp());
        computadorDtoResponse.setNomeSetor(setor.getSetorNome());
        return computadorDtoResponse;




    }
}
