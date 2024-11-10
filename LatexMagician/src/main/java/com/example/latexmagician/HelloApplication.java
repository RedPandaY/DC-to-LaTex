package com.example.latexmagician;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    ArrayList<Gate> gates = new ArrayList<>();
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setTitle("Latex Magician");
        Image andG = new Image("and.png");
        Image orG = new Image("or.png");
        Image notG = new Image("not.png");
        Image xorG = new Image("xor.png");
        Image xnorG = new Image("xnor.png");
        Image nandG = new Image("nand.png");
        Image norG = new Image("nor.png");
        ImageView andG1 = new ImageView(andG); //what for?
        Scene scene = new Scene(root);
        stage.getIcons().add(andG);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}