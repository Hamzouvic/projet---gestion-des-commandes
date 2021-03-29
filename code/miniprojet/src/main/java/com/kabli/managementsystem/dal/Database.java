package com.kabli.managementsystem.dal;

import javafx.application.Platform;

import javax.xml.crypto.Data;
import java.sql.*;

public class Database {
    protected static Connection connection;
    protected static String username;

    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void connect(String username,String password) throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",username,password);
        } catch (SQLSyntaxErrorException e) {
            e.printStackTrace();
        }
        Database.username = username;
    }

    /***
     *
     * @return
     * @throws SQLException
     */
    public static String getPriveledge() throws SQLException {
        String role = "";
        PreparedStatement ps = connection.prepareStatement("SELECT granted_role FROM USER_ROLE_PRIVS");
        ResultSet r = ps.executeQuery();
        if(r.next()) {
            role= r.getString("granted_role");
        }
        return role;
    }

    public static void close() throws SQLException {
        connection.close();
    }

}
