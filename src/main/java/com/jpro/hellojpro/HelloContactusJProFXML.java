package com.jpro.hellojpro;

import com.jpro.webapi.JProApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Font;

public class HelloContactusJProFXML extends JProApplication {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Font.loadFont(
                getClass().getResource("/com/jpro/hellojpro/font/JameelNooriNastaleeq.ttf").toExternalForm(), 0
        );

        //load user interface as FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jpro/hellojpro/fxml/contact-us-urdu.fxml"));
        Scene scene = null;

        try {
            Parent root = loader.load();

            //create JavaFX scene
            scene = new Scene(root);

            ContactusUrduController controller = loader.getController();
            controller.scene = scene;
        } catch (IOException ex) {
            Logger.getLogger(HelloContactusJProFXML.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.setTitle("Contact Us - Hello jPro");
        stage.setScene(scene);

        //open JavaFX window
        stage.show();
    }
}
