/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstraction;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Alondra Bio
 */
public class changePassword implements EventsInterface{
    String accountID;
    
    changePassword(String accountID){
        this.accountID = accountID;
    }
    @Override
    public void getTimeStamp() {
        System.out.println("TimeStamp: "+ (LocalDate.now()) + " " + (LocalTime.now()));
    }

    @Override
    public void process() {
        System.out.println("Account: "+accountID+" Change their password. Sending confirmation email now.");
    }
    
}
