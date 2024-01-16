/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;

/**
 *
 * @author Alondra Bio
 */
public class Circle extends Shape{
    private double radius;
    
    //Parametized Constructor
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public void calculatePerimeter() {
        //2r^2
        double per = 2 * (getRadius() * getRadius());
        System.out.printf("Perimeter : %,.02f%n", per);
    }

    @Override
    public void calculateArea() {
        //pie r^2
        double area = Math.PI * (getRadius() * getRadius());
        System.out.printf("Area : %,.02f%n", area);
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
