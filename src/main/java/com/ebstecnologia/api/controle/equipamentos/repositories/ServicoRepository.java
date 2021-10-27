package com.ebstecnologia.api.controle.equipamentos.repositories;

import com.ebstecnologia.api.controle.equipamentos.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

    @Query("select s from Servico s join s.computador c "
            + " where upper (c.nomeComputador) like upper( :nome ) and MONTH(s.data) =:mes ")
    List<Servico> findByNomeAndMes(@Param("nome") String nome, @Param("mes") Integer mes);
}
