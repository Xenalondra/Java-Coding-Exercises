/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;

/**
 *
 * @author Alondra Bio
 */
public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }
    
    //Implement abstract methods
    @Override
    public void makeSound(){
        System.out.println("The dog is barking.\nArf! Arf!");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

}
