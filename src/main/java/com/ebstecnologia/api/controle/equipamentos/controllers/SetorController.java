package com.ebstecnologia.api.controle.equipamentos.controllers;

import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.SetorDTO;
import com.ebstecnologia.api.controle.equipamentos.controllers.DTO.SetorUpdateDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.services.SetorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/setores")
@RequiredArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
public class SetorController {
    private final SetorService setorService;

    @PostMapping
    public Setor save(@RequestBody SetorDTO setor){
        return setorService.save(setor);
    }
    @GetMapping
    public List<Setor> setorList(){
        return setorService.findAll();
    }
    @GetMapping("{id}")
    public Setor findById(@PathVariable Integer id){
        return setorService.findById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody SetorUpdateDTO setor){
        setorService.update(id, setor);
    }
}
