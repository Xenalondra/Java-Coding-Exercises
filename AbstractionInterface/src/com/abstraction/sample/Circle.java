/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction.sample;

/**
 *
 * @author Alondra Bio
 */
public class Circle extends Shape {
    double radius;
    
    //Constructor
    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    void findPerimeter() {
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    @Override
    void findArea() {
        System.out.println("Area: "+(Math.PI * (radius*radius)));
    }
}
