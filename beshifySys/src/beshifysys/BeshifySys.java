/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beshifysys;

import beshifyUI.beshifyText;
import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class BeshifySys {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		beshifyText beshifyText = new beshifyText();
		beshifyText.setVisible(true);
	}
	public static void newMethod() {
		String text = JOptionPane.showInputDialog(null, "Enter text: ");
		String[] words = text.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
		sb.append(word).append(" 🤸 ‍"); // Modify the emoji as per your choice
		}
		JOptionPane.showMessageDialog(null, sb.toString());
	}
}
