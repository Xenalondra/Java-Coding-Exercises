/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;

/**
 *
 * @author Alondra Bio
 */
public class Cat extends Animal{
    
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("The cat is making a sound. \nMeow! Meow!");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    
}
