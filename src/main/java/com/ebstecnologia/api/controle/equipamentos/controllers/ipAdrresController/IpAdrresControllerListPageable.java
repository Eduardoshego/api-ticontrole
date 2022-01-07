package com.ebstecnologia.api.controle.equipamentos.controllers.ipAdrresController;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices.IpAdressServiceListPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/ips")
@RequiredArgsConstructor
public class IpAdrresControllerListPageable {

    private final IpAdressServiceListPageable service;

    @GetMapping
    public Page<IpAdrress> listPageable(Pageable pageable){
        return service.listPageable(pageable);
    }
}
