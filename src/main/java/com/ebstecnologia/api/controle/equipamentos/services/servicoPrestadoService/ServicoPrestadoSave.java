package com.ebstecnologia.api.controle.equipamentos.services.servicoPrestadoService;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.ServicoPrestadoDto;
import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.model.ServicoPrestado;
import com.ebstecnologia.api.controle.equipamentos.repositories.ServicoPrestadoRepository;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraFindByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoPrestadoSave {

    private final ServicoPrestadoRepository repository;
    private final ComputadorServiceFindById computadorService;
    private final ImpressoraFindByIdService impressoraService;

    public ServicoPrestado save(ServicoPrestadoDto servDto){

        ServicoPrestado obj =  new ServicoPrestado();

        if (servDto.getComputadorId() != null){
            Computador comp = computadorService.findById(servDto.getComputadorId());
            obj.setComputador(comp);

        }
        else{
            Impressora impressora = impressoraService.findById(servDto.getImpressoraId());
            obj.setImpressora(impressora);
        }

        obj.setDescricao(servDto.getDescricaoServico());
        return repository.save(obj);

    }


}
