/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.inheritance;

/**
 *
 * @author Alondra Bio
 */
public class animals {
	//Instance Variables
	String name;
	String type;
	int age;
	char gender;
	double weight;
	
	//Constructor with user-defined parameters
	animals(String name, String type, int age,char gender,
		double weight){
		this.name = name;
		this.type = type;
		this.age  = age;
		this.gender = gender;
		this.weight = weight;
	}
	//Behaviors / methods
	void eat (String food){
		System.out.println(name 
			+ " is eating " + food);
	}
	
	void move(){
		System.out.println(name + 
			" is moving...");
	}
	
	void makeSound(String sound, int times){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < times; i++) {
			sb.append(sound).append("! ");
		}
		System.out.println(sb);
	}
	
	String displayDetails() {
		String display = "Name    : " + name + "\n" +
		"Type    : " + type + "\n" +
		"Age     : " + age + " years old"+ "\n" +
		"Gender  : " + gender+ "\n" +
		"Weight  : " + weight + "kg"+ "\n";
		return display;
	}
	
}
