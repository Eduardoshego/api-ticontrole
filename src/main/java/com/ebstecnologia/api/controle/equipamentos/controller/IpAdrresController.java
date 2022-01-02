package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.services.IpAdrressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ips")
@AllArgsConstructor
public class IpAdrresController {

    private final IpAdrressService service;

    @PostMapping
    public IpAdrress save(@RequestBody IpAdrress ipAdrress){
        return service.save(ipAdrress);
    }
    @GetMapping
    public List<IpAdrress> ipAdrressList(){
        return service.ipAdrressList();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
    @GetMapping("/{id}")
    public IpAdrress findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
