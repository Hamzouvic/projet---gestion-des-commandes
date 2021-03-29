package com.kabli.managementsystem.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Commande extends Database {
    public void create(Date date, int fournisseur) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("insert into commande(date_com,code_fournisseur) values ("+date+","+fournisseur+")");
        ResultSet r = ps.executeQuery();
    }
    public ResultSet get() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("Select * from commande");
        ResultSet r = ps.executeQuery();
        return r;
    }
    public void delete(int id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("delete from commande where num_bco ="+id);
        ResultSet r = ps.executeQuery();
    }
    public void update(int id,Date date,int fournisseur) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("update commande set date_com = "+date+",code_fournisseur ="+fournisseur+" where code_bco= "+id);
        ResultSet r = ps.executeQuery();
    }
}
