package com.ebstecnologia.api.controle.equipamentos.services.servicoPrestadoService;

import com.ebstecnologia.api.controle.equipamentos.model.ServicoPrestado;
import com.ebstecnologia.api.controle.equipamentos.repositories.ServicoPrestadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoPrestadoServiceListPageable {

    private final ServicoPrestadoRepository repository;

    public Page<ServicoPrestado> listPageable(Pageable pageable){
        return repository.findAll(pageable);
    }
}
