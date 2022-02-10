package com.ebstecnologia.api.controle.equipamentos.repositories.computadoresRepository;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadorRepositoy extends JpaRepository<Computador, Integer> {


}
