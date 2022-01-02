package com.ebstecnologia.api.controle.equipamentos.services;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import com.ebstecnologia.api.controle.equipamentos.repositories.MonitorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MonitorService {

    private final MonitorRepository repository;

    public Monitor save(Monitor obj){

        return repository.save(obj);

    }
    public List<Monitor> listMonitor(){
        return repository.findAll();
    }
    public Monitor findById(Integer id){
        Optional<Monitor> obj = repository.findById(id);
        return obj.orElseThrow(
                ()-> new MyObjectNotFoundException(
                    "NÃO EXISTE MONITOR COM ESSE ID:" + id
                )
        );
    }
    public void delete(Integer id){
        Monitor obj = findById(id);
        repository.delete(obj);
    }
    public void update(Monitor mon, Integer id){
        Monitor obj = findById(id);
        obj.setComputador(mon.getComputador());
        obj.setMarca(mon.getMarca());
        obj.setModelo(mon.getModelo());
        obj.setNumSerie(mon.getNumSerie());
        repository.save(obj);
    }

}
