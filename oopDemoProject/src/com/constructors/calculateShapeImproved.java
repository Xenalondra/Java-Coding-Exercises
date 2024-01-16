/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.constructors;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class calculateShapeImproved {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> roomNamesList = new ArrayList<>();
    ArrayList<Rectangle> roomSizesList = new ArrayList<>();
    
    public void calculateArea(){
        inputRoomNames();
        inputRoomSizes();
        System.out.println("\nTOTAL AREA OF THE HOUSE: " + 
                calculateTotalArea() + "m^2");
    }

    private void inputRoomNames(){
        String roomName ; int counter = 1;
        System.out.println("Enter the room names (ex. Bathroom) "
                + "\nType finish after entering all the room names.");
        while (true) {
            System.out.print("Room " + counter + ": ");
            roomName = scanner.nextLine();
            if (roomName.equalsIgnoreCase("finish")) {
                break;
            }
            counter++;
            roomNamesList.add(roomName);
        }
    }
    
    private void inputRoomSizes(){
        for (String room : roomNamesList) {
            roomSizesList.add(getRoomSizes(room));
        }
    }
    
    private Rectangle getRoomSizes(String roomName){
        System.out.println("ROOM : "+ roomName);
        System.out.print("Length of the Room: ");
        double length = scanner.nextDouble();
        System.out.print("Width of the Room: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }

    private double calculateTotalArea() {
        double totalArea = 0;
        for (Rectangle roomSizes : roomSizesList) {
                totalArea += roomSizes.calculateArea();
        }
        return totalArea;
    }
    
}
