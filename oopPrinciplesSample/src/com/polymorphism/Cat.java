/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

/**
 *
 * @author Alondra Bio
 */
public class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println("Meow Meow!");
    }
    
    void scratch(){
        System.out.println("The cat is in distress and is scratching everywhere");
    }
}
