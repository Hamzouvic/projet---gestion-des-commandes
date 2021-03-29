package com.kabli.managementsystem.ui;

import com.kabli.managementsystem.Launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class customClass {
    protected static void loadFxml(String fxmlFile, AnchorPane rootController) throws IOException {
        Parent tb = FXMLLoader.load(Launch.class.getResource(fxmlFile));
        rootController.getChildren().add(tb);
    }
}
