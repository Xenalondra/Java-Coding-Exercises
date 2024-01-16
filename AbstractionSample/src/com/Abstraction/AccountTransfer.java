/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Abstraction;

/**
 *
 * @author Alondra Bio
 */
public class AccountTransfer extends AbstractEvent{
   
    public AccountTransfer(String userID) {
        this.userID = userID;
    }

    @Override
    public void process() {
       System.out.println("Customer " + userID + " needs to transfer their service.\n"
                + "Reaching out to CTE toremove service from old service and add service to new device.");
    }
}
