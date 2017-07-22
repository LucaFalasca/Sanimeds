package sanimeds;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Sanimeds extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/ui/Home.fxml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
