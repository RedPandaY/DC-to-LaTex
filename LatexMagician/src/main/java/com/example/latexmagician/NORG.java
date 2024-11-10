package com.example.latexmagician;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class NORG extends Gate{
    public NORG(String gateName, double x , double y, AnchorPane container) {
        super(gateName,x,y,container);

        Image gate = new Image("nor.png");
        ImageView imageView = new ImageView(gate);

        imageView.setLayoutX(x);
        imageView.setLayoutY(y);

        // Add the imageView to the container
        container.getChildren().add(imageView);

        // Enable dragging for this ImageView
        makeDraggable(imageView);
    }
}
