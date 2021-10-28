package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Cargo;
import com.ebstecnologia.api.controle.equipamentos.service.CargoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cargos")
@AllArgsConstructor
public class CargoController {

    private final CargoService cargoService;

    @PostMapping
    public Cargo save(@RequestBody Cargo cargo){
        return cargoService.save(cargo);
    }
    @GetMapping
    public List<Cargo> findAll(){
        return cargoService.findAll();
    }
    @DeleteMapping
    public void deleteById(Integer id){
        cargoService.deleteById(id);
    }
}
