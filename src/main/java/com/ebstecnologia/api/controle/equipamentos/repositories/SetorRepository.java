package com.ebstecnologia.api.controle.equipamentos.repositories;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Integer> {
}
