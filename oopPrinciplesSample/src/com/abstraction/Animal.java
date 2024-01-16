/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;
//Abstract class vs Concrete 
/**
 *
 * @author Alondra Bio
 */
public abstract class Animal { //abstract class
    String name;
    int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //Declare abstract method
    public abstract void makeSound();
    public abstract void eat(String food);
    
    @Override
    public String toString() {
        return "Name: "+ name + "\n" +
                "Age: " + age + "\n";
    }
}
