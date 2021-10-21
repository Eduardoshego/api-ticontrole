package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.service.SetorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/setores")
@RequiredArgsConstructor
public class SetorController {
    private final SetorService setorService;

    @PostMapping
    public Setor save(@RequestBody Setor setor){
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
    public void update(@PathVariable Integer id, @RequestBody Setor setor){
        setorService.update(id , setor);
    }
}
