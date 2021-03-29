package com.kabli.managementsystem.ui;

import com.kabli.managementsystem.application.AuthenticationLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdminController {
    @FXML
    public Button disc;

    public void disconnect(ActionEvent actionEvent) throws Exception{
        AuthenticationLogic.disconnect();
    }
}
