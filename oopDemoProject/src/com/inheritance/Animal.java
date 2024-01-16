/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance;

/**
 *
 * @author Alondra Bio
 */
public class Animal {
    //Attributes / instance variable / fields
    String name;
    char gender;
    int age;
    double weight;
    double height;
    
    //cannot be Static, no return type
    Animal(String name, char gender,
            int age, double weight, double height){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    //Overloading - 2 or more methods with same name but different parameters.
    Animal(double weight, double height){
        this("n/a", 'm', 0);
        this.height = height;
        this.weight = weight;
    }
    
    Animal(String name, char gender,
            int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    //Methods / behavior
    void display(){
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age    : " + age);
        System.out.println("Weight : " + weight);
        System.out.println("Height : " + height);
    }
    
    void eat(String food){
        System.out.println(name + " is eating "+food+".");
    }
    
    void move(){
        System.out.println(name + " is moving...");
    }
    
    void makeSound(String sound, int times){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(sound).append("! ");
        }
        System.out.println(sb);
    }
}
