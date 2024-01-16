/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Abstraction;

/**
 *
 * @author Alondra Bio
 */
public class PasswordChange extends AbstractEvent{
   
    public PasswordChange(String userID) {
        this.userID = userID;
    }

    @Override
    public void process() {
        System.out.println("Customer "+ userID + " changed their password. "
                + "Sending email verification now.");
    }
    
}
