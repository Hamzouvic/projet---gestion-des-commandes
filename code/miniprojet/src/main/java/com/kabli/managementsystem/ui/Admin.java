package com.kabli.managementsystem.ui;

import com.kabli.managementsystem.application.CommandeLogic;
import com.kabli.managementsystem.application.FournisseurLogic;
import com.kabli.managementsystem.models.Commande;
import com.kabli.managementsystem.models.Fournisseur;
import com.kabli.managementsystem.ui.components.FournissurController;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

public class Admin implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
