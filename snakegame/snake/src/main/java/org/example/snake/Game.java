package org.example.snake;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        new Scenario(primaryStage);
    }
}