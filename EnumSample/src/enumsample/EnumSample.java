/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumsample;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class EnumSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        enumSize();
    }

    public static void enumSize() {
        String size = "large";
        if (size.equals(EnumSizes.LARGE)) {
            System.out.println("You ordered large.");
        }
    }
    
    public static void enumSample() {
        try {
            ColorEnum[] colorsChoice = ColorEnum.values();
            ColorEnum color = (ColorEnum) (JOptionPane.showInputDialog(
                    null,
                    "What is your favorite color?",
                    "SELECT A COLOR",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    colorsChoice,
                    colorsChoice[0]));
            showMessage(color);
        } catch (Exception e) {
        }
    }

    public static void showMessage(ColorEnum color) {
        try {
            if (color != null) {
                JOptionPane.showMessageDialog(null, color.getDescription());
            }
        } catch (Exception e) { }
    }

}
