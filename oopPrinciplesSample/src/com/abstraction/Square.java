/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;

/**
 *
 * @author Alondra Bio
 */
public class Square extends Shape{
    private double sides;
    
    public Square(double sides){
        this.sides = sides;
    }
    
    @Override
    void calculatePerimeter() {
        double per = 4 * getSides();
        System.out.printf("Perimeter : %,.02f%n", per);
    }

    @Override
    void calculateArea() {
        double per = getSides() * getSides();
        System.out.printf("Area  : %,.02f%n", per);
    }

    /**
     * @return the sides
     */
    public double getSides() {
        return sides;
    }

    /**
     * @param sides the sides to set
     */
    public void setSides(double sides) {
        this.sides = sides;
    }
    
}
