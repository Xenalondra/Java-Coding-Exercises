/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class polymorphismSample1 {
    
    public static void casting() {
        //Upcasting
        //Type: superclass
        Animal dog = new Dog();
        dog.makeSound();
        
       
        //Downcasting - convert (upcast)
        Dog downCastedDog = (Dog) dog;
        downCastedDog.play();
    }
    
    //Static Binding / early binding / compile time polymorphism
    public static void eat() {
        System.out.println("I am eating now.");
    }
    
    public static void eat(String food) {
        System.out.println("I love eating " + food);
    }
    
    public static void eat(String food, int times) {
        System.out.println("I am eating "+food + " " +times
        + "x a day.");
    }

    public void managePets() {
        Animal pet = selectPet();
        if (pet != null) {
            pet.makeSound();
            admitPet(pet);
        } else {
            System.out.println("Cannot admit unknown animal.");
        }
    }
    
    private Animal selectPet() {
        String[] pets = {"Dog","Cat","Bird","None of the above"};
        String petType = (String)(JOptionPane.showInputDialog(null, 
                "What is your pet?", 
                "PET CLIINIC", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                pets, 
                pets[0]));
        return switch (petType) {
            case "Dog" -> new Dog();
            case "Cat" -> new Cat();
            case "Bird" -> new Bird();
            default -> null;
        };
    }
    
    private void admitPetToClinic(Animal pet){
        if (pet instanceof Dog) {
            System.out.println("Admitting this Dog in the clinic");
            ((Dog) pet).whimpers(); //downcasting
        } else if (pet instanceof Cat petCat) {
            System.out.println("Admitting this Cat in the clinic");
            petCat.scratch();
        } else if (pet instanceof Bird) {
            System.out.println("Admitting this Bird in the clinic");
            ((Bird) pet).flutter();
        } 
    }
    
}
