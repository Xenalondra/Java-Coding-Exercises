/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.packageModifiers;

import com.constructors.calculateShape;
import com.constructors.calculateShapeImproved;

/**
 *
 * @author Alondra Bio
 */
public class Main {

    final String finalVar = "I am final";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculateShape shape = new calculateShape();
        shape.calculateArea();
        
        calculateShapeImproved shapeImproved = new calculateShapeImproved();
        shapeImproved.calculateArea();
    }
    
    public static void staticMethod(){
        System.out.println("I am from a static method.");
    }
    
    public void nonstaticMethod(){
        System.out.println("I am from a non-static method.");
        staticMethod();
        System.out.println(finalVar);
    }
    
    //Parameter
    //return type - void - no return
     //             String, int, double, char etc.
    public static String method1(String name){ //method siganature
        System.out.println("This is an example of a method with parameter");
        return "Hello " + name + "!";
    }
    
}
