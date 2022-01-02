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

    //Propriedades do computador

    //Id gerado automaticamente pelo banco auto incremente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Host name do computador na rede
    @Column(name = "host_name", nullable = false, length = 40)
    private String hostName;

    //Marca do fabricante do computador esse campo é obrigatório
    @Column(nullable = false, length = 40)
    private String marca;

    //Modelo do equipamento. Esse campo é obrigatório
    @Column(nullable = false, length = 40)
    private String modelo;

    //Patrimonio registrado para o equipamento. Esse campo e opcional
    @Column(length = 40, nullable = true)
    private String patrimonio;

    //Campo para informar a capacidade de armazenamento da memória ram
    @Column(nullable = false)
    private int armazenamentoRam;

    //Campo para informar o tipo de disco: SSD ou HD
    @Column(nullable = false)
    private String tipoDisco;

    //Campo para informar a capacidade de armazenamento do disco em giga bytes. Campo obrigatório.
    @Column(nullable = false)
    private int capaciDisco;

    // Relacionamentos

    // Agregar um endereço de ip a maquina a ser cadastrada. Campo obrigatório
    @OneToOne(optional = false)
    private IpAdrress ipAdrress;

    // Agregar uma impressora ao computador. Campo opcional
    @OneToOne
    private Impressora impressora;

    // Agregar um setor ao computador. Campo obrigatório
    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;

    //Listar os de serviços prestados ao computador. Campo alimentado na criação de um serviço.
    @OneToMany
    private List<ServicoPrestado> servicoPrestado;

    // Agregar um processador ao computador. Campo obrigatório.
    @OneToOne(optional = false)
    private Processador processador;

    // Agregar uma placa mãe ao computador. Campo obrigatorio.
    @OneToOne(optional = false)
    private PlacaMae placaMae;

    // Lista de softwares agregados ao computador.
    @OneToMany
    private List<Software> softwareList;

    @OneToOne
    private Switch aSwitch;


}
