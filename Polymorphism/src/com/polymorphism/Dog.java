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
    /*
    Dynamic Binding, late binding, runtime polymorphism - 
    The binding of the method call to the method implementation is done at runtime.
    */
    @Override
    void makeSound(){
        System.out.println("Arf Arf!");
    }
    
    void play(){
        System.out.println("I want to play!!");
    }
    
    void whimper(){
        System.out.println("The dog is whimpering in pain.");
    }
            
    void admit(){
        System.out.println("Admitting this dog to the clinic");
    }
}
