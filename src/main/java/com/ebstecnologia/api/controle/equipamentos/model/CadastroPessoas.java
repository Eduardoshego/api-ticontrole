package com.ebstecnologia.api.controle.equipamentos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@Table(name = "supervisor")
@Entity
@Data
public class CadastroPessoas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    @Column(name = "supervisor_nome",nullable = false, length = 60)
    private String nome;

    @Column(name = "num_telefone",length = 16)
    @JsonFormat(pattern = "(00) 0-0000-0000")
    private String numTelefone;

    @Column(name = "email")
    @Email
    private String email;

    @OneToMany
    private List<Setor> setorList;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;
}