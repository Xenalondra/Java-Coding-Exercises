/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import com.packageModifiers.Person;

/**
 *
 * @author Alondra Bio
 */
public class NewClass extends Person{
    public String course;
    private double grade;
    protected int age;
    
    @Override
    public void display(){
        grade = 1.0;
        System.out.println("Name  : "+name);
        System.out.println("Course: "+course);
        System.out.println("Grade : "+grade);
    }
}
