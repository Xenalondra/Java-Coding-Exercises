/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.constructors;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class calculateShape {
    Scanner scanner = new Scanner(System.in);
    
    public void calculateArea(){
        Rectangle kitchen = getRoomSizes("Kitchen");
        Rectangle bedroom = getRoomSizes("Bedroom");
        
        double totalArea = calculateTotalArea(kitchen, bedroom);
        System.out.println("\nTOTAL AREA OF THE HOUSE: " + totalArea + "m^2");
    }
    
    private double calculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
    
    private Rectangle getRoomSizes(String roomName){
        System.out.println("ROOM : "+ roomName);
        System.out.print("Length of the Room: ");
        double length = scanner.nextDouble();
        System.out.print("Width of the Room: ");
        double width = scanner.nextDouble();
        
        return new Rectangle(length, width);
    }
    
}
