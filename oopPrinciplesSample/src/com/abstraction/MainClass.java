/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Alondra Bio
 */
public class MainClass {
    
    private final int OPTION_CIRCLE = 1;
    private final int OPTION_SQUARE = 2;
    private final int OPTION_RECTANGLE = 3;
    
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        changePassword change = new changePassword("54654654");
        change.getTimeStamp();
        change.process();
        change.hello();
    }
    
    public static void newMethod() {
        //ArithmeticException
        try {
            //Code that you want to check
            System.out.print("Dividend: ");
        int num1 = scanner.nextInt();
        System.out.print("Divisor: ");
        int num2 = scanner.nextInt();
        System.out.println("Qoutient: " + (num1/num2));
        } 
        //catching specific exception - ArithmeticException 
        //ExceptionType identifier
        //shorthand  multi catch block
//        catch (InputMismatchException | ArithmeticException | NullPointerException e) {
//            System.out.println("Invalid input, please check your inputs and try again.");
//        }

        //Multi catch block
        catch (ArithmeticException e) {
            System.out.println("Ops! You cannot divide a number by zero (0)\nError: "+e.getMessage());
        } catch (InputMismatchException e){
            System.out.println(e.getMessage()+"\nPlease input integers only.");
        } catch (Exception e){
            System.out.println("Ops! We encountered an error: " + e.getMessage());
        } finally { //code that gets executed whether an exception is catch or not
            scanner.close();
            System.out.println("Thank you, goodbye");
        }
    }
    private Shape getShape(){
        int choice;
        boolean validChoice = false;
        Shape shape = null;
        String menu = """
                      SHAPE CALCULATOR
                      1. Circle
                      2. Square
                      3. Rectangle
                      """;
        do { 
            try {
            System.out.print(menu + "\nSelect: ");
            choice = scanner.nextInt();
            switch (choice) {
                case OPTION_CIRCLE -> {
                    System.out.print("Radius : ");
                    double rad = scanner.nextDouble();
                    shape = new Circle(rad);
                }
                case OPTION_SQUARE -> {
                    System.out.print("Sides : ");
                    double sides = scanner.nextDouble();
                    shape = new Square(sides);
                }
                case OPTION_RECTANGLE -> {
                    System.out.print("Length : ");
                    double length = scanner.nextDouble();
                    System.out.print("Width : ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                }
                default -> System.out.println("Invalid choice, please try again");
            }
            if (choice >=1 && choice <= 3) {
                validChoice = true;
            }
            
            //Super class "Exception" (polymophism)
            } catch (Exception e) {
                System.out.println("Invalid Input, please try again.");
                scanner.nextLine();
            }
        } while (!validChoice);
        return shape;
    }

    private void calculateShape(){
        try {
             Shape shape = getShape();
        if (shape!=null) {
            shape.calculateArea();
            shape.calculatePerimeter();
        }
        } catch (Exception e) {
        }
    }
    
    public static void sample1() {
        //Abstract class cannot be instantiated

        //Animal animal = new Animal();
        Animal doggie = new Dog("doggie", 3);

        doggie.makeSound();
        doggie.eat("dog food.");

        System.out.println(doggie);
    }

}
