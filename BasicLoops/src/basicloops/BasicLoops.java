/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicloops;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class BasicLoops {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    
    public static void count(){
        System.out.println("Counting numbers from 1-10 using while loop");
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        
        System.out.println("Counting numbers from 1-10 using do while loop");
        int b = 1;
        do {            
            System.out.println(b);
            b++;
        } while (b <= 10);
                
        System.out.println("Counting numbers from 1-10 using for loop");
        for (int c = 1; c <= 10; c++) {
            System.out.println(c);
        }
    }
    
    public static void countdown(){
        System.out.println("Countdown from 10-0 using while loop");
        int a = 10;
        while (a >= 0) {
            System.out.println(a+"!");
            a--;
        }
        
        System.out.println("Countdown from 10-0 using do while loop");
        int b = 10;
        do {            
            System.out.println(b+"!");
            b--;
        } while (b >= 0);
                
        System.out.println("Countdown from 10-0 using for loop");
        for (int c = 10; c >= 0; c--) {
            System.out.println(c+"!");
        }
    }
    
    //Print Hello, Hi, and Hey depending on the number given by the user
    public static void print(){
        System.out.print("How many print do you want? ");
        int num = scanner.nextInt();
        int a = 100;
        while (a <= num) {
            System.out.println(a+".) Hello");
            a++;
        }
        
        //do while "hi" 
        int b = 100;
        do {            
            System.out.println(b +".) Hi");
            ++b;
        } while (b <= num);
        
        //for loop "hey"
        for (int i = 100; i <= num; i++) {
            System.out.println(i+".) Hey");
        }
    }
}