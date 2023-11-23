package com.example.demo.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProduitDTO {

    private String nom;
    private String description;
    private Float prixTTC;

    @JsonIgnore
    private Float prixHT;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrixTTC() {
        return prixHT * 1.2f;
    }

    public void setPrixTTC(Float prixTTC) {
        this.prixTTC = prixTTC;
    }

    public Float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Float prixHT) {
        this.prixHT = prixHT;
    }
}
