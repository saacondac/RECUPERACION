package org.example.robot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {

    public static void main(String[] args) {
        int[] stepsRobot = {10, 5, -2};

        int coordinatex = 0;
        int coordinatey = 0;

        for (int i = 0; i < stepsRobot.length; i++) {
            if (i == 2) {
                coordinatey = coordinatey - stepsRobot[i];
            } else if (i == 0) {
                coordinatey = coordinatey + stepsRobot[i];
            } else {
                coordinatex = coordinatex - stepsRobot[i];
            }
        }
        System.out.println("The final coordinates are: (x: " + coordinatex + ", y: " + coordinatey + ")");
    }
}
