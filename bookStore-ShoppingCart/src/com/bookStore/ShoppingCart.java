/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class ShoppingCart {

    private ArrayList<Product> cart = new ArrayList<>();

    public void startShopping() {
        String[] opt = {"Add Item", "Pay","Quit"};
        int option = JOptionPane.showOptionDialog(null, "What would you like to do?", "Shopping Cart", 0, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
        //rule switch - use (->) instead of colon (:), no need to use breaks, One statement per case.
        switch(option){
            case 0 -> addItem();  
            case 1 -> buyItem();
        }
    }

    private void addItem() {
        String[] prodType = {"Book", "Magazine"};
        int type = JOptionPane.showOptionDialog(null, "Product Category", "Shopping Cart",
                0, JOptionPane.QUESTION_MESSAGE, null, prodType, prodType[0]);
        String title = JOptionPane.showInputDialog("Title :");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity :"));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Price :"));
        switch (type) {
            case 0:
                String ISBN = JOptionPane.showInputDialog("Book ISBN :");
                String author = JOptionPane.showInputDialog("Book Author :");
                Book book = new Book(title, quantity, price, ISBN, author);
                cart.add(book);
                break;
            case 1:
                String publisher = JOptionPane.showInputDialog("Magazine Publisher :");
                cart.add(new Magazine(title, quantity, price, publisher));
                break;
        }
        startShopping();
    }

    private void buyItem() {
        double totalPayment = 0;
        System.out.println("ORDER SUMMARY:");
         if (!cart.isEmpty()) {
             for (Product product : cart) {
                 System.out.println(product.productDetails());
                 totalPayment += product.calculateTotalPrice();
             }
             System.out.printf("Total Payment: PHP%,.02f", totalPayment);
            JOptionPane.showMessageDialog(null,"Thank you for shopping with us!");
        } else {
             JOptionPane.showMessageDialog(null,"Your shopping cart is empty!");
        }
    }

}
