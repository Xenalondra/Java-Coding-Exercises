/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.main;

//Syntax : import packageName.ClassName;
import com.encapsulation.*;
/**
 *
 * @author Alondra Bio
 */
public class mainClass {

	/**
	 * OOP PRINCIPLES
	 * ENCAPSULATION - encapsulating fields (Making the attributes private) 
	 * to prevent direct access. 
	 * Uses public method (access methods) to access(getter) or 
	 * modify(setter) the encapsulated field.
	 * 
	 * INHERITANCE - creating a new class from an existing class, 
	 * and inheriting its properties and methods.
	 * use the "extends" keyword to create a subclass that inherits from a superclass.
	 * 
	 */
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//Instantiation
		employeeClass employee = new employeeClass();
		employee.setEmpID("E22-0256");
		employee.setName("Vonnie");
		employee.setPosition("Programmer");
		employee.setRate(200);
		employee.setWorkHrs(8);
		System.out.println("Employee ID   : "+ 
			employee.getEmpID());
		System.out.println("Employee Name : "+ 
			employee.getName());
		System.out.println("Position      : "+ 
			employee.getPosition());
		System.out.println("Daily Rate    : "+ 
			employee.getRate() * employee.getWorkHrs());
	}
	
}
