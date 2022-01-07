//package com.ebstecnologia.api.controle.equipamentos.controllers;
//
//import com.ebstecnologia.api.controle.equipamentos.model.Processador;
//import com.ebstecnologia.api.controle.equipamentos.services.ProcessadorService;
//import com.ebstecnologia.api.controle.equipamentos.services.processadorServices.ProcessadorServiceFindById;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api/processadores")
//@AllArgsConstructor
//@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
//public class ProcessadorController {
//
//    private final ProcessadorService processadorService;
//    private final ProcessadorServiceFindById processadorServiceFindById;
//
//    @PostMapping
//    public Processador save(@RequestBody Processador processador){
//        return processadorService.save(processador);
//    }
//    @GetMapping
//    public List<Processador> findAll(){
//        return processadorService.findAll();
//    }
//    @GetMapping("{id}")
//    public Processador findById(@PathVariable Integer id){
//
//        return processadorServiceFindById.findById(id);
//    }
//    @DeleteMapping("{id}")
//    public void deleteById(@PathVariable Integer id){
//        processadorService.deletById(id);
//    }
//}
