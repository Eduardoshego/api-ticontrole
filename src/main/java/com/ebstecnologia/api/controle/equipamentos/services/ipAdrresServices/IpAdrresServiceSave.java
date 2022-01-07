package com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.repositories.IpAdrresRepository;
import com.ebstecnologia.api.controle.equipamentos.services.util.TransformeToString;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IpAdrresServiceSave {

    private final IpAdrresRepository repository;

    public List<IpAdrress> save(){
        for(int i = 1; i < 255; i++){
            IpAdrress ipAdrress = new IpAdrress();
           String ip =  "192.168.20.";
           ipAdrress.setIp(ip + String.valueOf(i));
             repository.save(ipAdrress);
        }
        return repository.findAll();


    }
}
