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
        polySample2();
    }
    
    public static void polySample1() {
        polymorphismSample1 petManager = new polymorphismSample1();
        petManager.managePets();
    }
    
    public static void polySample2() {
        polymorphismSample2 phoneBookManager = new polymorphismSample2();
        phoneBookManager.addContact(new Contacts(
                "John Torres", "torres@gmail.com"));
        phoneBookManager.addContact(new Contacts(
                "John Noble",
                new PhoneNumber("+639635845230")));
        phoneBookManager.addContact(new Contacts(
                "Muriel Aurea",
                "dimakakain@gmail.com",
                new PhoneNumber("+639506643194")));
        
        String search = JOptionPane.showInputDialog("SEARCH CONTACT:");
        Contacts contact = phoneBookManager.searchContact(search);
        
        if (contact != null) {
            System.out.println(contact);
        } else {
            JOptionPane.showMessageDialog(null, "Contact not found!");
        }
    }

}
