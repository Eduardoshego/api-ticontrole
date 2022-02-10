package com.ebstecnologia.api.controle.equipamentos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Computador implements Serializable {

    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "host_name", nullable = false, length = 40)
    private String hostName;

    @Column(nullable = false, length = 40)
    private String marca;

    @Column(nullable = false, length = 40)
    private String modelo;

    @Column(length = 40)
    private String patrimonio;

    @Column(nullable = false)
    private int armazenamentoRam;

    @Column(nullable = false)
    private String tipoDisco;

    @Column(nullable = false)
    private int capaciDisco;

    @OneToOne(optional = false)
    private IpAdrress ipAdrress;

    @OneToOne
    private Impressora impressora;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;

    @OneToMany
    private List<ServicoPrestado> servicoPrestado;

    @OneToOne(optional = false)
    private Processador processador;

    @ManyToOne
    @JoinColumn(name = "switch_id")
    private Switch aSwitch;

}
