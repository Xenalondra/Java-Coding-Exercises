/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alondra Bio
 */
public class polymorphismSample2 {
    List<Contacts> phoneBook;
    
    //constructor
    public polymorphismSample2(){
        phoneBook = new ArrayList<>();
    }
    
    public void addContact(Contacts contact){
       phoneBook.add(contact);
    }
    
    public Contacts searchContact(String search){
        for (Contacts contacts : phoneBook) {
            if (contacts.name.toLowerCase().contains(search.toLowerCase())) {
                return contacts;
            }
        }
        return null;
    }
            
    void newContacts(){
        Contacts contact1 = new Contacts(
                "Justin Torres", "torres@gmail.com");
        Contacts contact2 = new Contacts(
                "Grace Noble",
                new PhoneNumber("+639635845230"));
        Contacts contact3 = new Contacts(
                "Muriel Aurea",
                "dimakakain@gmail.com",
                new PhoneNumber("+639506643194"));
        
        System.out.println(contact1 + "\n");
        System.out.println(contact2 + "\n");
        System.out.println(contact3 + "\n");
        
        /*
         * ASSIGNMENT:
         * Use ArrayList(1) "phoneBook" and add the contacts
         * Use JOptionPane to search for a contact
         * Contact can be search from either first or lastname
         * if the contact is found display the contact information
         * if the contact does not exist simply show an error message
         */
    }
}
