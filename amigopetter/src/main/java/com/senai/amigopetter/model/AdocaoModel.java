package com.senai.amigopetter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "adocao")
@Getter
@Setter
public class AdocaoModel {
    private int id;
    private AdotanteModel adotante;
    private DoadorModel doador;
    private PetModel pet;
    private String dt_adocao;
    //private enum status_adocao;
    private String motivo_adotante;
    private String motivo_doador;
    private String observacoes;

    public AdocaoModel(){

    }
    
    public AdocaoModel(int id, AdotanteModel adotante, DoadorModel doador, PetModel pet, String dt_adocao,
            String motivo_adotante, String motivo_doador, String observacoes) {
        this.id = id;
        this.adotante = adotante;
        this.doador = doador;
        this.pet = pet;
        this.dt_adocao = dt_adocao;
        this.motivo_adotante = motivo_adotante;
        this.motivo_doador = motivo_doador;
        this.observacoes = observacoes;
    }

}
