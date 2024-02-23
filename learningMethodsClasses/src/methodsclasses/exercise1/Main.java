/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsclasses.exercise1;

/**
 *
 * @author Alondra Bio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John Smith";
        student.age = 17;
        student.strand = "ICT";
        student.gender = 'M';
        student.average = 89.6;
        
        student.displayDetails();
    }
    
}
