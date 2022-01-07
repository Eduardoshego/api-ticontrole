package com.ebstecnologia.api.controle.equipamentos.controllers.ipAdrresController;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices.IpAdrresServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ips")
@RequiredArgsConstructor
public class IpAdrresControllerSave {

    private final IpAdrresServiceSave service;

    @PostMapping
    public List<IpAdrress> save(){
        return service.save();
    }

}
