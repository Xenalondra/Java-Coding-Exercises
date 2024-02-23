/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsclasses.exercise4;

/**
 *
 * @author Alondra Bio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(1500.50);
        item1.setSize("L");
        
        item2.setDescription("Green T-shirt");
        item2.setPrice(350);
        item2.setSize("M");
        
        //add the items
        Customer customer = new Customer();
        Clothing[] items = {item1, item2};
        customer.addItem(items);
        
        System.out.println("Total Amount: PHP" + customer.getTotalCloathingCost());
    }
}
