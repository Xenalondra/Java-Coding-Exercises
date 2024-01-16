/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Abstraction;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * ASSIGNMENT:
         *
         * You are provided with an Interface class called 'EventInterface' that
         * you need to optimize for improved code readability and reusability.
         * Use abstraction to create an abstract class called 'AbstractEvent'
         * that implements the 'EventInterface' interface. Other classes should
         * extend this abstract class.
         *
         * Follow these steps:
         *
         * 1. Implement the 'EventInterface' in your abstract class 'AbstractEvent.'
         * 2. Create specific classes that extend 'AbstractEvent' for different types of events.
         * 3. Ask the user for their userID and the "What would you like to process?".
         * 4. Display the input data in the console.
         *
         */
    }

    
    
    public static AbstractEvent createEvent() {
        String id = null;
        AbstractEvent evt = null;
            do {            
            //trim() will remove any whitespaces after a character sequence
            id = JOptionPane.showInputDialog(null,"User ID:").trim();
            if(id == null){
                //if the user click cancel the program won't process any event
                return null;
            }    
        } while (id.isEmpty());
        EventTypeEnum[] events = EventTypeEnum.values();
        EventTypeEnum event = (EventTypeEnum) (JOptionPane.showInputDialog(
                null, 
                "What would you like to do?",
                "Menu Page", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                events, events[0]));
        switch (event) {
            case FUNDS ->    evt = new FundTransfer(id);
            case ACCOUNTS -> evt = new AccountTransfer(id);
            case PAYMENT ->  evt = new MissedPayment(id);
            case PASSWORD -> evt = new PasswordChange(id);
            } 
        
        return evt;
    }
    
    public static void processEvent() {
        try {
            AbstractEvent event = createEvent();
            if (event != null) {
                event.getTimeStamp();
                event.process();
            }
        } catch (Exception e) { }
    }
}
