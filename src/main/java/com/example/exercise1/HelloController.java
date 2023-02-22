package com.example.exercise1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;

public class HelloController {
    @FXML
    public Button increase;
    public Button decrease;
    public Label number;

    public double num = 0.0;

    public void setIncrease(ActionEvent ev){
        num += 1;
        number.setText(Double.toString(num));
    }

    public void setDecrease(ActionEvent ev){
        num -= 1;
        number.setText(Double.toString(num));
    }

    public void refresh(ActionEvent ev){
        number.setText("0.0");
    }

}