/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsclasses.exercise2;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addStudent();
    }

    public static void addStudent() {
            Student student = new Student();
            student.name = JOptionPane.showInputDialog("Enter your name:");
            student.age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
            student.strand = JOptionPane.showInputDialog("Enter your strand:");
            student.gender = JOptionPane.showInputDialog("Enter your gender:").charAt(0);
            student.average = Double.parseDouble(JOptionPane.showInputDialog("Enter your average grade:"));
            student.displayDetails();
    }
    
}
