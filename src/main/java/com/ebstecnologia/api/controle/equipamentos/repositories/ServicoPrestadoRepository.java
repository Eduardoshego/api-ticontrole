package com.ebstecnologia.api.controle.equipamentos.repositories;

import com.ebstecnologia.api.controle.equipamentos.model.ServicoPrestado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer> {

    @Query("select s from ServicoPrestado s join s.computador c "
            + " where upper (c.hostName) like upper( :nome ) and MONTH(s.data) =:mes ")
    List<ServicoPrestado> findByNomeAndMes(@Param("nome") String nome, @Param("mes") Integer mes);
}
