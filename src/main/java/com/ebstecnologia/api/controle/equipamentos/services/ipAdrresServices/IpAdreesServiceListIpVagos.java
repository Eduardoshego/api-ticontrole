package com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.repositories.IpAdrresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class IpAdreesServiceListIpVagos {
    
    private final IpAdrresRepository repository;
    
    public Stream<IpAdrress> listIpVagos(){
       return repository.findAll().stream().filter(ipAdrress -> ipAdrress.getComputador()== null);
    }
}
