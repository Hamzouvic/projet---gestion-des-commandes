package com.kabli.managementsystem.models;

public class Fournisseur {
    private int codeFournisseur;
    private String nom;
    private int compte;
    private int tel;

    public Fournisseur(int codeFournisseur, String nom, int compte, int tel) {
        this.codeFournisseur = codeFournisseur;
        this.nom = nom;
        this.compte = compte;
        this.tel = tel;
    }

    public Fournisseur() {
    }

    public int getCodeFournisseur() {
        return codeFournisseur;
    }

    public void setCodeFournisseur(int codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCompte() {
        return compte;
    }

    public void setCompte(int compte) {
        this.compte = compte;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
