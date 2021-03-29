package com.kabli.managementsystem.ui.components;
import com.kabli.managementsystem.Launch;
import com.kabli.managementsystem.ui.BasicViewController;
import javafx.beans.DefaultProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class TableFrame implements Initializable {

    @FXML TableView hi;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hi.getColumns().setAll("col1","col2");
    }

    private void loadData() {
        //hi.getItems().add();
    }

}
