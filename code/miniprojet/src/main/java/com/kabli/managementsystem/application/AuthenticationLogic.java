package com.kabli.managementsystem.application;

import com.kabli.managementsystem.CONSTANTS;
import com.kabli.managementsystem.Launch;
import com.kabli.managementsystem.dal.Database;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.sql.SQLException;

public class AuthenticationLogic {

    // to do haching
    public AuthenticationLogic(String username, String password) throws Exception {
        Database.connect(username, password);
        setScene(CONSTANTS.ADMIN);
    }
    public static void disconnect() throws Exception {
        Database.close();
        setScene(CONSTANTS.AUTH_SCENE);
        System.out.println("disconnected");
    }
    public static Roles getRole() throws SQLException {
        String Role = Database.getPriveledge();
        switch(Role){
            case "DBADMIN":
                return Roles.DBADMIN;

            case "GESTION_INTERNE":
                return Roles.GESTION_INTERNE;

            case "GESTION_EXTERNE":
                return Roles.GESTION_EXTERNE;
            default: return null;
        }
    }

    public static void setScene(String url) throws IOException {
        Parent root = FXMLLoader.load(Launch.class.getResource(url));
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Launch.getScene().setRoot(root);
            }
        });
    }
}
