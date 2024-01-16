/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fruitPackage;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class Main {
	
	ArrayList<String> fruits = new ArrayList<>(
			Arrays.asList(
				"Banana",
				"Mango",
				"Grapes",
				"Rambutan",
				"Strawberry"));
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.options();
		String[] name;
		name = new String[6];
		ArrayList<Integer> scores;
		scores = new ArrayList<>();
		
		
	}

	private void options() {
		String[] options = {"DISPLAY","ADD", "UPDATE", "DELETE", "CLEAR ALL","EXIT"};
		int choice = JOptionPane.showOptionDialog(null, "What would you like to do?", 
			"OPTIONS", 0, JOptionPane.QUESTION_MESSAGE, null, 
			options, options[0]);
		switch (choice) {
			case 0:
				displayFruits();
				break;
			case 1:
				addFruits();
				break;
			case 2:
				updateFruits();
				break;
			case 3:
				deleteFruits();
				break;
			case 4:
				clearFruits();
				break;
			case 5:
				int confirm = JOptionPane.showConfirmDialog(null, 
					"Are you sure you want to exit?");
				if (confirm == 0)JOptionPane.showMessageDialog(null,"Thank you!");
				else options();
		}
	}

	private void displayFruits() {
		if (!fruits.isEmpty()) {
		JOptionPane.showMessageDialog(null, "Here are the fruits we have: \n"+iterate());
		options();
		} else {
			JOptionPane.showMessageDialog(null, 
			"The fruit collection is empty!");
		}
	}

	private String iterate(){
		String result = "";
		for (int i = 0; i < fruits.size(); i++) {
			result += (i+1) + ". " + fruits.get(i) + "\n";
		}
		return result;
	}
	private void addFruits() {
		String adddedFruit = JOptionPane.showInputDialog("What fruit would you like to add? "
			+ "Here is the current list: \n" + iterate());
		fruits.add(adddedFruit);
		int addAgain = JOptionPane.showConfirmDialog(null, "Do you want to add another fruit?",
			"ADD ANOTHER FRUIT", JOptionPane.YES_NO_OPTION);
		if (addAgain == 0) {
			addFruits();
		} else {
			options();
		}
	}

	private void updateFruits() {
		int edit = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of fruit to edit. "
			+ "Here is the current list: \n" + iterate()));
		if (edit <= fruits.size() && edit > 0) {
		String editted = JOptionPane.showInputDialog("Type the new name of the fruit.");
		fruits.set((edit-1), editted);
		int editAgain = JOptionPane.showConfirmDialog(null, "Do you want to edit another fruit?",
			"ADD ANOTHER FRUIT", JOptionPane.YES_NO_OPTION);
			if (editAgain == 0) {
				updateFruits();
			} else {
				options();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid number.");
			options();
		}
	}

	private void deleteFruits() {
		int edit = Integer.parseInt(JOptionPane.showInputDialog(
			"Enter the number of fruit to delete. "
			+ "Here is the current list: \n" + iterate()));
		if (edit <= fruits.size() && edit > 0) {
		
		int remove = JOptionPane.showConfirmDialog(null, 
			"Are you sure you want to delete "
			+ fruits.get(edit-1) + "?",
			"DELETE FRUIT", JOptionPane.YES_NO_OPTION);
			if (remove == 0) {
				JOptionPane.showMessageDialog(null, 
					"Successfully deleted "+ fruits.get(edit-1));
				fruits.remove(edit-1);
			} 
			options();
		} else {
			JOptionPane.showMessageDialog(null, "Invalid number.");
			options();
		}
	}

	private void clearFruits() {
	int confirm = JOptionPane.showConfirmDialog(null, 
		"This will delete all of the fruits in the list. "
		+ "\nAre you sure you want to proceed?", 
		"CLEAR LIST", JOptionPane.YES_NO_OPTION);
		if (confirm == 0) {
			fruits.clear();
		} 
		options();
	}
	
}
