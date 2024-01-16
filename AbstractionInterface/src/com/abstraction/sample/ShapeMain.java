/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.abstraction.sample;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class ShapeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculateShape();
    }

    private static Shape getShape() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        int choice;
        Shape shape = null;
        do {
            try {
                String menu = """
                      WELCOME!
                      Choose from the option below:
                      1. Circle
                      2. Square
                      3. Rectangle
                      4. Quit
                      """;

                System.out.println(menu); // print menu
                choice = scanner.nextInt(); //choice for the menu
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Radius: ");
                        double rad = scanner.nextDouble();
                        shape = new Circle(rad);
                    }
                    case 2 -> {
                        System.out.print("Enter Side: ");
                        double side = scanner.nextDouble();
                        shape = new Square(side);
                    }
                    case 3 -> {
                        System.out.print("Enter Length: ");
                        double length = scanner.nextDouble();
                        System.out.print("Enter Width: ");
                        double width = scanner.nextDouble();
                        shape = new Rectangle(length, width);
                    }
                    case 4 -> System.out.println("Sad to see you go.");
                    default-> System.out.println("Invalid choice. Please try again.\n");
                }
                if (choice >= 1 && choice <= 4) {
                    validChoice = true;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input, try again.\n");
                scanner.nextLine();
            }
        } while (!validChoice);
        return shape;
    }

    private static void calculateShape() {
        Shape shape = getShape();
        if (shape != null) {
            shape.findArea();
            shape.findPerimeter();
        }
    }

}
