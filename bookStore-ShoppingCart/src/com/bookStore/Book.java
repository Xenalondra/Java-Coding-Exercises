/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore;

/**
 *
 * @author Alondra Bio
 */
public class Book extends Product {
       String ISBN;
       String author;
       double discountRate;

    public Book(String name, int quantity, double price, String ISBN, String Author) {
        super(name, quantity, price);
        this.author = Author;
        this.ISBN = ISBN;
        this.discountRate = 0.2;
    }
    
       @Override
    public String productDetails(){
        return super.productDetails() +
                "\tISBN     : " + this.ISBN + "\n" +
                "\tAuthor   : " + this.author + "\n"+
                "\tTotal    : PHP" + calculateTotalPrice() + 
                " \n(20%off for items 199 and above) \n\n";
    }
    
       @Override
    public double calculateTotalPrice(){
        double totalDiscount = (getPrice() >= 199) ? 
               (getPrice() * this.quantity * this.discountRate) : 0.0; 
        return (getPrice() * this.quantity ) - totalDiscount;
    }
}
        
        
        
        
        
        
        
    
    

