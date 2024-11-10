package com.example.latexmagician;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ANDG extends Gate {
      // Fields to store initial mouse position

    public ANDG(String gateName, double x , double y, AnchorPane container) {
        super(gateName, x, y, container);

        // Load the AND gate image
        Image gate = new Image("and.png");
        ImageView imageView = new ImageView(gate);

        imageView.setLayoutX(x);
        imageView.setLayoutY(y);

        // Add the imageView to the container
        container.getChildren().add(imageView);

        // Enable dragging for this ImageView
        makeDraggable(imageView);
    }

    // Method to make the ImageView draggable

}