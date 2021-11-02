package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class PlacaMae implements Serializable {

    private final static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String marca;

    @Column(length = 50)
    private String modelo;

    @OneToMany
    private List<Computador> computadorList;
}