package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "memoria")
@Entity
@Data
public class Memoria implements Serializable {

    private final static long serialVersionUID = 1L;
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