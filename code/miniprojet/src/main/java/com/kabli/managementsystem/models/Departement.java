package com.kabli.managementsystem.models;

public class Departement {
    private int codeDep;
    private String intitule;
    private String nom;

    public int getCodeDep() {
        return codeDep;
    }

    public void setCodeDep(int codeDep) {
        this.codeDep = codeDep;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomChef() {
        return nomChef;
    }

    public void setNomChef(String nomChef) {
        this.nomChef = nomChef;
    }

    public String getPrenomChef() {
        return prenomChef;
    }

    public void setPrenomChef(String prenomChef) {
        this.prenomChef = prenomChef;
    }

    private String nomChef;
    private String prenomChef;
}
