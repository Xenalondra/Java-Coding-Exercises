/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Abstraction;


/**
 *
 * @author Alondra Bio
 */
public class MissedPayment extends AbstractEvent{

    public MissedPayment(String userID) {
        this.userID = userID;
    }

    @Override
    public void process() {
        System.out.println("Customer "+ userID + " missed their payment. "
                + "Sending the bill now.");
    }
}
