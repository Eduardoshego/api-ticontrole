package com.ebstecnologia.api.controle.equipamentos.controllers.setorController;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.services.setorServices.SetorServiceListPageable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/setores")
public class SetorControllerFindAll {

    private final SetorServiceListPageable setorServiceListPageable;

    @GetMapping
    public ResponseEntity<Page<Setor>> listPageable(Pageable pageable){
        Page listPageable = setorServiceListPageable.listPageable(pageable);

        return ResponseEntity.status(HttpStatus.OK).body(listPageable);

    }
}
