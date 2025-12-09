package com.senai.amigopetter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "especie")
@Getter
@Setter
public class Especie {
    private int id;
    private String nome_especie;
    public Especie(){
        
    }
    public Especie(int id, String nome_especie) {
        this.id = id;
        this.nome_especie = nome_especie;
    }
}
