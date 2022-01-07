package com.ebstecnologia.api.controle.equipamentos.services.ipAdrresServices;

import com.ebstecnologia.api.controle.equipamentos.model.IpAdrress;
import com.ebstecnologia.api.controle.equipamentos.repositories.IpAdrresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class IpAdressServiceListPageable {

    private final IpAdrresRepository repository;

    public Page<IpAdrress> listPageable(Pageable pageable){
        return repository.findAll(pageable);
    }
}
