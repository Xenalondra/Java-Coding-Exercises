/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     * @throws exceptionhandling.AgeNotValidException
     * @throws java.lang.NumberFormatException
     */
    public static void main(String[] args) throws AgeNotValidException{
        trycatch2();
    }

    private static void trycatch1() {
        //trycatch + tab
        //try block - where you put your code
        try {
            System.out.println("Please enter 2 integer and I will divide it");
            System.out.print("Integer 1: ");
            int num1 = scanner.nextInt();
            System.out.print("Integer 2: ");
            int num2 = scanner.nextInt();
            System.out.println("Quotient: " + (num1 / num2));
        } 
        
        catch(ArithmeticException ae){
            System.out.println("Ops! you cannot divide an integer by zero.");
        }
        
        //catch block - catch exceptions
        catch (Exception ex) {
            //executed if there is an exception
            System.out.println("Invalid input please enter integers only.");
        }
        
        //finally block - always gets executed
        finally{
            System.out.println("Thank you for using our app!");
        }
    }
    
    //example with loop
    public static void trycatch2() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            try {
            //nilalagay ang code na itatry
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Wow, you don't look like " + age);
            check = false; 
        } catch (Exception e) {
            //gagawin if may exception
            System.out.println("Invalid age");
            scanner.nextLine();
        }
        }
    }
    
    //Try with resources
    public static void buffer() {
            try (BufferedReader buffer = new BufferedReader(
                    new InputStreamReader(System.in));){
            System.out.print("Name: ");
            String name = buffer.readLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(buffer.readLine());
            System.out.println("Good morning "+ name);
            System.out.println("Wow, you don't look like "+age);
        } catch (IOException ex) {
            System.out.println("Something went wrong.");
        } catch (NumberFormatException ne){
            System.out.println("Invalid input for age");
        }
    }
    
    //check exception
    public static void method1() throws IOException, NumberFormatException, Exception{
        BufferedReader buffer = new BufferedReader(
                    new InputStreamReader(System.in));
        System.out.print("Age: ");
            int age = Integer.parseInt(buffer.readLine());
            System.out.println("Wow, you don't look like "+age);
    }
    
    public static void method2() throws IOException, NumberFormatException, Exception {
        method1();
    }
    
    //Manual throw (custom exception description/message)
    public static void thowMessage() {
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age > 0) {
            System.out.println("You can now register.");
        } else {
            //manual throw - this will show the stack trace but with a custom message for the exception
            throw new IllegalArgumentException("Ops, you've entered an Invalid Age.");
        }
    }
    
    //User define exception - we created a new class then extends it to exception
    public static void throwSample() throws AgeNotValidException{
        System.out.print("Age: ");
        int age = scanner.nextInt();
        if (age <= 0) {
            throw new AgeNotValidException("Age cannot be zero or negative.");
        } else if (age > 100) {
            throw new AgeNotValidException("Age cannot be greater than 100.");
        } else {
            System.out.println("Wow, you don't look like " + age);
        }
    }
    
    
    //Read a txt file - per line
    public static void bufferReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("cute.txt"));
            String line = br.readLine();
            Thread thread = new Thread();
            while (line != null) {
                //delay thread.sleep(milliseconds)
                thread.sleep(4000);
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found or file is correupted.");
        } catch(Exception e){
        }
    }
    
    //file reader - per byte
    public static void fileReader() {
        try {
            FileReader fileReader = new FileReader("myFile.txt");
            int data = fileReader.read();
            Thread thread = new Thread();
            while (data != -1) {
                thread.sleep(300);
                System.out.print((char)data);
                data = fileReader.read();
            }
            System.out.println();
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException | InterruptedException e){
        }
    }
}
