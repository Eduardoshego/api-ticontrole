package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Setor implements Serializable {

    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "setor_nome", nullable = true, length = 100)
    private String setorNome;

    @Column(name = "e_mail")
    private String email;

    @Column
    private String telefone;

    @Column
    private String ramal;


    @ManyToOne
    @JoinColumn(name = "supervisor_ID")
    private CadastroPessoas supervisor;

    @OneToMany
    private List<ProdutoSaida> produtoSaidaList;

    @OneToMany
    private List<Computador> computadorList;




}
