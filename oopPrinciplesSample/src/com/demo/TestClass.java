/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo;

/**
 *
 * @author Alondra Bio
 */
public class TestClass {
	String firstName;
	String middleName;
	String lastName;
	String occupation;
	int ID;
	TestClass(){
		this("Mary","Abuela");
	}
	
	TestClass(int ID, String middleName, String occupation){
		this.ID = ID;
		this.occupation = occupation;
		this.middleName = middleName;
	}
	
	TestClass(String firstName, String lastName){
		this(00,"N/A","N/A");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	TestClass(int ID, String firstName, String middleName, String lastName, String occupation){
		this.ID = ID;
		this.occupation = occupation;
		this.middleName = middleName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void display(){
		System.out.println("Student ID : " + ID);
		System.out.println("First Name : " + firstName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Last Name  : " + lastName);
		System.out.println("occupation : " + occupation +"\n");
	}
}
