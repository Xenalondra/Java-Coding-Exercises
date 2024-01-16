/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.inheritance;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class mainClass {

	
	
	ArrayList<animals> animalList = new ArrayList<>(){{
	add(new cat("Ming","Omnivore",2,'F',3,"Siamese","Gray",false));
	add(new dog("Doggie","Omnivore",5,'F',8,"Husky","Gray","Squeaky","Friendly"));
	}};
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		mainClass mainObj = new mainClass();
		mainObj.menuPage();
	}
	
	private void menuPage() {
		String[] options = {"View","Admit","Quit"};
		int choice = JOptionPane.showOptionDialog(null, 
			"Welcome to Torres' Vet Clinic. \nWhat would you like to do?",
			"TORRES VET CLINIC", 0, JOptionPane.QUESTION_MESSAGE, null, 
			options, options[0]);
		
		switch (choice) {
			case 0:
				viewPatients();
				break;
			case 1:
				admitPatient();
				break;
			case 2:
				quit();
				break;
		}
	}
	
	
	public static void overriding() {
		cat cat1 = new cat("Ming","Omnivore",2,'F',3,
			"Siamese","Gray",false);
		dog dog1 = new dog("Doggie","Omnivore",5,'F',8,
			"Husky","Gray","Squeaky","Friendly");
		cat1.eat("Salmon");
		cat1.move();
		cat1.makeSound("Meow", 5);
		System.out.println(cat1.displayDetails());
		dog1.eat("Steak");
		dog1.move();
		dog1.makeSound("woof", 10);
		dog1.play();
		System.out.println(dog1.displayDetails());
	}
	
//	public static void wConstructor() {
//		dog dog1 = new dog("Brownie","Omnivore",5,'M',6.8);
//		cat cat1 = new cat("Ming","Omnivore",2,'F',3);
//		dog1.displayDetails();
//		System.out.println();
//		cat1.displayDetails();
//	}
	
	/*
	public static void woConstructor() {
		animals animal1 = new animals();
		animal1.name = "Doggie";
		animal1.gender = 'M';
		animal1.type = "Omnivore";
		animal1.age = 3;
		animal1.weight = 6;
		animal1.displayDetails();
		animal1.eat("Steak");
		animal1.move();
		animal1.makeSound("Arf", 5);
		System.out.println();
		//new object for cat class
		cat cat1 = new cat();
		cat1.name = "mingming";
		cat1.gender = 'F';
		cat1.type = "Omnivore";
		cat1.age = 2;
		cat1.weight = 4.5;
		cat1.displayDetails();
		cat1.eat("Salmon");
		cat1.move();
		cat1.makeSound("Meow", 1);
	}*/

	private void viewPatients() {
		StringBuilder build = new StringBuilder();
		for (animals patients : animalList) {
			//instanceof - to determine the object type
			if (patients instanceof dog) {
				build.append("PET TYPE : DOG\n").
				append(patients.displayDetails());
			} else {
				build.append("PET TYPE : CAT\n").
				append(patients.displayDetails());
			}
		}
		JOptionPane.showMessageDialog(null, build.toString());
		menuPage();
	}

	private void admitPatient() {
		String[] pets = {"Dog","Cat"};
		String pet = (String) JOptionPane.showInputDialog(null, 
			"What pet did you bring?", "PET TYPE",
			JOptionPane.QUESTION_MESSAGE, null, pets, pets[0]);
		String name = JOptionPane.showInputDialog(null, "Name");
		String gender = JOptionPane.showInputDialog(null, "Gender");
		String type = JOptionPane.showInputDialog(null, "Type");
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Age"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null, 
			"Weight"));
		String breed = JOptionPane.showInputDialog(null, "Breed");
		String color = JOptionPane.showInputDialog(null, "Color");
		
		switch (pet) {
			case "Dog":
				String toy = JOptionPane.showInputDialog(null, 
					"Favorite Toy");
				String behavior = JOptionPane.showInputDialog(null, 
					"Behior");
				//new cat("Ming","Omnivore",2,'F',3,"Siamese","Gray",false
				animalList.add(new dog(name,type,age, gender.charAt(0),
					weight,breed, color,toy,behavior));
				break;
			case "Cat":
				boolean claw = false;
				int declawed = JOptionPane.showConfirmDialog(null, 
					"Is your cat declawed?", "", 
					JOptionPane.YES_NO_OPTION);
				if(declawed == 0) claw = true;
				animalList.add(new cat(name,type,age, gender.charAt(0),
					weight,breed, color,claw));
				break;
		}
		viewPatients();
	}

	private void quit() {
		int confirm = JOptionPane.showConfirmDialog(null, 
			"Are you sure you want to exit?","TORRES VET CLINIC", 
			JOptionPane.YES_NO_OPTION);
		if(confirm == 0) JOptionPane.showMessageDialog(null, "Bye");
		else menuPage();
	}
}
