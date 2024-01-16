/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction.sample;

/**
 *
 * @author Alondra Bio
 */
public class Square extends Shape{
    double side;

    Square(double side){
        this.side = side;
    }
    
    @Override
    void findPerimeter() {
        System.out.println("Perimeter: "+(side*4));
    }

    @Override
    void findArea() {
        System.out.println("Area: "+(side*side));
    }
    
}
