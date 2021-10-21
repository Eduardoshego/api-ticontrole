package com.ebstecnologia.api.controle.equipamentos.repositories;

import com.ebstecnologia.api.controle.equipamentos.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
