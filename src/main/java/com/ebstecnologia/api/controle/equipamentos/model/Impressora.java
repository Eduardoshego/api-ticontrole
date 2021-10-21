package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "impressora")
@Data
public class Impressora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 40)
    private String marca;

    @Column(nullable = false, length = 40)
    private String modelo;

    @Column(name = "num_serie", length = 20)
    private String numSerie;

    @Column(name = "ip_origem", nullable = false, length = 14)
    private String ipOrigem;

    @Column(name = "ip_atual", nullable = true, length = 14)
    private String ipAtual = "000.000.000.000";

    @OneToOne
    private Setor setorAtual;

    @OneToOne
    private Computador computador;

    @OneToOne
    private Setor setor;
}
