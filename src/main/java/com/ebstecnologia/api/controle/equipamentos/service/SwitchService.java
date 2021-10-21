package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.repositories.SwitchRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class SwitchService {

    private final SwitchRepository switchRepository;

    public Switch save(Switch service){
        return switchRepository.save(service);
    }
    public Switch findById(Integer id){
        return switchRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException
                        (HttpStatus.NOT_FOUND,"Switch não encontradeo"));
    }
    public void deleteById(Integer id){
        switchRepository.deleteById(id);
    }
    public List<Switch> findAll(){
        return switchRepository.findAll();
    }
}
