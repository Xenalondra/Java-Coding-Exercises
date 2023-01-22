/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraySearching;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class bankingSystem {
    /*BANKING SYSTEM*/
    /**
     * This is where we declared the pin and prompt the user to login
     */
    static Scanner scanner = new Scanner(System.in);
    public static void login() {
        String[] pins = {"1234", "4567", "1032", "2045", "9874"};
        double[] balance = {20_000, 30_000, 45_000, 50_000, 54_000};
        String pin;
        int count = 1;
        System.out.print("Enter pin number : ");
        pin = scanner.nextLine();
        while (searchPin(pins, balance, pin) == false) {
            System.out.println("Incorrect. Try again.");
            System.out.println("Number of tries  : " + count);
            System.out.print("Enter pin number : ");
            pin = scanner.nextLine();
            count++;
            if (count == 3) {
                System.out.println("You attempted to enter wrong pin number 3 times.");
                break;
            }
        }
        
    }

    /**
     * This is for searching if the pin entered is in the array
     * @param pins
     * @param balance
     * @param pin
     * @return 
     */
    public static boolean searchPin(String[] pins, double[] balance, String pin) {
        boolean found = false; int index = 0;
        for (int i = 0; i < pins.length; i++) {
            if (pins[i].equals(pin)) {
                System.out.println("Successfully login!");
                index = i;
                choices(balance[i]);
                found = true;
            }
        }
        return found;
    }
    
    /**
     * This method is for showing the choices/ transactions we can make
     * @param balance 
     */
    public static void choices(double balance) {
        System.out.println("Press 1 - Balance\nPress 2 - Withdraw\nPress 3 - Deposit");
        System.out.print("Press : ");
        int ans = scanner.nextInt(); scanner.nextLine();
        double newBal = 0;
        switch (ans) {
            case 1:
                newBal = balance;
                System.out.printf("Your new balance is PHP %,.2f%n", newBal);
                break;
            case 2:
                newBal = withdraw(balance);
                System.out.printf("Your new balance is PHP %,.2f%n", newBal);
                break;
            case 3:
                newBal = deposit(balance);
                System.out.printf("Your new balance is PHP %,.2f%n", newBal);
                break;
            default:
                System.out.println("Invalid choice");
        }
        anotherTrans(newBal);
    }
    
    /**
     * This method is invoke when we need to make another transaction
     * @param newBal 
     */
    public static void anotherTrans(double newBal) {
        System.out.print("Do you want to do another transaction? (Y / N) : ");
        String ans = scanner.nextLine().toLowerCase();
        if (ans.charAt(0) == 'y') {
            choices(newBal);
        }
    }
    
    /**
     * This method is for the deposit function
     * @param balance
     * @return 
     */
    public static double deposit(double balance) {
        System.out.println("How much would you like to deposit? ");
        System.out.print("Enter deposit amount : ");
        double deposit = scanner.nextDouble(); scanner.nextLine();
        balance += deposit;
        System.out.println("Successful transaction");
        return balance;
    }
    
    /**
     * This method is for withdrawing
     * @param balance
     * @return 
     */
    public static double withdraw(double balance) {
        System.out.println("How much would you like to withdraw? ");
        System.out.print("Enter withdraw amount : ");
        double withdraw = scanner.nextDouble(); scanner.nextLine();
        balance -= withdraw;
        System.out.println("Successful transaction");
        return balance;
    }

}
