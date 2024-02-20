/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringproblems;

/**
 *
 * @author Alondra Bio
 */
public class StringProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }
    
    /*
     * Given an input string s, reverse the order of the words.
     * Return a string of the words in reverse order concatenated by a single space.
     */
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder build = new StringBuilder();

        for(int i = words.length-1; i >= 0; i--){
            build.append(words[i]).append(" ");
        }

        return build.toString().trim();
    }
}
