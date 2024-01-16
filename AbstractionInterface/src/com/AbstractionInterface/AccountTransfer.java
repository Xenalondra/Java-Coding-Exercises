/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AbstractionInterface;

/**
 *
 * @author Alondra Bio
 */
public class AccountTransfer extends AbstractEvents {

    public AccountTransfer(String userID) {
        super(userID);
    }

    @Override
    public void process() {
        System.out.println("Customer " + userID + " needs to transfer their service.\n"
                + "Reaching out to CTE to remove service from old service and add service to new device.");
    }
    
}
