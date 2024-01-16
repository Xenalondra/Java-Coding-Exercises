/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance;

/**
 *
 * @author Alondra Bio
 */
public class Dog extends Animal {
    String breed;
    String color;
    String favToy;
    
    Dog(String name, char gender,int age, double weight, double height, String breed, String color, String favToy){
        super(name, gender, age, weight, height);
        this.breed = breed;
        this.color = color;
        this.favToy = favToy;
    }
    
    void play(){
        System.out.println(name + " is playing..");
    }
    
    //Overriding
    @Override
    void display(){
        super.display();
        System.out.println("Breed : " + breed);
        System.out.println("Color : " + color);
        System.out.println("Favorite Toy: "+ favToy);
    }
    
    @Override
    void move(){
        System.out.println(name+ " is jumping and wagging its tail.");
    }
}
