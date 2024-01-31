/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hashmapSample;

import java.util.HashMap;

/**
 *
 * @author Alondra Bio
 */
public class useHashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sample2();
    }

    private static void sample1() {
        /*
         * String keys and Integer values
         * A HashMap however, store items in "key/value" pairs, and you can
         * access them by an index of another type (e.g. a String).
         */
        HashMap<String, String> colors = new HashMap<>();
        colors.put("r", "red");
        colors.put("o", "orange");
        colors.put("y", "yellow");
        colors.put("g", "green");
        colors.put("v", "violet");
        colors.put("i", "indigo");
        colors.put("b", "blue");

        //printing out
        System.out.println(colors);
        System.out.println(colors.containsKey("v")); //true, checks whether the hashmap has that key
        System.out.println(colors.keySet()); //print out the keys
        System.out.println(colors.values());

        //Accessing an item
        System.out.println(colors.get("b")); //get(key)

        //Add an item
        colors.put("p", "pink");
        System.out.println(colors.get("p"));
        System.out.println(colors);

        //replace an item
        colors.replace("p", "pula");
        System.out.println(colors);

        //remove an item
        colors.remove("p");
        System.out.println(colors);

        //size of a hashmap
        System.out.println(colors.size());

        //looping through the collection
        for (String i : colors.keySet()) {
            System.out.println("Key: " + i + " Value: " + colors.get(i));
        }
    }

    public static void sample2() {
        // Create a HashMap object called people <key, value>
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 27);
        people.put("Mark", 33);
        people.put("Daniel", 25);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + "\tAge: " + people.get(i));
        }
    }

}
