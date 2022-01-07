package com.ebstecnologia.api.controle.equipamentos.controllers.ipAdrresController;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices.IpAdrresServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/ips")
@RequiredArgsConstructor
public class IpAdrresControllerSave {

    private final IpAdrresServiceSave service;

    @PostMapping
    public IpAdrress save(IpAdrress ipAdrress){
        return service.save(ipAdrress);
    }

}
