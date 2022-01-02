package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class IpAdrress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String ip;

    @OneToOne
    private Computador computador;

    @OneToOne
    private Impressora impressora;
}
