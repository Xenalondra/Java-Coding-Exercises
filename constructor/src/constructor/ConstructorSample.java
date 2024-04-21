/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

/**
 *
 * @author Xenalondra
 */
public class ConstructorSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a product using the default constructor
        Product defaultProduct1 = new Product();
        System.out.println("Default Product:");
        System.out.println("Product ID: " + defaultProduct1.productID);
        System.out.println("TYpe      : " + defaultProduct1.type);
        System.out.println("Price     : " + defaultProduct1.price);
        System.out.println();
        
        // Creating a product using the default constructor
        Product defaultProduct2 = new Product();
        defaultProduct2.productID = 01;
        defaultProduct2.type = "T-shirt";
        defaultProduct2.price = 300.50;
        System.out.println("Default Product:");
        System.out.println("Product ID: " + defaultProduct2.productID);
        System.out.println("TYpe      : " + defaultProduct2.type);
        System.out.println("Price     : " + defaultProduct2.price);
        System.out.println();
        
        // Creating a product using the parameterized constructor
        Product parameterizedProduct = new Product(02, "Laptop", 19999.99);
        System.out.println("Parameterized Product:");
        System.out.println("Product ID: " + parameterizedProduct.productID);
        System.out.println("TYpe      : " + parameterizedProduct.type);
        System.out.println("Price     : " + parameterizedProduct.price);
        System.out.println();
        
        // Creating a copy of the parameterized product
        Product copyProduct = new Product(parameterizedProduct);
        System.out.println("Copy Product:");
        System.out.println("Product ID: " + copyProduct.productID);
        System.out.println("TYpe      : " + copyProduct.type);
        System.out.println("Price     : " + copyProduct.price);
    }
    
}
