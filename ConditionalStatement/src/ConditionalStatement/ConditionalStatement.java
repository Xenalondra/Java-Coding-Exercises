/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConditionalStatement;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class ConditionalStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Call the method name here
        
    }//end of main method
    
    public static void oddEven(){
    Scanner in = new Scanner(System.in);
        System.out.print("ODD OR EVEN??\nEnter a number: ");
        int num = in.nextInt();
        if (num%2 == 0) {
            System.out.println("That's an even number!");
        } else {
            System.out.println("That's an odd number!");
        }
    }
    
    public static void checkIntegers(){
       Scanner in = new Scanner(System.in);
        System.out.print("POSITIVE, NEGATIVE or ZERO\nEnter a number: ");
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("The number is POSITIVE");
        } else if (num < 0) {
            System.out.println("The number is NEGATIVE");
        } else {
            System.out.println("The number is ZERO");
        }
    }
    
    public static void largest(){
       Scanner in = new Scanner(System.in);
        System.out.println("Enter three(3) numbers seperated by spaces.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            int largest = num1;
            System.out.println("The largest number is "+largest);
        } else if (num2 >= num1 && num2 >= num3) {
            int largest = num2;
            System.out.println("The largest number is "+largest);
        } else {
            int largest = num3;
            System.out.println("The largest number is "+largest);
        }
    }
    
    public static void largest1(){
       Scanner in = new Scanner(System.in);
        System.out.println("Enter three(3) numbers seperated by spaces.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is "+num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is "+num2);
        } else {
            System.out.println("The largest number is "+num3);
        }
    }
    
    public static void ages(){
    Scanner in = new Scanner(System.in);
        System.out.print("AGES AND STAGES\nEnter your age: ");
        int age = in.nextInt();
        if (age == 0) {
            System.out.println("You are a baby.");
        } else if (age >= 1 || age <= 3){
            System.out.println("You are a toddler.");
        } else if (age >= 4 && age <= 6){
            System.out.println("You are a preschool.");
        } else if (age >= 7 && age <= 12){
            System.out.println("You are a gradeschool.");
        } else if (age >= 13 && age <= 18){
            System.out.println("You are a teenager.");
        } else if (age >= 19 && age <= 21){
            System.out.println("You are a young adult.");
        } else if (age >= 22 && age <= 59){
            System.out.println("You are an adult.");
        } else if (age >= 60 && age <= 90){
            System.out.println("You are a senior.");
        } else if (age >= 91 && age <= 120){
            System.out.println("You are Enrile.");
        } else {
            System.out.println("You entered an invalid age.");
        }
    }
    
    //Nested If
    //Valenzuela
    //17-21 age
    //gwa 85 and above
    public static void scholarship(){
    Scanner in = new Scanner(System.in);
    String name, address; int age; double gwa;
        System.out.println("SCHOLARSHIP APPLICATION FORM");
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.print("Enter your address: ");
        address = in.nextLine();
        String addLowercase = address.toLowerCase();
        System.out.print("Enter your age: ");
        age = in.nextInt();
        System.out.print("Enter your GWA: ");
        gwa = in.nextDouble();
        //contains() check if a String contains a substring
        if (addLowercase.contains("valenzuela")) {
            if (age >= 17 && age <= 21) {
                if (gwa >= 85 && gwa <= 100) {
                    System.out.println("We are pleased to inform that "+name+" is elligible for the scholarship");
                } else {
                    System.out.println("Sorry, your GWA should be 85 and above to qualify.");
                }
            } else {
                System.out.println("Sorry, your age should be 17-21 years old.");
            }
        } else {
            System.out.println("Sorry, you did not qualify for the scholarship.");
        }
        
    }
    
    public static void fortuneTeller(){
    Scanner in = new Scanner(System.in);
    Random rd = new Random();
    String question; boolean answer;
        System.out.println("\f PETER THE FORTUNE TELLER \f");
        System.out.println("Peter, peter, answer my question, lead me to the direction.");
        System.out.println("Ask Peter a question (answerable by yes or no) and don't forget to mention his name (Peter)."
                          + "\nType Your Question:");
        question = in.nextLine();
        answer = rd.nextBoolean(); //generate ng random true or false
        if (question.contains("Peter") && 
            question.contains("?")) {
            System.out.println("Peter is reading the prophecy...");
            if (answer) {
                System.out.println("Peter says YES.");
            } else {
                System.out.println("Peter says NO.");
            }
            
        } else {
            System.out.println("Peter is having a hard time understanding your question.");
        }
    }
    
}//end of class ConditionalStatement
