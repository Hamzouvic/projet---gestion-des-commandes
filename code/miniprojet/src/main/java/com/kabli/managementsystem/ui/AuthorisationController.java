package com.kabli.managementsystem.ui;

import com.kabli.managementsystem.Launch;
import com.kabli.managementsystem.application.AuthenticationLogic;
import com.kabli.managementsystem.dal.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public class AuthorisationController {
    @FXML
    PasswordField password;
    @FXML
    TextField username;

    public void check(ActionEvent actionEvent) throws Exception {
        if (password.getText().isBlank() || username.getText().isBlank()){
            username.requestFocus();
            return;
        }
        new AuthenticationLogic(username.getText(),password.getText());
    }
}
