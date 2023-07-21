/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore;

/**
 *
 * @author Alondra Bio
 */
class Product {
    public String name;
    protected int quantity;
    private double price;
    
    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    public String productDetails(){
        String formatted = String.format("%,.02f", price);
        return "["+ this.quantity + "x]" +
                "\tTitle    : "+ this.name+"\n"+
                "\tPrice    : PHP" + formatted + "\n";
        
    }
    public double calculateTotalPrice(){
        return this.price * this.quantity;
    }
    
}
