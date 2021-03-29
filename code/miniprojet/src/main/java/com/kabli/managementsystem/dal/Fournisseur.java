package com.kabli.managementsystem.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fournisseur extends Database{
        public void createFournisseur(int code,String nom,int compte,int tel) throws SQLException {
            PreparedStatement ps = connection.prepareStatement("insert into fournisseur values ("+code+",'"+nom+"',"+compte+","+tel+")");
            ResultSet r = ps.executeQuery();
        }
        public ResultSet getFournisseurs() throws SQLException {
            PreparedStatement ps = connection.prepareStatement("Select * from fournisseur");
            ResultSet r = ps.executeQuery();

            return r;
        }
        public void deleteFournisseur(int id) throws SQLException {
            PreparedStatement ps = connection.prepareStatement("delete from fournisseur where code_fournisseur ="+id);
            ResultSet r = ps.executeQuery();
        }
        public void updateFournisseur(int id,String nom,int compte,int tel) throws SQLException {
            //"update fournisseur set nom_fournisseur = '"+nom+"',num_tel ="+tel+" ,num_compte ="+compte+" where code_fournisseur= "+id
            PreparedStatement ps = connection.prepareStatement("update fournisseur set nom_fournisseur = 'ddd' where code_fournisseur=88888");
            System.out.println();
            ResultSet r = ps.executeQuery();
            System.out.println(r);

        }
}
