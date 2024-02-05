/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.threads;

/**
 *
 * @author Alondra Bio
 */
public class ThreadsSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printNumbers();
    }
    
    public static void printNumbers() {
        // Create two threads, each printing numbers from 1 to 5
        PrintNumbers thread1 = new PrintNumbers(1, 5);
        PrintNumbers thread2 = new PrintNumbers(1, 5);

        // Set thread names for better identification
        thread1.setName("Thread A");
        thread2.setName("Thread B");

        // Start both threads
        thread1.start();
        thread2.start();
    }
    
}
