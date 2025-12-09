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
@Table(name = "pets")
@Getter
@Setter
public class PetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private int idade;
    @Column(nullable = false)
    private String sexo;
    @Column(nullable = false)
    private String porte;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String foto;
    @Column(nullable = false)
    private boolean castrado;
    @Column(nullable = false)
    private boolean vacinado;
    @Column(nullable = false)
    private boolean disponivel;
    @Column(nullable = false)
    private Especie especie;

    public PetModel(){

    }
    
    public PetModel(int id, String nome, String tipo, String raca, int idade, String sexo, String porte,
            String descricao, String foto, boolean castrado, boolean vacinado, boolean disponivel, Especie especie) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.porte = porte;
        this.descricao = descricao;
        this.foto = foto;
        this.castrado = castrado;
        this.vacinado = vacinado;
        this.disponivel = disponivel;
        this.especie = especie;
    }

}
