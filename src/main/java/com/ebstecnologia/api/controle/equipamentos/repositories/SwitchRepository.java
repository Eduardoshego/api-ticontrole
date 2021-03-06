package com.ebstecnologia.api.controle.equipamentos.repositories;

import com.ebstecnologia.api.controle.equipamentos.model.Switch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchRepository extends JpaRepository<Switch, Integer> {
}
