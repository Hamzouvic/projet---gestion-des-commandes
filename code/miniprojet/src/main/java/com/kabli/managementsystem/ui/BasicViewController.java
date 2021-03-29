package com.kabli.managementsystem.ui;


import com.kabli.managementsystem.CONSTANTS;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BasicViewController extends MyView implements Initializable {
    @FXML
    private TabPane root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FXMLLoader loader = new FXMLLoader();
        int i = 0;
        AnchorPane ap = null;

        for (String s: active_tabs) {
            Tab t = new Tab(s);
            try {
                ap = loader.load(getClass().getResource(CONSTANTS.PRODUIT_COMPONENT));
            } catch (IOException e) {
                e.printStackTrace();
            }
            ap.toString();
            t.setContent(new Label("hiii"));
            t.setClosable(false);
            root.getTabs().add(t);
        }
    }


}
