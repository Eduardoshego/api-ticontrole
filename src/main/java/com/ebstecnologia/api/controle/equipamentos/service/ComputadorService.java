package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ComputadorDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.model.Memoria;
import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.repositories.ComputadorRepositoy;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class ComputadorService {

    private final ComputadorRepositoy computadorRepositoy;
    private final ProcessadorService processadorService;
    private final MemoriaService memoriaService;
    private final SwitchService switchService;

    public Computador save(ComputadorDTO comp){
        Memoria objMem = memoriaService.findById(comp.getMemoriaId());
        Processador objProcess = processadorService.findById(comp.getProcessadorId());
        Switch objSw = switchService.findById(comp.getSwitchId());
        Computador computador = new Computador();

        computador.setNomeComputador(comp.getNomeComputador());
        computador.setMarca(comp.getMarca());
        computador.setIp(comp.getIp());
        computador.setModelo(comp.getModelo());
        computador.setMemoria(objMem);
        computador.setProcessador(objProcess);
        computador.setASwitch(objSw);
        return computadorRepositoy.save(computador);
    }
    public void deleteById(Integer id){
        computadorRepositoy.deleteById(id);
    }
    public List<Computador> findAll(){
        return computadorRepositoy.findAll();
    }
    public Computador findById(Integer id){
        return computadorRepositoy.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Computador não encontrado com esse id"));
    }
    public void update(Integer id,  Computador comp){
        computadorRepositoy.findById(id)
                .map(
                        computador -> {
                            comp.setId(computador.getId());
                            return computadorRepositoy.save(comp);
                        }
                )
                .orElseThrow(
                        ()-> new ResponseStatusException(
                                HttpStatus.NOT_FOUND
                        )
                );
    }
}
