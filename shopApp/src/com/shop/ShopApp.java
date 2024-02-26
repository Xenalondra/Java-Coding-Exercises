/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.shop;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer customer1 = new Customer("Pinky",9);
        
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shhirt", 10.5, "S");
        
        Clothing[] items = {
            item1,
            item2,
            new Clothing("Green Scarf", 5.0, "S"),
            new Clothing("Blue T-shirt", 10.5, "S")            
        };
        
        customer1.addItem(items);
        
        try {
            
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().
                    get("/items",list).build();
            
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            
            WebServer ws = WebServer.create(config, routing);
            
            ws.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        
        System.out.println("Minimum Price: " + Clothing.MIN_PRICE);
        
        for (Clothing item : customer1.getItems()) {
            System.out.println(item);
        }
        
        int average = 0;
        int count = 0;
        
        for (Clothing item : customer1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        
        //Produce and catch exception
        try {
            average = (count == 0) ? 0 : average /count;
            System.out.println("Average Price: " + average + ", Count: " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }
        
        Arrays.sort(customer1.getItems());
        System.out.println("\nSorted Items:");
        for (Clothing item : customer1.getItems()) {
            System.out.println(item);
        }
        
        System.out.println(customer1);
    }
    
}
