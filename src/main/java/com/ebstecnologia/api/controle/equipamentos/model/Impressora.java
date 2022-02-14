package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "impressora")
@Data
public class Impressora implements Serializable {

    private final static long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 40)
    private String marca;

    @Column(nullable = false, length = 40)
    private String modelo;

    @Column(name = "num_serie", length = 20)
    private String numSerie;

    @OneToOne
    private IpAdrress ipOrigem;

    @OneToOne
    private IpAdrress ipAtual;

    @OneToOne
    private Setor setorAtual;

    @OneToOne
    private Computador computador;

    @OneToOne
    private Setor setor;

    @OneToMany
    private List<ServicoPrestado> servicoPrestados;
}
