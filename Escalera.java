package com.example.escalera;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;


public class HelloApplication {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {

                for (int i = 0; i <= number; i++) {
                    for (int j = 0; j < 2 * (number - i); j++) {
                        System.out.print(" ");
                    }
                    if (i == 0) {
                        System.out.println("_");
                    } else {
                        System.out.println("_|");
                    }
                }

            } else if (number < 0) {

                number = -number;
                System.out.println("_");
                for (int i = 1; i <= number; i++) {
                    for (int j = 0; j < 2 * i-1; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("|_");
                }

            } else {
                System.out.println("__");
            }


        }
    }