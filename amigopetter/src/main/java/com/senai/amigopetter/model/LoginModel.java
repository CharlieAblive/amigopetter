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
@Table(name = "login")
@Getter
@Setter
public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String usuario;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String senha;

    public LoginModel(){

    }
    
    public LoginModel(int id, String usuario, String email, String telefone, String senha) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
}
