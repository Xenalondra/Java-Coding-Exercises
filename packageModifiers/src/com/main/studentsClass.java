/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.main;

import com.package1.protectedSample;

/**
 *
 * @author Alondra Bio
 */
public class studentsClass extends protectedSample{
	//Attributes or Instance Variables / fields
	String name;
	public String course;
	public String section;
	private double allowance;
	protected String studID;
	final double grade = 1.75;
	
	studentsClass(){
		System.out.println("A new student object is created!");
	}
	
	studentsClass(String studname, String course, String section, double allowance, String studID){
		System.out.println("A new student is created using constructor.");
		name = studname; // Don't use `this` keyword if they have different names
		//this.globalVariable = localVariable;
		this.course = course;
		this.section = section;
		this.allowance = allowance;
		this.studID = studID;
	}
	
	void displayDetails(){
		school = "PLV";
		System.out.println("Name   : " + name);
		System.out.println("Student ID : " + studID);
		System.out.println("Grade : "+grade);
		System.out.println("Allowance : "+allowance);
		System.out.println("Course : " + course +" "+section);
		System.out.println("School : " + school);
		System.out.println();
	}
	
	String display(){
		school = "PLV";
		String display = "Name   : " + name + "\n" +
		"Student ID : " + studID + "\n" +
		"Grade : "+grade+ "\n" +
		"Allowance : "+allowance+ "\n" +
		"Course : " + course +" "+section+ "\n" +
		"School : " + school+ "\n";
		return display;
	}
	
	//getter method
	public double getAllowance(){
		return allowance;
	}
	
	//setter method
	public void setAllowance(double allowance){
	this.allowance = allowance;
	}
	
}
