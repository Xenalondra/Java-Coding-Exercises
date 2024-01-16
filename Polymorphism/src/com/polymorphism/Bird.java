/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

/**
 *
 * @author Alondra Bio
 */
public class Bird extends Animal {
    @Override
    void makeSound(){
        System.out.println("Twit twit!");
    }
    
    void flutter(){
        System.out.println("The bird is anxious and fluttering its wings.");
    }
}
