/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author Xenalondra
 */
public class Product {
    int productID;
    String type;
    double price;
    
    //default Constructor
    public Product() {
        this.productID = 0;
        this.type = "Untitled Product";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Product(int productID, String type, double price) {
        this.productID = productID;
        this.type = type;
        this.price = price;
    }

    // Copy constructor
    public Product(Product otherProduct) {
        this.productID = otherProduct.productID;
        this.type = otherProduct.type;
        this.price = otherProduct.price;
    }
   
}
