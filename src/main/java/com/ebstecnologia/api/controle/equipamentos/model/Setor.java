package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Setor {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "setor_nome", nullable = false, length = 100)
    private String setorNome;

    @ManyToOne
    @JoinColumn(name = "supervisor_ID")
    private Supervisor supervisor;

    @OneToMany
    private List<ProdutoSaida> produtoSaidaList;




}
