/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Alondra Bio
 */
public class HashsetSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hashSet4();
    }

    public static void hashSet1() {
        /*
         * A HashSet is a collection of items where every item is unique, and it
         * is found in the java.util package:
         * HashSet<Type> identifier = new HashSet<Type>();
         */

        HashSet<String> planets = new HashSet<>();

        //to add items to it, use the add() method
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Uranus");
        planets.add("Uranus");//appears once in the set because every item in a set has to be unique

        //PRINT THE ELEMENTS
        System.out.println(planets);

        //To check whether an item exists in a HashSet
        System.out.println(planets.contains("Earth")); //true
        System.out.println(planets.contains("Pluto")); //false

        //add item
        planets.add("Pluto");
        System.out.println(planets);

        //remove item
        planets.remove("Pluto");
        System.out.println("Pluto was remove in the planets");
        System.out.println(planets);

        //size of the HashSet
        System.out.println("Number of planets: " + planets.size());

        //loop through a HashSet
        for (String planet : planets) {
            System.out.println(planet);
        }
    }

    //Since HashSets stores object we need wrapper class for primitive type
    public static void hashSet2() {
        //other ways to add elments in a HashSet
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Set<Integer> set1 = new HashSet<>(list);
        System.out.println(set1);

    }

    public static void hashSet3() {
        Integer[] nums = {8, 5, 6, 3, 5, 2};
        Set<Integer> set1 = new HashSet(Arrays.asList(nums));
        System.out.println("HashSet elements in set 1: " + set1.toString());

        String[] str = {"Tom", "Jack", "Katie", "Tim"};
        Set<String> set2 = new HashSet(Arrays.asList(str));
        System.out.println("HashSet elements in set 2: " + set2);
    }
    
    //add random numbers
    public static void hashSet4() {
        // 6/55 lotto in the ph, 6 random numbers from 1-55
        HashSet<Integer> randoms = new HashSet<>();
        
        for (int i = 0; i < 6; i++) {
            int r = (int) (Math.random() * 55 + 1);
            randoms.add(r);
        }
        
        System.out.println(randoms);
    }
}
