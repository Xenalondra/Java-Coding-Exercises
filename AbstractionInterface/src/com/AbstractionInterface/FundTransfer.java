/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AbstractionInterface;

/**
 *
 * @author Alondra Bio
 */
public class FundTransfer extends AbstractEvents{

    public FundTransfer(String userID) {
        super(userID);
    }

    @Override
    public void process() {
        System.out.println("Customer "+ userID + ": Transfer some funds."); 
    }
    
}
