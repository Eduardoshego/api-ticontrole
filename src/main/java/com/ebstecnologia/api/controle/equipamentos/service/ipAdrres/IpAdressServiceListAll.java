package com.ebstecnologia.api.controle.equipamentos.service.ipAdrres;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.repositories.IpAdrresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IpAdressServiceListAll {

    private final IpAdrresRepository repository;

    public List<IpAdrress> listAll(){
        return repository.findAll();
    }
}
