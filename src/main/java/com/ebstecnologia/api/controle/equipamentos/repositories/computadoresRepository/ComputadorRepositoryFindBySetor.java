package com.ebstecnologia.api.controle.equipamentos.repositories.computadoresRepository;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputadorRepositoryFindBySetor extends JpaRepository<Computador, Integer> {

    @Query("select computador from Computador computador join computador.setor setor where " +
            "upper (setor.setorNome) like upper(:nome) ")
    List<Computador> findBySetor(@Param("nome")String nome);
}
