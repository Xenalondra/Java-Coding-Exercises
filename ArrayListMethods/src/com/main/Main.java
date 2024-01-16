package com.main;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Ma'am B
 */
public class Main {
    /*
     * Simple program covering ArrayList and JOptionPane 
     */
    
    ArrayList<String> fruits = new ArrayList<>() {
        {
            add("Banana");
            add("Apple");
            add("Mango");
            add("Strawberry");
            add("Kiwi");
            add("Orange");
        }

    };

    //Instantiation of a class
    static Main mainObj = new Main();

    public static void main(String[] args) {
        mainObj.optionMenu();
    }

    public void optionMenu() {
        String[] options = {"Display", "Add", "Update", "Remove", "Clear"};
        int opt = JOptionPane.showOptionDialog(null,
                "Welcome to our Fruit Shop\nWhat can I do for you?",
                "FRUIT SHOP INVENTORY SYSTEM", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (opt) {
            case 0:
                displayFruits();
                break;
            case 1:
                addFruit();
                break;
            case 2:
                updateFruit();
                break;
            case 3:
                removeFruit();
                break;
            case 4:
                clearAllFruits();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Thank you for visiting our fruit shop.");
        }
    }

    public String display() {
        String display = "";
        Collections.sort(fruits);
        for (int i = 0; i < fruits.size(); i++) {
            display += (i + 1) + ". " + fruits.get(i) + "\n";
        }
        return display;
    }

    public void displayFruits() {
        JOptionPane.showMessageDialog(null, "We have "
                + fruits.size() + "fruits in our Collection.\nHere is the list of our fruits.\n" + display());
    }

    public void addFruit() {
        String addFruit = JOptionPane.showInputDialog(null, "What fruit would you like to add?");
        fruits.add(addFruit);
        displayFruits();
    }

    public void updateFruit() {
        int index = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Here is the list of fruits in our collection\n" + display()
                + "\nChoose the fruit number you want to rename."));

        String newName = JOptionPane.showInputDialog(null, "Enter a new name for " + fruits.get(index - 1));

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to rename "
                + fruits.get(index - 1) + " to " + newName + "?", "UPDATING A FRUIT", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Successfully renamed " + fruits.get(index - 1));
            fruits.set(index - 1, newName);
            displayFruits();
        }
    }

    public void removeFruit() {
        int index = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Here is the list of fruits in our collection\n" + display()
                + "\nChoose the fruit number you want to delete."));

        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete " + fruits.get(index - 1) + "?",
                "DELETE A FRUIT", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Successfully deleted " + fruits.get(index - 1));
            fruits.remove(index - 1);
            displayFruits();
        }
    }

    public void clearAllFruits() {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to Delete All fruits?",
                "DELETE ALL FRUITS", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Successfully Deleted All Fruits");
            fruits.clear();
            displayFruits();
        }
    }

}
