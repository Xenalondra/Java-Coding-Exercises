/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.demo;

/**
 *
 * @author Alondra Bio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String message = "Hello";
        print(message);
        message += "World!";
        print(message);
    }

    static void print(String message) {
        System.out.print(message);
        message += " ";
    }

}
