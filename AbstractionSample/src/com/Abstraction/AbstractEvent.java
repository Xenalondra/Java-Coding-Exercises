/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Abstraction;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Alondra Bio
 */
public abstract class AbstractEvent implements Event{
    String userID;
    String timeStamp;
    
    @Override
    public String getTimeStamp() {
    return this.timeStamp = LocalDate.now() + " " + LocalTime.now();
    }

    @Override
    public abstract void process();
    
}
