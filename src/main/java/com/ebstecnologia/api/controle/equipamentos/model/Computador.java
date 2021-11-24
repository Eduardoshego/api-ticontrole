package com.ebstecnologia.api.controle.equipamentos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Computador implements Serializable {

    private final static long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "nome_computador",length = 40)
    @NotEmpty
    private String nomeComputador;

    @Column(nullable = false, length = 50)
    @JsonFormat(pattern = "000.000.000.000")
    private String ip;

    @Column( length = 50)
    @NotEmpty                //Anotation de validação de dados.
    private String marca;

    @ManyToOne
    @JoinColumn(name = "placa_mae_id")
    private PlacaMae placaMae;

    @Column( length = 50)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "processador_ID")
    private Processador processador;

    @ManyToOne
    @JoinColumn(name = "memoria_ID")
    private Memoria memoria;

    @OneToMany
    private List<Servico> servico;

    @OneToOne
    private Switch aSwitch;

    @OneToOne
    private Impressora impressora;

    @ManyToOne
    @JoinColumn(name = "estabilizador_id")
    private Estabilizador estabilizador;

    @OneToOne
    private Monitor monitor;
}
