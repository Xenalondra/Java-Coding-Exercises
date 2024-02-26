/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shop;

/**
 *
 * @author Alondra Bio
 */
class Clothing implements Comparable<Clothing>{

    private double price;
    private String description;
    private String size = "M";
    
    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

    public Clothing(String description,double price, String size) {
        this.price = price;
        this.description = description;
        this.size = size;
    }
    
    /**
     * @return the price
     */
    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
    return  "Description: " + getDescription() + ", " +
            "Price : " + getPrice() + ", " +
            "Size : " + getSize();
    }

    @Override
    public int compareTo(Clothing o) {
        return this.description.compareTo(o.description);
    }
    
    
}
