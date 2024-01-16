/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.AbstractionInterface;

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
        MainClass mainClass = new MainClass();
        mainClass.processEvent();
    }
    
    private AbstractEvents createEvent(){
        AbstractEvents event = null;
        String Id = JOptionPane.showInputDialog(null, "Enter your user ID:");
        String[] events = 
        {
        "Account Transfer",
        "Fund Transfer",
        "Missed Payment",
        "Password Change"
        };
        String process =(String) (JOptionPane.showInputDialog(null, 
                "What process would you like", 
                "PROCESSING", JOptionPane.QUESTION_MESSAGE, 
                null, events, events[0]));
        switch (process) {
            case "Account Transfer" -> event = new AccountTransfer(Id);
            case "Fund Transfer" -> event = new FundTransfer(Id);
            case "Missed Payment" -> event = new MissedPayment(Id);
            case "Password Change" -> event = new PasswordChange(Id);
            default -> JOptionPane.showMessageDialog(null, "Good bye!");
        }
        return event;
    }
    
    private void processEvent(){
        AbstractEvents event = createEvent();
        if (event != null) {
            System.out.println(event.getTimeStamp());
            event.process();
        }
    }
        
}
