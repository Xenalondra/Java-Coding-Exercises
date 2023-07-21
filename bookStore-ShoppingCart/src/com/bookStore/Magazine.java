/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore;

/**
 *
 * @author Alondra Bio
 */
public class Magazine extends Product{
    String publisher ;
    
    public Magazine(String name, int quantity, double price, String publisher) {
        super(name, quantity, price);
        this.publisher= publisher;
        
    }
    
    @Override
    public String productDetails(){
        String formatted = String.format("%,.02f", super.calculateTotalPrice());
        return super.productDetails() +
               "\tPublisher: " + this.publisher + "\n"+
               "\tTotal    : PHP" + formatted +"\n\n";
    }
}
