/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AbstractionInterface;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Alondra Bio
 */
public abstract class AbstractEvents implements Event{
    private String TimeStamp;
    public String userID;
    
    public AbstractEvents(String userID){
        this.userID = userID;
        this.TimeStamp = LocalDate.now() + " " + LocalTime.now();
    }
           
    @Override
    public String getTimeStamp() {
        return this.TimeStamp;
    }

    @Override
    public abstract void process();
    
}
