package com.example.latexmagician;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class HelloController extends HelloApplication{
    @FXML
    private AnchorPane container;
    @FXML
    protected void onAndClick() {
        gates.add(new ANDG("AND Gate",50,50,container));
    }
    @FXML
    protected void onOrClick(){
        gates.add(new ORG("OR Gate",50,50,container));
    }
    @FXML
    protected void onNandClick(){
        gates.add(new NANDG("NAND Gate",50,50,container));
    }
    @FXML
    protected void onNorClick(){
        gates.add(new NORG("NOR Gate",50,50,container));
    }
    @FXML
    protected void onNotClick(){
        gates.add(new NOTG("NOT Gate",50,50,container));
    }
    @FXML
    protected void onXnorClick(){
        gates.add(new XNORG("XNOR Gate",50,50,container));
    }
    @FXML
    protected void onXorClick(){
        gates.add(new XORG("XOR Gate",50,50,container));
    }
}