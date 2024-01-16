/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.AbstractionInterface;

/**
 *
 * @author Alondra Bio
 */
public enum EventType {
    ACCOUNT("Account Transfer"),
    FUNDS("Fund transfer"),
    PAYMENT("Missed Payment"),
    PASSWORD("Password Change");
    
    
    private final String description;
    
    EventType(String description){
     this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    
}
