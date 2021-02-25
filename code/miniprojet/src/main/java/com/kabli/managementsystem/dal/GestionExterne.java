package com.kabli.managementsystem.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionExterne extends Database {
    public GestionExterne(){

    }

    public static void getPersonnes() throws SQLException {
        Statement ps = connection.createStatement();
        ResultSet rs = ps.executeQuery("select table_name from user_tables");
        try {
            int i =0;
            while (rs.next()) {
                System.out.println(++i + " :" +rs.getString("table_name"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

}

