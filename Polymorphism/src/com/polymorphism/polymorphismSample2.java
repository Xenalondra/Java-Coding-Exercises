/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism;

import java.util.ArrayList;

/*
 * ASSIGNMENT:
 * Use ArrayList(1) "phoneBook" and add the contacts
 * Use JOptionPane to search for a contact
 * Contact can be search from either first or lastname
 * if the contact is found display the contact information
 * if the contact does not exist simply show an error message
 */

/**
 *
 * @author Alondra Bio
 */
public class polymorphismSample2 {
    private ArrayList<Contacts> phoneBook;

    public polymorphismSample2() {
        phoneBook = new ArrayList<>();
    }

    public void addContact(Contacts contact) {
        phoneBook.add(contact);
    }

    public Contacts searchContact(String search) {
        for (Contacts contact : phoneBook) {
            if (contact.name.toLowerCase().contains(search.toLowerCase())) {
                return contact;
            }
        }
        return null;
    }
}
    
    
