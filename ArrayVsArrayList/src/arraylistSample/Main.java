package arraylistSample;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Ma'am B
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Array vs ArrayList
        1. Declaration and Initialization
        2. Populating 
        3. Getting the size
        4. Add element
        5. set an element
        6. Remove an element
        7. Printing elements
        */    
        
        //Array - fixed size collection elements (can store objects and primitive data type)
        
        //ArrayList - dynamic collection that can grow or shrink in size (objects)
        
        /*
        Wrapper Class - Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        int - Integer
        double - Double
        char - Character
        long - Long
        short - Short
        boolean - Boolean
        */
        
        //DECLARATION AND INITIALIZATION
        //String[] veggs = new String[5];
        //<String> fruits = new ArrayList<>();
        
        //DECLARATION AND POPULATION
        String[] veggs = {"Petchay",
                          "Repolyo",
                          "Labanos",
                          "Carrots",
                          "Okra"
        };
        
        /*
        ArrayList<String> fruits = new ArrayList<>(){{
        add("Banana");
        add("Apple");
        add("Mango");
        add("Durian");
        add("Strawberry");
        }};
        */
        
        ArrayList<String> fruits = 
                new ArrayList<>(Arrays.asList("Banana",
                "Apple", "Mango","Durian","Strawberry"));
        
        //GETTING THE SIZE
        System.out.println("The size of Array veggs is "+ veggs.length);
        System.out.println("The size of ArrayList fruits is "+ fruits.size());
        
        //ACCESSING A SPECIFIC ELEMENT
        System.out.println("Ayoko ng "+ veggs[4]);
        System.out.println("I love "+ fruits.get(4));
        
        //ADD ELEMENT
        //veggs[5] = "Talong";
        //System.out.println(veggs[5]);
        
        fruits.add("Orange");
        System.out.println("I added : "+fruits.get(5));
        
        //SET AN ELEMENT
        String oldName = veggs[1];
        veggs[1] = "Cabbage"; //set
        System.out.println("I renamed "+oldName+" to "+veggs[1]);
        
        oldName = fruits.get(2);
        fruits.set(2, "Mangga"); //set
        System.out.println("I renamed "+oldName+" to "+fruits.get(2));
        
        //REMOVE AN ELEMENT
        fruits.remove("Banana");
        //PRINTING ELEMENTS
        System.out.println(fruits);
        fruits.remove(2);
        //PRINTING ELEMENTS
        System.out.println(fruits);
        
        for (int i = 0; i < veggs.length; i++) {
            System.out.println(veggs[i]);
        }
        System.out.println();
        
        for (String vegg : veggs) {
            System.out.println(vegg);
        }
        
        System.out.println(Arrays.toString(veggs));
        
        fruits.add(3, "Durian");
        System.out.println(fruits);
        
    }
    
}
