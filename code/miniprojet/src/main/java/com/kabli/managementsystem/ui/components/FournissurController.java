package com.kabli.managementsystem.ui.components;

import com.kabli.managementsystem.application.FournisseurLogic;
import com.kabli.managementsystem.models.Commande;
import com.kabli.managementsystem.models.Fournisseur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.SQLException;
import java.util.Collection;
import java.util.ResourceBundle;

public class FournissurController implements Initializable {
    public TableColumn<Fournisseur,Integer> telCol;
    public TableColumn<Fournisseur,String>  nomCol;
    public TableColumn<Fournisseur,Integer>  compteCol;
    public TableColumn<Fournisseur,Integer>  codeCol;
    public TableView tableView;
    public TextField code;
    public TextField compte;
    public TextField nom;
    public TextField telephone;
    public AnchorPane addFournisseur;
    public Button ajouterButton;
    public Button deleteButton;
    public Button refreshButton;
    public Button updateButton;
    public Button submitButton;
    public Button applyUpdate;

    ObservableList<Fournisseur> fournisseursData = FXCollections.observableArrayList();

    public void loadData(Event event) throws SQLException {
            chargeFournisseur();
    }

    public void chargeFournisseur() throws SQLException {
        fournisseursData = FXCollections.observableArrayList();
        fournisseursData.addAll(new FournisseurLogic().getFournisseur());
        System.out.println(fournisseursData.toString());
        tableView.setItems(fournisseursData);
    }

    public void updateFournisseur(ActionEvent actionEvent) {
        Fournisseur selectedItems = (Fournisseur) tableView.getSelectionModel().getSelectedItem();
        if(selectedItems == null) return;
        submitButton.setVisible(false);
        applyUpdate.setVisible(true);
        code.setText(String.valueOf(selectedItems.getCodeFournisseur()));
        code.setEditable(false);
        telephone.setText(String.valueOf(selectedItems.getCodeFournisseur()));
        compte.setText(String.valueOf(selectedItems.getCodeFournisseur()));
        nom.setText(selectedItems.getNom());
        addFournisseur(actionEvent);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        codeCol.setCellValueFactory(new PropertyValueFactory<Fournisseur,Integer>("codeFournisseur"));
        compteCol.setCellValueFactory(new PropertyValueFactory<Fournisseur,Integer>("compte"));
        nomCol.setCellValueFactory(new PropertyValueFactory<Fournisseur,String>("nom"));
        telCol.setCellValueFactory(new PropertyValueFactory<Fournisseur,Integer>("tel"));
        try {
            chargeFournisseur();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        tableView.setItems(fournisseursData);
        addFournisseur.setVisible(false);
        applyUpdate.setVisible(false);
    }

    public void deleteFournisseur(ActionEvent actionEvent) throws SQLException {
        Fournisseur selectedItems = (Fournisseur) tableView.getSelectionModel().getSelectedItem();
        if(selectedItems == null) return;
        System.out.println(selectedItems.getCodeFournisseur());
        new FournisseurLogic().deleteFournisseur(selectedItems);
        chargeFournisseur();
    }

    public void addFournisseur(ActionEvent actionEvent){
        addFournisseur.setVisible(true);
        ajouterButton.setVisible(false);
        deleteButton.setVisible(false);
        refreshButton.setVisible(false);
    }

    public void creerFournisseur(ActionEvent actionEvent) throws SQLException {
        Fournisseur f = new Fournisseur(Integer.parseInt(code.getText()),nom.getText(),Integer.parseInt(compte.getText()),Integer.parseInt(telephone.getText()));
        new FournisseurLogic().addFournisseur(f);
        chargeFournisseur();
        annulerCreation(actionEvent);
    }

    public void annulerCreation(ActionEvent actionEvent) {
        addFournisseur.setVisible(false);
        ajouterButton.setVisible(true);
        deleteButton.setVisible(true);
        refreshButton.setVisible(true);
        code.setText("");
        telephone.setText("");
        nom.setText("");
        compte.setText("");
    }

    public void appliquerModification(ActionEvent actionEvent) throws SQLException {
        Fournisseur selectedItems = (Fournisseur) tableView.getSelectionModel().getSelectedItem();
        if(selectedItems == null) return;
        System.out.println(selectedItems.getCodeFournisseur());
        new FournisseurLogic().updateFournisseur(selectedItems);
        chargeFournisseur();
        annulerCreation(actionEvent);
    }
}
