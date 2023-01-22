/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicOperator;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class basicOperator {//opening class
    
    public static void main(String[] args) {//open
   
    }//end main 
    
    public static void addition(){//open
    Scanner input = new Scanner(System.in);
    int num1, num2, result;
        System.out.println("I will add two numbers for you!");
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter a number: ");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.println("The sum is "+result);
    }//end ng method Addittion
    
    public static void subtract(){//open
    Scanner input = new Scanner(System.in);
    int num1, num2, result;
        System.out.println("I will subtract two numbers for you!");
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter a number: ");
        num2 = input.nextInt();
        result = num1 - num2;
        System.out.println("The difference is "+result);
    }//end ng method subtract
    
    public static void multiplication(){//open
    Scanner input = new Scanner(System.in);
    int num1, num2, result;
        System.out.println("I will multiply two numbers for you!");
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter a number: ");
        num2 = input.nextInt();
        result = num1 * num2;
        System.out.println("The product is "+result);
    }//end ng method multiplication
    
    public static void modulus(){//open
    Scanner input = new Scanner(System.in);
    int num1, num2, result;
        System.out.println("I will get the remainder for you!");
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter a number: ");
        num2 = input.nextInt();
        result = num1 % num2; //percent sign
        System.out.println("The remainder is "+result);
    }//end ng method modulo
    
    public static void division(){//open
    Scanner input = new Scanner(System.in);
    double num1, num2, result;
        System.out.println("I will get the quotient for you!");
        System.out.print("Enter a number: ");
        num1 = input.nextDouble();
        System.out.print("Enter a number: ");
        num2 = input.nextDouble();
        result = num1 / num2; //slash
        System.out.println("The quotient is "+result);
    }//end ng method division
    
}//ending class
  