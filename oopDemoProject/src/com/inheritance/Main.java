/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.inheritance;

/**
 *
 * @author Alondra Bio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Animal animal = new Animal("Blacky", 'F', 2, 2.5, 1.5);
        animal.move();
        animal.eat("Kibbles");
        animal.makeSound("meow", 5);
        animal.display();
        System.out.println();
        Animal animal1 = new Animal(5.0, 3);
        animal1.display();
        System.out.println();
        
        Dog dog1 = new Dog("Brownie", 'M', 6, 5, 2, "Labrador","White","Squeaky");
        dog1.display();
        dog1.move();
        dog1.makeSound("Woof", 5);
    };
    

}
