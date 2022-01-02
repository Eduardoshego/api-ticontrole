package com.ebstecnologia.api.controle.equipamentos.services;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.repositories.IpAdrresRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class IpAdrressService {

    private final IpAdrresRepository repository;

    public IpAdrress save(IpAdrress ip){
        return repository.save(ip);
    }
    public List<IpAdrress> ipAdrressList(){
        return repository.findAll();
    }
    public IpAdrress findById(Integer id){
        Optional <IpAdrress> obj = repository.findById(id);
        return obj.orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Ip addres não encontrada na base de dados"
                )
        );
    }
    public void delete(Integer id){
        repository.deleteById(id);
    }
}
