package com.ebstecnologia.api.controle.equipamentos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Table(name = "supervisor")
@Entity
@Data
public class Supervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "supervisor_nome",nullable = false, length = 60)
    private String supervisorNome;

    @Column(name = "num_telefone",length = 16)
    @JsonFormat(pattern = "(00) 0-0000-0000")
    private String numTelefone;

    @OneToMany
    private List<Setor> setorList;
}