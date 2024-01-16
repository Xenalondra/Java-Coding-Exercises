/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginjoptionpane;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class LoginJoptionPane {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		login2();
	}

	private static void login() {
		ArrayList<String> emails = new ArrayList<>(Arrays.asList
						("alondra@gmail.com",
						"tinkerbell@gmail.com",
						"kimmy@gmail.com",
						"joshua@gmail.com",
						"cuteko@gmail.com"));
		
		ArrayList<String> passwords = new ArrayList<>(Arrays.asList
						("1234Alonds",
						"belleMariano",
						"Kimmyy15",
						"Josh@23",
						"Cutecute02"));
		String email = JOptionPane.showInputDialog(null, "Enter your email:").toLowerCase();
		String password = JOptionPane.showInputDialog(null, "Enter your password:");
		int emailIndex = emails.indexOf(email);
		if (emailIndex != -1) {
			if (password.equals(passwords.get(emailIndex))) {
				JOptionPane.showMessageDialog(null, "Successfully Login!");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect email and password");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect email and password");
		}
	}
	
	private static void login2() {
		ArrayList<String> emails = new ArrayList<>(Arrays.asList
						("alondra@gmail.com",
						"tinkerbell@gmail.com",
						"kimmy@gmail.com",
						"joshua@gmail.com",
						"cuteko@gmail.com"));
		
		ArrayList<String> passwords = new ArrayList<>(Arrays.asList
						("1234Alonds",
						"belleMariano",
						"Kimmyy15",
						"Josh@23",
						"Cutecute02"));
		String email = JOptionPane.showInputDialog(null, "Enter your email:").toLowerCase();
		String password = JOptionPane.showInputDialog(null, "Enter your password:");
		boolean existing = false;
		for (int i = 0; i < emails.size(); i++) {
			if (email.equalsIgnoreCase(emails.get(i)) && password.equals(passwords.get(i))) {
				JOptionPane.showMessageDialog(null, "Successfully Login!");
				existing = true;
				break;
			} 
		}
		
		if (!existing) {
			JOptionPane.showMessageDialog(null, "Incorrect email and password");
		}
	}

	private static void searching() {
		ArrayList<String> seedless = new ArrayList<>(Arrays.asList
						("watermelon",
					         "apple", 
						 "grape", 
						 "tomato", 
						 "orange", 
						 "lemon", 
						 "cucumber", 
						 "pear", 
						 "plum", 
						 "avocado", 
						 "lime",
						 "banana",
						 "pineapple", 
						 "eggplant"));
		
		String search = JOptionPane.showInputDialog(null, "Search seedless fruit:").toLowerCase();
		int index = seedless.indexOf(search);
		if (index != -1) {
			JOptionPane.showMessageDialog(null, "We have "+seedless.get(index)+" in our collection");
		} else {
			JOptionPane.showMessageDialog(null, "We don't have "+search+" in our collection");
		}
	}
	
	private static void searchArraylist() {
		ArrayList<String> seedless = new ArrayList<>(Arrays.asList
						("watermelon",
					         "apple", 
						 "grape", 
						 "tomato", 
						 "orange", 
						 "lemon", 
						 "cucumber", 
						 "pear", 
						 "plum", 
						 "avocado", 
						 "lime",
						 "banana",
						 "pineapple", 
						 "eggplant"));
		
		String search = JOptionPane.showInputDialog(null, "Search seedless fruit:").toLowerCase();
		boolean existing = false;
		for (int i = 0; i < seedless.size(); i++) {
			if (search.equalsIgnoreCase(seedless.get(i))) {
				JOptionPane.showMessageDialog(null, "We definitely have "+seedless.get(i) + " in our collection");
				existing = true;
				break;
			} 
		}
		
		if (!existing) {
			JOptionPane.showMessageDialog(null, "Sorry, we don't have "+ search +" in our collection");
		}
	}
}
