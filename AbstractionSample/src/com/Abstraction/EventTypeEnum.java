/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.Abstraction;

/**
 *
 * @author Alondra Bio
 */
public enum EventTypeEnum {
    FUNDS("Fund Transfer"),
    ACCOUNTS("Account Transfer"),
    PASSWORD("Change Password"),
    PAYMENT("Missed Payment");
    
    private final String description;
    
    EventTypeEnum(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
}
