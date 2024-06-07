package com.example.piedrapapeltijera;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the movement of player 1 (R, P, or S): ");
        String playernumber1 = scanner.nextLine();

        System.out.println("Enter the movement of player 2 (R, P, or S): ");
        String playernumber2 = scanner.nextLine();

        if (playernumber1.equals(playernumber2)) {
            System.out.println("  It's a Tie  ");
        } else if ((playernumber1.equals("R") && playernumber2.equals("S")) ||
                (playernumber1.equals("P") && playernumber2.equals("R")) ||
                (playernumber1.equals("S") && playernumber2.equals("P"))) {
            System.out.println("  !Player 1 wins!  ");
        } else {
            System.out.println("  !Player 2 wins!  ");
        }
    }
}