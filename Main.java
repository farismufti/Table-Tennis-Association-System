package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TableTennisSystemGUI.fxml"));
        primaryStage.setTitle("Table Tennis Association Scoring and Management System");
        primaryStage.setScene(new Scene(root, 689, 489));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
