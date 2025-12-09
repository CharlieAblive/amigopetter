package com.senai.amigopetter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "doadores")
@Getter
@Setter
public class DoadorModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String dt_registro;
    @Column(nullable = false)
    private String dt_update;
    @Column(nullable = false)
    private String dt_nasc;
    @Column(nullable = false)
    private LoginModel login;

    public DoadorModel(){

    }

    public DoadorModel(int id, String nome, String cpf, String telefone, String email, String dt_registro,
            String dt_update, String dt_nasc, LoginModel login) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.dt_registro = dt_registro;
        this.dt_update = dt_update;
        this.dt_nasc = dt_nasc;
        this.login = login;
    }
}
