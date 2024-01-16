/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.polymorphism;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }
    
    public void polySample1() {
        polymorphismSample1 petManager = new polymorphismSample1();
        petManager.managePets();
    }
    
    public static void polySample2() {
        polymorphismSample2 phoneBookManager = new polymorphismSample2();
        phoneBookManager.addContact(new Contacts(
                "Justin Torres", "torres@gmail.com"));
        phoneBookManager.addContact(new Contacts(
                "Grace Noble",
                new PhoneNumber("+639635845230")));
        phoneBookManager.addContact(new Contacts(
                "Muriel Aurea",
                "dimakakain@gmail.com",
                new PhoneNumber("+639506643194")));
    
        String search = JOptionPane.showInputDialog(null, "Search for contact:");
        Contacts foundContact = phoneBookManager.searchContact(search);

        if (foundContact != null)  System.out.println(foundContact);
        else System.out.println("Contact not found.");
    }
    
    
}
