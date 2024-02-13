/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversewords;

/**
 *
 * @author Alondra Bio
 */
public class ReverseWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println((spinWords("Welcome"))); //"emocleW"
        System.out.println(spinWords("Hey fellow warriors")); //"Hey wollef sroirraw"
    }
    public static String spinWords(String sentence) {
    //TODO: Code stuff here
    String[] words = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                String reversed = reverseWord(words[i]);
                sb.append(" ").append(reversed);
            } else {
                sb.append(" ").append(words[i]);
            }
            
        }
    
    return sb.toString().trim();
  }

    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();
        return reversed.toString();
    }
}
