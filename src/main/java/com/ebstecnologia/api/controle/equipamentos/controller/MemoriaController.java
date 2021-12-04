package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Memoria;
import com.ebstecnologia.api.controle.equipamentos.service.MemoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/memorias")
@RequiredArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
public class MemoriaController {

    private final MemoriaService memoriaService;

    @PostMapping
    public Memoria save(@RequestBody Memoria mem){
        return memoriaService.save(mem);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable  Integer id){
        memoriaService.deleteById(id);
    }
    @GetMapping
    public List<Memoria> findAll(){
        return memoriaService.findAll();
    }

}
