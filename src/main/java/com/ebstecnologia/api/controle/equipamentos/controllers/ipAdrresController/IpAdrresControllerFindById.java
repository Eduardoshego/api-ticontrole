package com.ebstecnologia.api.controle.equipamentos.controllers.ipAdrresController;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices.IpAdrresServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ips/{id}")
@RequiredArgsConstructor
public class IpAdrresControllerFindById {

    private final IpAdrresServiceFindById service;

    @GetMapping()
    public IpAdrress findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
