package com.kabli.managementsystem.dal;

import javafx.application.Platform;

import java.sql.*;

public class Database {
    protected static Connection connection;

    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean connect(String username,String password){
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",username,password);
            return true;
        } catch (SQLSyntaxErrorException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e){
            System.out.println("sql exception");
            return false;
        }
    }


    public void close() throws SQLException {
        connection.close();
    }
}
