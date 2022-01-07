package com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.repositories.IpAdrresRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import com.ebstecnologia.api.controle.equipamentos.services.util.MessageNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IpAdrresServiceFindById {

    private final IpAdrresRepository ipAdrresRepository;
    private final MessageNotFound messge;

    public IpAdrress findById(Integer id){
        return ipAdrresRepository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                       "Endereço IP" + messge.getMessage()
                )
        );
    }
}
