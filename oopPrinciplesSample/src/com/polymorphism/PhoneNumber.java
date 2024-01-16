/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class PhoneNumber {
    String areacode;
    String number;
    
    PhoneNumber(String number){
        if (number.length() > 10) {
            this.areacode = number.substring(0, number.length() - 10);
            this.number = number.substring(number.length() - 10);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Number");
        }
    }
    
    public String toString(){
        return this.areacode + this.number;
    }
}
