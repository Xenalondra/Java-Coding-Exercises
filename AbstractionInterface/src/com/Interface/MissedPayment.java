/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interface;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author Alondra Bio
 */
public class MissedPayment implements Event{

    String userID;
    String timeStamp;
    
    public MissedPayment(String userID) {
        this.userID = userID;
    }

    @Override
    public void process() {
        System.out.println("Customer "+ userID + " missed their payment. "
                + "Sending the bill now.");
    }

    @Override
    public String getTimeStamp() {
       return this.timeStamp = LocalDate.now() + " " + LocalTime.now();
    }
    
}
