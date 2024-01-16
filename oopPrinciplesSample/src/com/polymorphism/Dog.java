/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

/**
 *
 * @author Alondra Bio
 */
public class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("Arf Arf!");
    }
    
    void play(){
        System.out.println("I want to play!!");
    }
    
    void admit(){
        System.out.println("Admitting this dog to the clinic");
    }
    
    void whimpers(){
        System.out.println("The dog is whimpering and shaking.");
    }
}
