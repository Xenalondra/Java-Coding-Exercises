/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;

/**
 *
 * @author Alondra Bio
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    void calculatePerimeter() {
        double per = 2 * (getLength() * getWidth());
        System.out.printf("Perimeter : %,.02f%n", per);
    }

    @Override
    void calculateArea() {
        double area = getLength() * getWidth();
        System.out.printf("Area : %,.02f%n", area);
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
}
