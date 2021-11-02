package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Switch implements Serializable {

    private final static long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String marca;

    @Column(nullable = false, length = 50)
    private String modelo;

    @Column(name = "quant_portas", nullable = false)
    private int quantPorta;

    @Column
    private boolean gerenciavel = false;

    @OneToMany
    private List<Computador> computadorList;
}
