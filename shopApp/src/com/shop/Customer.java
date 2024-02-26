/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shop;


/**
 *
 * @author Alondra Bio
 */
public class Customer {

    /**
     * @return the items
     */
    
    private String name;
    private String size;
    
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    /**
     * @param measurement
     * @param size the size to set
     */
    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2,3 ->  setSize("S");
            case 4, 5,6 ->  setSize("M");
            case 7, 8,9 ->  setSize("L");
            default ->  setSize("XL");
        }
    }
    
    public void addItem(Clothing[] someItems){
        items = someItems;
    }
    
    public Clothing[] getItems() {
        return items;
    }
    
    public double getTotalCloathingCost(){
        double total = 0;
        for (Clothing item : items) {
            total += (item.getPrice());
            System.out.println(item);
        }
        return total;
    }
    
    
    @Override
    public String toString(){
        return "Customer: " + getName() + ", size: " + getSize() + ", Total Amount:" + getTotalCloathingCost();
    }
}
