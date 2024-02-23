/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsclasses.exercise3;

/**
 *
 * @author Alondra Bio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        newTransaction();
    }

    public static void newTransaction() {
        Clothing clothing = new Clothing();
        clothing.description = "Blue Jacket";
        clothing.size = "M";
        clothing.price = 1500;
        
        double tax = 0.1;
        
        System.out.println("Total Amount: PHP" + clothing.totalAmount(tax));
    }
    
}
