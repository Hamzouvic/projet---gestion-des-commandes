package com.kabli.managementsystem.application;

import com.kabli.managementsystem.models.Commande;
import com.kabli.managementsystem.models.Fournisseur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class CommandeLogic {
    Collection<Commande> commandesData;
    com.kabli.managementsystem.dal.Commande commande;

    public Collection<Commande> getCommandes() throws SQLException {
        ResultSet resultSet = commande.get();
        while(resultSet.next()){
            Commande f = new Commande();
            f.setNum(resultSet.getInt("num_bco"));
            f.setDateCommande(resultSet.getDate("date_com"));
            f.setFournisseur(new FournisseurLogic().getFournisseur(resultSet.getInt("code_fournisseur")));
            commandesData.add(f);
        }
        return commandesData;
    }
}
