package com.ebstecnologia.api.controle.equipamentos.services;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import com.ebstecnologia.api.controle.equipamentos.repositories.SwitchRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
                .orElseThrow(()-> new MyObjectNotFoundException(
                        "Switch não encontrado com esse id: " + id));
    }
    public void deleteById(Integer id){
        switchRepository.deleteById(id);
    }
    public List<Switch> findAll(){
        return switchRepository.findAll();
    }
}
