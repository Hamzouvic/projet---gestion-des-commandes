package com.kabli.managementsystem.application;

import com.kabli.managementsystem.models.Fournisseur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class FournisseurLogic {
    ObservableList<Fournisseur> fournisseursData;
    com.kabli.managementsystem.dal.Fournisseur fournisseur;
    public FournisseurLogic(){
        fournisseur = new com.kabli.managementsystem.dal.Fournisseur();
    }
    public ObservableList<Fournisseur> getFournisseur() throws SQLException {

        ResultSet resultSet = fournisseur.getFournisseurs();
        fournisseursData = FXCollections.observableArrayList();
        while(resultSet.next()){


            Fournisseur f = new Fournisseur();
            f.setCodeFournisseur(resultSet.getInt("code_fournisseur"));
            f.setCompte(resultSet.getInt("num_compte"));
            f.setNom(resultSet.getString("nom_fournisseur"));
            f.setTel(resultSet.getInt("num_tel"));
            fournisseursData.add(f);
        }
        return fournisseursData;
    }
    public Fournisseur getFournisseur(int id) throws SQLException {
        fournisseursData = getFournisseur();
        for (Fournisseur f: fournisseursData) {
            if(f.getCodeFournisseur() == id){
                return f;
            }

        }
        return null;
    }
    public void deleteFournisseur(Fournisseur f) throws SQLException {
        fournisseur.deleteFournisseur(f.getCodeFournisseur());
    }

    public void updateFournisseur(Fournisseur selectedItems) throws SQLException {
        fournisseur.updateFournisseur(selectedItems.getCodeFournisseur(),selectedItems.getNom(),selectedItems.getCompte(),selectedItems.getTel());
    }

    public void addFournisseur(Fournisseur f) throws SQLException {
        fournisseur.createFournisseur(f.getCodeFournisseur(),f.getNom(),f.getCompte(),f.getTel());
    }
}
