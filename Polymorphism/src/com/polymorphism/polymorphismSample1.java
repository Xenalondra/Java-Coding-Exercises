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
        Animal dog = new Dog();
        dog.makeSound();
       
        //Downcasting
        Dog downCastedDog = (Dog) dog;
        downCastedDog.play();
    }
    
    //Overloading - same method name but different parameters (number of parameters, type)
    //Static Binding, early binding, compile time - The binding of the method call to the method implementation is done at compile time.
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
    
    public void managePets(){
        Animal pet = selectPet();
        if (pet!=null) {
            admitPet(pet);
            pet.makeSound();
        } else {
            System.out.println("Cannot admit unknown animal.");
        }
    }
    
    private Animal selectPet() {
        Animal pet = new Animal();
        String[] pets = {"Dog", "Cat", "Bird", "None of the above"};
        String petType = (String) (JOptionPane.showInputDialog(null,
                "What is your pet?", "PET CLIINIC",
                JOptionPane.QUESTION_MESSAGE, null, 
                pets, pets[0]));
        switch (petType) {
            case "Dog":  return new Dog();
            case "Cat":  return new Cat();
            case "Bird": return new Bird();
            default:     return null;
        }
    }
    
    
    private void admitPet(Animal pet) {
        //instanceof - to check whether the object is an instance of a class
        if (pet instanceof Dog petDog) {
            System.out.println("Admitting this Dog in the clinic");
            petDog.play();
        } else if (pet instanceof Cat petCat) {
            System.out.println("Admitting this Cat in the clinic");
            petCat.scratch();
        } else if (pet instanceof Bird petBird) {
            System.out.println("Admitting this Bird in the clinic");
            petBird.flutter();
        } 
    }
    
     private void admitPetToClinic(Animal pet) {
        //instanceof - to check whether the object is an instance of a class
        switch (pet) {
            case Dog petDog -> {
                System.out.println("Admitting this Dog in the clinic");
                petDog.play();
            }
            case Cat petCat -> {
                System.out.println("Admitting this Cat in the clinic");
                petCat.scratch();
            }
            case Bird petBird -> { 
                System.out.println("Admitting this Bird in the clinic");
                petBird.flutter();
            }
            default -> {
            }
        }
    }
}
