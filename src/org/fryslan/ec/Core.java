package org.fryslan.ec;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

/**
 * Created by Piet Jetse Heeringa on 28-2-2016.
 */
public class Core extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        URL location = getClass().getResource("core.fxml");
        System.out.println(location);
        Parent root = FXMLLoader.load(location);
        stage.setScene(new Scene(root));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
