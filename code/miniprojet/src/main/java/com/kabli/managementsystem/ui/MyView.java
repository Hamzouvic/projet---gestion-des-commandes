package com.kabli.managementsystem.ui;

import com.kabli.managementsystem.CONSTANTS;
import com.kabli.managementsystem.application.AuthenticationLogic;
import com.kabli.managementsystem.application.Roles;

import java.sql.SQLException;

public abstract class MyView {
    final protected String[] admin_tabs = {"commande"};
    final protected String[] interne_tabs = {"fournisseur","commande"};
    final protected String[] externe_tabs = {"fournisseur","commande"};
    protected Roles role;
    protected String[] components;
    protected String[] active_tabs;

    {
        try {
            role = AuthenticationLogic.getRole();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (role == Roles.DBADMIN) {
            components = new String[]{
                    CONSTANTS.PRODUIT_COMPONENT
            };
            active_tabs = admin_tabs;
        }else if (role == Roles.GESTION_INTERNE){
            components = new String[]{
                    "/com/kabli/managementsystem/ui/components/fournisseur.fxml",
                    "/com/kabli/managementsystem/ui/components/commande.fxml"
            };
            active_tabs = admin_tabs;
        }else if (role == Roles.GESTION_EXTERNE){
            components = new String[]{
                    "/com/kabli/managementsystem/ui/components/fournisseur.fxml",
                    "/com/kabli/managementsystem/ui/components/commande.fxml"
            };
            active_tabs = admin_tabs;
        }
    }
}
