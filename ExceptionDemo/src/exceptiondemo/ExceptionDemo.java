/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptiondemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    }

    //Checked exception (IOException)
    public static void bufferReader() {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.print("Name: ");
            String name = br.readLine();
            System.out.println("Good morning "+name);
        } catch (IOException ex) {}
    }
    
    //Unchecked Exception
    public static void uncheck() {
        //TRY WITH RESOURCES
        try (Scanner scanner = new Scanner(System.in);){
           //code na itetest / ihahandle
        System.out.print("Dividend: ");
        int num1 = scanner.nextInt();
        System.out.print("Divisor: ");
        int num2 = scanner.nextInt();
        System.out.println("Quotient: " + (num1/num2));
        } 
        catch (InputMismatchException e) {
            //Code na gagawin if may naencounter na exception/error
            JOptionPane.showMessageDialog(null, 
                    "Invalid input, please enter a number only.", 
                    "ERROR MESSAGE", 
                    JOptionPane.ERROR_MESSAGE);
        } 
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, 
                    "Cannot divide a number by zero.", 
                    "ERROR MESSAGE", 
                    JOptionPane.ERROR_MESSAGE);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Something went wrong.", 
                    "ERROR MESSAGE", 
                    JOptionPane.ERROR_MESSAGE);
        }
        finally{
            //Executes whether an exception was caught or not
            System.out.println("Thank you for using our app");
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
    
    public static void manualThrow(){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if (age < 0 || age > 100) {
                //manual throw - this will show the stack trace but with a custom message for the exception
                throw new IllegalArgumentException("Age entered is not valid");
            }
    }
    
    public static void customException1(){
        //try with resourcesD
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            //custom exception with message
            if (age < 0)  throw new AgeNotValidException("Age cannot be negative.");
            if (age > 100)throw new AgeNotValidException("Maximum age is 100.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void customException2(){
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if (age < 0 || age > 100) {
                throw new AgeNotValidException();
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //READ FILE
    public static void fileReader1() {
        try {
            Scanner file = new Scanner(new FileReader("songlyrics.txt"));
            String line = file.nextLine();
            while (line != null) {
                Thread.sleep(5000);
                System.out.println(line);
                line = file.nextLine();
            }
        //Shorthand multi-catch block with specific exceptions
        } catch (FileNotFoundException | InterruptedException e) {
            System.out.println("File not found or is corrupted.");
        }
    }
    
    
    public static void fileReader2() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("songlyrics.txt");
            int data = fileReader.read();
            while (data != -1) {
                Thread.sleep(300);
                System.out.print((char)data);
                data = fileReader.read();
            }
        } catch (FileNotFoundException ex) {
        } catch (InterruptedException | IOException ex) {
        } finally {
            try {
                //closing the resources
                //executed regardless of whether an exceptionn is thrown or not
                fileReader.close();
                System.out.println("\n-THE END-");
            } catch (IOException ex) {}
        }
    }
    
    //Java re-thows: Re-throwing the exception means that the method will not 
    //handle the exception and instead will pass the burden on to any method that that calls it.
    //uses the keyword `throws` followed by the exception in the method signature
    public static void fileReader3() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader (new FileReader("songlyrics.txt"));
           String line = br.readLine();
            while (line != null) {
                System.out.println(line); 
                line = br.readLine();
            }
    }
    
    //re-throws: throws exception to other method until it was catch
    public static void methodThatCatch() {
        try {
            fileReader3();
        } catch (IOException ex) {}
    }
}
