package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label seasonLabel;

    @FXML
    void handleClick() {
        System.out.println("Hello!!!");
    }

    @FXML
    private void initialize() {

    }
}
