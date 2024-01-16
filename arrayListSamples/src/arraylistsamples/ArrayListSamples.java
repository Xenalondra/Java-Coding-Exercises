/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistsamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class ArrayListSamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        simpleArrayList();
    }

    /*
    ARRAYLIST
    Syntax : ArrayList<datatype> identifier = new ArrayList<>();
    COMMONLY USED METHODS
    1. add(element) - add elements to the end of the arraylist
    2. remove(int index) - removes the element at the specified index
    3. get(int index) - returns the element at the specified index
    4. size() - returns the number of elements in the arraylist
    5. contains(object) - returns true if the arraylist contains the specified element
    6. set(int index) - replace the element at the specified index
    7. add (int index, element) - insert an element at the specified index
    8. remove(object) - removes the first occurence of the specified element
    9. clear() - removes all elements from the arraylist
    10. indexOf(object) - returns the index of the specified index
     */
    
    public static void simpleArrayList() {
        //Declaration of ArrayList 
        ArrayList<String> fruits = new ArrayList<>();
        // add elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Kiwi");
        fruits.add("Mango");
        Collections.sort(fruits); // sort the list alphabetically
        System.out.println(fruits);

        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.get(5));
        //Display using the JOptionPane
        String display = "";
        int count = 1;
	    StringBuilder stringBuilder = new StringBuilder();
	    
        for (String fruit : fruits) {
            display += count + ": " + fruit + "\n";
	    stringBuilder.append(count).append(": ").append(fruit).append("\n");
	    //stringBuilder.append(count).append(": ").append(fruit).append("\n");
	    
            count++;
        }
	System.out.println(stringBuilder);
        
        JOptionPane.showMessageDialog(null, "Displaying the fruits in the collection: \n" + display);
        //Remove(index) fruit from the collection using JOptionPane
        int remove = Integer.parseInt(JOptionPane.showInputDialog(null, "Remove fruit number: "));

        //Confirming to delete the fruit using JOptionPane
        //Using the get(index) method of arrayList
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete "
                + fruits.get(remove - 1) + "?", "Delete Fruit", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            fruits.remove(remove - 1);
        }
        //Displaying the updated list
        JOptionPane.showMessageDialog(null, "Updated list of fruits in the collection: \n" + fruits);

        //Declaration and population
        ArrayList<String> names = new ArrayList<>() {
            {
                add("June");
                add("July");
                add("Jean");
                add("John");
                add("Joan");
            }
        };

        System.out.println(names);
        //Displaying the elements by converting the list to String
        JOptionPane.showMessageDialog(null, "Displaying the names of your friends: \n" + names.toString());

        //Remove(object) name from the collection using JOptionPane
        String removeFr = JOptionPane.showInputDialog(null, "Enter your friend's name: ");

        //Confirming to delete the fruit using JOptionPane
        //Using the get(index) method of arrayList
        confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete friend "
                + removeFr + "?", "Delete Friend", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            //remove(object) is a case sensitive method
            if (names.remove(removeFr)) {
                JOptionPane.showMessageDialog(null, "Updated list of friends in the collection: \n" + names);
            } else {
                JOptionPane.showMessageDialog(null, "Friend not found!");
            }
        }

        /*Another way to do this is by using the Iterator class
        iterator - is an boject in java that allows you to traverse the elements 
        of a collection (such as ArrayList, LinkedList, HashSet)
        syntax:
        Iterator<datatype> identifier = arrayListName.iterator();
        methods
        1.hasNext() returns true if there are more elements in the collection
        2.next() returns the next element in the collection
        3.remove() removes the last element returned by the iterator from the collection
         */
        confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete friend "
                + removeFr + "?", "Delete Friend", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        //declaration of iterator
        Iterator<String> iterate = names.iterator();
        if (confirm == 0) {
            //traversing the list using hasNext
            while (iterate.hasNext()) {
                String element = iterate.next();//next element
                if (element.equalsIgnoreCase(removeFr)) {
                    iterate.remove();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Updated list of friends in the collection: \n" + names);

        int addIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Add friend after friend number: "));
        String newFriend = JOptionPane.showInputDialog(null, "Enter the friend name: ");
        //Using the add (int index, element) to insert an element in specified index
        names.add(addIndex, newFriend);
        JOptionPane.showMessageDialog(null, "Updated list of friends in the collection: \n" + names);
        display = "";
        count = 1;
        //TRaversing using enhanced for loop to access the data
        for (String name : names) {
            display += "Friend #" + count + " : " + name + "\n";
            count++;
        }
        JOptionPane.showMessageDialog(null, "Updated list of friends in the collection: \n" + display);
    }

}
