/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.main;

/**
 *
 * @author Alondra Bio
 */

import com.AbstractionInterface.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        processEvent();
    }

    public static AbstractEvents createEvent() {
        AbstractEvents event = null;
        EventType[] events = EventType.values();
        String Id = null;
        while (Id == null || Id.isEmpty()) {
            Id = JOptionPane.showInputDialog(null, "Enter your user ID:").trim();
            if (Id == null) {
                return null;
            }
        }
        EventType selectedEvent = (EventType) (JOptionPane.showInputDialog(
                    null, "What would you like to do?", "Select a process",
                    JOptionPane.QUESTION_MESSAGE, null,
                    events, events[0]));
            switch (selectedEvent) {
                case FUNDS ->   event = new FundTransfer(Id);
                case ACCOUNT -> event = new AccountTransfer(Id);
                case PAYMENT -> event = new MissedPayment(Id);
                case PASSWORD ->event = new PasswordChange(Id);
            }
            System.out.println(selectedEvent.getDescription() + ":");
        return event;
    }

    public static void processEvent() {
        try {
        AbstractEvents event = createEvent();
        if (event != null) {
            event.getTimeStamp();
            event.process();
        }
        } catch (Exception e) {
        }
    }

    public static void Interface() {
        AccountTransfer event1 = new AccountTransfer("123456");
        FundTransfer event2 = new FundTransfer("789456");
        MissedPayment event3 = new MissedPayment("456123");
        PasswordChange event4 = new PasswordChange("589631");

        ArrayList<AbstractEvents> events = new ArrayList<>() {
            {
                add(event1);
                add(event2);
                add(event3);
                add(event4);
            }

        };

        for (AbstractEvents event : events) {
            System.out.println(event.getTimeStamp());
            event.process();
        }
    }

    public static void abstractionInterface() {
        AccountTransfer event1 = new AccountTransfer("123456");
        FundTransfer event2 = new FundTransfer("789456");
        MissedPayment event3 = new MissedPayment("456123");
        PasswordChange event4 = new PasswordChange("589631");

        ArrayList<AbstractEvents> events = new ArrayList<>() {
            {
                add(event1);
                add(event2);
                add(event3);
                add(event4);
            }

        };

        for (AbstractEvents event : events) {
            System.out.println(event.getTimeStamp());
            event.process();
        }
    }

}
