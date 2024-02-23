/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodsclasses.exercise3;

/**
 *
 * @author Alondra Bio
 */
public class Clothing {
    String size;
    String description;
    double price;
    
    double totalAmount(double tax){
        return (price * tax) + price;
    }
}
