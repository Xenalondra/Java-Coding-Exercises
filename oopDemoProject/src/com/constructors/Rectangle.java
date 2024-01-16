/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.constructors;

/**
 *
 * @author Alondra Bio
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
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
    
    public double calculateArea(){
        return this.length * this.width;
    }
    
    public double calculatePerimeter(){
        return (this.length *2) + (this.width * 2);
    }
    
}
