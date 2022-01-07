package com.ebstecnologia.api.controle.equipamentos.repositories;

import com.ebstecnologia.api.controle.equipamentos.model.ProdutoEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoEntradaRepository extends JpaRepository<ProdutoEntrada, Integer> {
}
