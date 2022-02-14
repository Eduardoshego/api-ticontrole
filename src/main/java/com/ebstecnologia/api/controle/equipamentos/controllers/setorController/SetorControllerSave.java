package com.ebstecnologia.api.controle.equipamentos.controllers.setorController;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.services.setorServices.SetorServiceSave;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/setores")
public class SetorControllerSave {

    private final SetorServiceSave service;

    @PostMapping
    public ResponseEntity<Setor> save(@RequestBody Setor obj){
        Setor setor = service.saveSetor(obj);
        return ResponseEntity.status(HttpStatus.OK).body(obj);
    }
}
