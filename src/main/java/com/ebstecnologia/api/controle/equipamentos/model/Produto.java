package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Produto implements Serializable {

    private final static long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String descricao;

    @Column(nullable = false)
    private int quantidade;

    @OneToMany
    private List<ProdutoSaida> produtoSaidaList;
}
