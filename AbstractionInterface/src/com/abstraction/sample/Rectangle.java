/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction.sample;

/**
 *
 * @author Alondra Bio
 */
public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    @Override
    void findPerimeter() {
        System.out.println("Perimeter: "+((width+height)*2));
    }

    @Override
    void findArea() {
        System.out.println("Area: "+(width*height));
    }
}
