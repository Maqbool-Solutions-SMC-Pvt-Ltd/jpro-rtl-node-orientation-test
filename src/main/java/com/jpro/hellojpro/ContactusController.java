package com.jpro.hellojpro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;

public class ContactusController implements Initializable {

    @FXML
    private ToggleGroup group;
    @FXML
    private ComboBox cboFanOf;

    Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cboFanOf.getItems().addAll("jPro", "Gluon", "Javafx", "Java");
    }

    @FXML
    private void btnEngOnAction(ActionEvent event) {
        //load user interface as FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jpro/hellojpro/fxml/contact-us.fxml"));

        try {
            Parent root = loader.load();

            //create JavaFX scene
            scene.setRoot(root);

            ContactusController controller = loader.getController();
            controller.scene = scene;
        } catch (IOException ex) {
            Logger.getLogger(HelloJProFXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnUrduOnAction(ActionEvent event) {
        //load user interface as FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jpro/hellojpro/fxml/contact-us-urdu.fxml"));

        try {
            Parent root = loader.load();

            //create JavaFX scene
            scene.setRoot(root);

            ContactusUrduController controller = loader.getController();
            controller.scene = scene;
        } catch (IOException ex) {
            Logger.getLogger(HelloJProFXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
