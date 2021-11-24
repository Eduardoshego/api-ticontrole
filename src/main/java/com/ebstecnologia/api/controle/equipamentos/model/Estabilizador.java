package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Estabilizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String marca;

    @Column
    private String modelo;

    @Column()
    private String patrimonio;

    @Column(nullable = false, name = "num_serie")
    private String numSerie;

    @OneToMany
    private List<Computador> computador;
}
