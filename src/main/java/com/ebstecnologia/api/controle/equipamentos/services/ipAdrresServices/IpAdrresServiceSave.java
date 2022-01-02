package com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.repositories.IpAdrresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IpAdrresServiceSave {

    private final IpAdrresRepository repository;

    public IpAdrress save(IpAdrress ipAdrress){
        return repository.save(ipAdrress);
    }
}
