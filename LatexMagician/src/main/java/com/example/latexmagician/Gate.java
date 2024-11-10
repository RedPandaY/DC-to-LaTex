package com.example.latexmagician;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Gate {
    private String gateName;
    private double x;
    private double y;
    private double mouseX, mouseY;
    public Gate(String gateName, double x, double y, AnchorPane container) {
        this.gateName = gateName;
        this.x = x;
        this.y = y;
    }
    public String getGateName() {return gateName;}
    public double getX() {return x;}
    public double getY() {return y;}

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    protected void makeDraggable(ImageView imageView) {
        // When the mouse is pressed, capture the current mouse position
        imageView.setOnMousePressed(event -> {
            mouseX = event.getSceneX() - imageView.getLayoutX();
            mouseY = event.getSceneY() - imageView.getLayoutY();
        });

        // While dragging, update the position of the image
        imageView.setOnMouseDragged(event -> {
            imageView.setLayoutX(event.getSceneX() - mouseX);
            imageView.setLayoutY(event.getSceneY() - mouseY);
        });
    }
}
