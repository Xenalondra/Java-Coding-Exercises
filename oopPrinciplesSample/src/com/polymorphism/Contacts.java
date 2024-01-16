/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

/**
 *
 * @author Alondra Bio
 */
public class Contacts {
    String name;
    String email;
    PhoneNumber number;
    
    public Contacts(String name, String email, PhoneNumber number){
        this.name = name;
        this.email = email;
        this.number = number;
    }
    
    public Contacts (String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public Contacts (String name, PhoneNumber number){
        this.name = name;
        this.number = number;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\n" +
               "Email: " + email + "\n" +
               "Phone Number: " + number ;
    }
}
