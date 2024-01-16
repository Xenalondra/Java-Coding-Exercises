/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.main;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Alondra Bio
 */
public class CountWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //Create a Java program that counts the number of words in a sentence. 
    public static void getInput() {
        System.out.println("WORD COUNTER: Every word counts\nPaste your paragraph here then press enter.");
        try {
            try (FastReader reader = new FastReader()) {
                String paragraph = reader.nextLine();

            //validate input
            if (paragraph == null || paragraph.trim().isEmpty()) {
                System.out.println("Ops, the paragraph is blank or contains only whitespaces. Try again");
                return;
            }
            countWords(paragraph);
            }
        } catch (IOException ex) {}
    }

    private static void countWords(String paragraph) {
        try {
            String[] words = paragraph.split("\\s+");
            System.out.println("Word Count: " + words.length);
            System.out.println("Character Count: " + paragraph.length());
        } catch (Exception e) {}
    }
    
    //another solution using tokenizer
    public static void inputOutput() {
        try {
            System.out.println("WORD COUNTER: Every word counts\nPaste your paragraph here then press enter.");
            String paragraph;
            //get user input
            try (FastReader reader = new FastReader()) {
                //get user input
                paragraph = reader.nextLine();
            }
            
            if (paragraph == null || paragraph.trim().isEmpty()) {
                //Display error message
                System.out.println("Ops, the paragraph is blank or contains only whitespaces. Try again");
                return;
            }
            
            int wordCount = countWord(paragraph);
                
                //Display the output of the program
                System.out.println("Word Count: " + wordCount);
                System.out.println("Character Count: " + paragraph.length());
                
        } catch (Exception e) {}
    }

    private static int countWord(String paragraph) {
        StringTokenizer token = new StringTokenizer(paragraph);
        return token.countTokens();
    }
}
