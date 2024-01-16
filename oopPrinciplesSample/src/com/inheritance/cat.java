/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance;

/**
 *
 * @author Alondra Bio
 */
public class cat extends animals {
	String breed;
	boolean claws;
	String color;
	
     cat(String name, String type,
		int age, char gender,
		double weight, String breed,
		String color, boolean claws) {
	     
		super(name, type, age, gender, weight);
		this.breed = breed;
		this.color = color;
		this.claws = claws;
	}
     
	@Override
     void move(){
		System.out.println(name + 
			" is purring and walking.");
	}
     
	@Override
     String displayDetails() {
	     String display = "Breed   : " + breed + "\n" +
	     "Color   : " + color+ "\n" +
	     "Declawed: " + claws + "\n\n";
	     
	     return super.displayDetails() + display;
     }
}
