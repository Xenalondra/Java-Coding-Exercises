/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.main;

import com.package1.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class MainClass {
	/**
	 * PACKAGES AND MODIFIERS
	 * 
	 * PACKAGE
	 * (1) CREATE A PACKAGE
	 * (2) RENAME A PACKAGE
	 * (3) ADD A FILE TO A PACKAGE
	 * 
	 * class
	 * Class creation
	 * Class instantiation
	 * Inner class
	 * OBJECTS/ INSTANCE OF A CLASS (new Keyword)
	 * ATTRIBUTES/ INSTANCE VARIABLES 
	 * METHODS
	 * Method Overloading 
	 * 
	 * MODIFIERS
	 * (1) ACCESS MODIFIERS
	 * default
	 * public
	 * private
	 * protected
	 * (2) NON-ACCESS MODIFIERS
	 * static
	 * final
	 * abstract
	 * 
	 * INTRO TO OOP
	 * CONSTRUCTORS
	 * this Keyword
	 * 4 OOP principles
	 */
	
	//DECLARE AND POPULATE AN ARRAYLIST
	ArrayList<studentsClass> studentList = new ArrayList<>(){{
	add(new studentsClass("Nobel", "BSIT", "1-2", 500, "22-2203"));
	add(new studentsClass("Torres", "BSIT", "1-6", 1000, "22-3058"));
	add(new studentsClass("Daryl", "BSIT", "1-6", 600, "22-2563"));
	}};
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//Abstract class cannot be instantiated
		//abstractClass abstractClass1 = new //abstractClass();
		
		studentsClass student1 = new studentsClass();
		student1.name = "Lansang";
		student1.course = "BSIT";
		student1.section = "1-2";
		student1.studID = "22-2586";
		student1.setAllowance(500);
		student1.displayDetails();
		
		//studentsClass student2 = new studentsClass("Daryl","BSIT","1-6",600,"22-2563");
		//student2.display();
		
		MainClass mainClass = new MainClass();
		mainClass.menuPage();
	}
	
	//Method Overloading
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static void instantiation() {
		packageClass classObj = new packageClass();
		classObj.callMe();
		
		//Classname.staticMethod();
		innerClass.staticMethod();
		newClass.staticMethod();
		
		//Non-static Method
		newClass newClassObj = new newClass();
		newClassObj.nonstaticMethod();
		
		innerClass innerClassObj = new innerClass();
		innerClassObj.nonstaticMethod();
	}
	
	public static double breakfast(String bfast) {
		System.out.println("Welcome to Daryl's Eatery!");
		System.out.println("I want "+bfast+" for breakfast.");
		return 60.00;
	}

	private void menuPage() {
		String[] options = {"View","Add","Delete","Search","Quit"};
		int choice = JOptionPane.showOptionDialog(null, 
			"WELCOME TO STUDENT MANAGEMENT SYSTEM!\nWhat would you like to do?", 
			"STUDENT MANAGEMENT SYSTEM", 0, JOptionPane.QUESTION_MESSAGE, 
			null, options, options[0]);
		switch (choice) {
			case 0:
				viewStudents();
				break;
			case 1:
				addStudent();
				break;
			case 2:
				deleteStudent();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				quit();
				break;
		}
	}
	
	private void viewStudents(){
		StringBuilder sb = new StringBuilder();
		for (studentsClass class1 : studentList) {
			System.out.println(class1.display());
			sb.append(class1.display()).append("\n");
		}

		JOptionPane.showMessageDialog(null,
			"Here is the list of our students: \n"
			+ sb.toString());
		menuPage();
	}

	private void addStudent() {
		String name = JOptionPane.showInputDialog(null, "Name : ");
		String course = JOptionPane.showInputDialog(null, "Course : ");
		String section = JOptionPane.showInputDialog(null, "Section : ");
		double allowance = Double.parseDouble(JOptionPane.showInputDialog(null, "Allowance : "));
		String studID = JOptionPane.showInputDialog(null, "Student ID : ");
		
		studentList.add(new studentsClass(name, course, section, allowance, studID));
		viewStudents();
	}

	private void deleteStudent() {
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < studentList.size(); i++) {
			build.append(i+1).append(". ")
			.append(studentList.get(i).studID)
			.append(" :").append(studentList.get(i).name)
			.append("\n");
		}
		int index = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"Select the number of student you want to delete.\n"+build.toString()));
		studentList.remove(index-1);
		viewStudents();
		
	}

	private void searchStudent() {
		StringBuilder build = new StringBuilder();
		String search = JOptionPane.showInputDialog(null, "Search for student:");
		boolean found = false;
		for (int i = 0; i < studentList.size(); i++) {
			String name = studentList.get(i).name.toLowerCase();
			String id = studentList.get(i).studID;
			if (name.contains(search.toLowerCase()) || id.contains(search)) {
				build.append(studentList.get(i).display()).append("\n");
				found = true;
			}
		}
		 if (found)JOptionPane.showMessageDialog(null, "Search Result: \n"+ build.toString());
		 else JOptionPane.showMessageDialog(null, "No student found!");
		menuPage();
		
	}

	private void quit() {
	int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", 
		"EXIT APPLICATION", JOptionPane.YES_NO_OPTION);
		if (confirm == 0)  JOptionPane.showMessageDialog(null, "Thank you for using our service.");
		else  menuPage();
	}
	
	
	//INNER CLASS SAMPLE
	public static class innerClass{
		public static void staticMethod() {
			System.out.println("I am a static method from an inner class.");
		}
		
		public void nonstaticMethod() {
			System.out.println("I am a non-static method from an inner class.");
		}
	}
}
