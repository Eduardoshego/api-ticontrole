package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "memoria")
@Entity
@Data
public class Memoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String modelo;
    @Column
    private String marca;
    @Column
    private String capacidade;
    @Column
    private String frequencia;

}