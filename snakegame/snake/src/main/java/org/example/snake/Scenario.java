package org.example.snake;

import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

public class Scenario{

    private Scene scene;
    private Group root = new Group();
    public Scenario(Stage primaryStage){
        this.scene = new Scene(root, Config.WIDTH,Config.HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake Game - By Lucas Safeno");
        primaryStage.show();
    }
};