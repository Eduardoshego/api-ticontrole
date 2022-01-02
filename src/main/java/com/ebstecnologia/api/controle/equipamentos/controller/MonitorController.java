package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Monitor;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monitores")
@AllArgsConstructor
public class MonitorController {

    private final MonitorService service;

    @PostMapping
    public Monitor save(@RequestBody Monitor mon){
        return service.save(mon);
    }
    @GetMapping
    public List<Monitor> list(){
        return service.listMonitor();
    }
    @GetMapping("/id")
    public Monitor findById(@PathVariable Integer id){
        return service.findById(id);
    }
    @PutMapping("/id")
    public void update(@RequestBody Monitor mon,  Integer id){
        service.update(mon, id);
    }
    @DeleteMapping("/id")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
