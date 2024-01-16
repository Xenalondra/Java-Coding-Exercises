/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inheritance;

/**
 *
 * @author Alondra Bio
 */
public class dog extends animals {
	String breed;
	String color;
	String favToy;
	String behavior;
	
	dog(String name, String type,
		int age, char gender,
		double weight, String breed,
		String color, String favToy,
		String behavior) {
		super(name, type, age, gender, weight);
		this.breed = breed;
		this.color = color;
		this.favToy = favToy;
		this.behavior = behavior;
	}
	
	@Override
	void move(){
		System.out.println(name + 
			" is jumping and wagging its tail.");
	}
	
	@Override
     String displayDetails() {
	     String display = "Breed   : " + breed + "\n" +
	     "Color   : " + color+ "\n" +
	     "Fav Toy : " + favToy+ "\n" +
	     "Behavior: " + behavior + "\n\n";
	     
	     return super.displayDetails() + display;
     }
     
     void play(){
	     System.out.println(name + " is playing his "
		     +favToy+ " toy.");
     }
}
