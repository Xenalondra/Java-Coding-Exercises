/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.character;

/**
 *
 * @author Alondra Bio
 */
public class CharacterRepeater {
    static FastReader read = new FastReader();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharacterRepeater mainObj = new CharacterRepeater();
        mainObj.getInput();
        
    }
    
    public void getInput() {
        System.out.println("CHARACTER REPEATER");
        System.out.println("This program will repeat the character in a String (n) number of times.");
        System.out.println("\nEnter a String:");
        String input = read.nextLine();
        System.out.print("Number of times: ");
        int repeatTimes = read.nextInt();
        validateInput(input,repeatTimes);
    }

    private void validateInput(String input, int repeatTimes) {
        if (repeatTimes > 0 && !input.isBlank()) {
            String repeatedString = repeatCharacters(input, repeatTimes);
            System.out.println("\nOriginal String: " + input);
            System.out.println("Repeated String: " + repeatedString);
        } else {
            if (repeatTimes <= 0) {
                System.out.println("Invalid number of repetition.");
            }
            if (input.isBlank()) {
                System.out.println("The input is empty or contains only whitespace.");
            }
        }
    }
    
    public String repeatCharacters(String str, int times) {
        StringBuilder repeatedString = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            repeatedString.append(repeatCharacter(currentChar, times));
        }

        return repeatedString.toString();
    }

    private String repeatCharacter(char c, int times) {
        StringBuilder repeatedChar = new StringBuilder();
        
        for (int i = 0; i < times; i++) {
            repeatedChar.append(c);
        }

        return repeatedChar.toString();
    }

    //One method solution
    public static void repeat() {
        System.out.println("CHARACTER REPEATER");
        System.out.println("This program will repeat the character in a String (n) number of times.");
        System.out.println("\nEnter a String:");
        String input = read.nextLine();
        System.out.print("Number of times: ");
        int repeatTimes = read.nextInt();
        
        StringBuilder repetedChars = new StringBuilder();
        if (repeatTimes > 0 && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < repeatTimes; j++) {
                    repetedChars.append(input.charAt(i));
                }
            }
            System.out.println(repetedChars.toString());
        } else {
            if (repeatTimes <= 0) {
                System.out.println("Invalid number of repetition.");
            }
            if (input.isBlank()) {
                System.out.println("The input is empty or contains only whitespace.");
            }
        }
    }
    
    //Optimized
    public static void repeatCharacter() {
        System.out.println("CHARACTER REPEATER");
        System.out.println("This program will repeat the character in a String (n) number of times.");
        System.out.println("\nEnter a String:");
        String input = read.nextLine();
        System.out.print("Number of times: ");
        int repeatTimes = read.nextInt();
        
        StringBuilder repetedChars = new StringBuilder();
        if (repeatTimes > 0 && !input.isBlank()) {
            String[] word = input.split("");
            for (String c : word) {
                repetedChars.append(c.repeat(repeatTimes));
            }
            System.out.println(repetedChars.toString());
        } else {
            if (repeatTimes <= 0) {
                System.out.println("Invalid number of repetition.");
            }
            if (input.isBlank()) {
                System.out.println("The input is empty or contains only whitespace.");
            }
        }
    }
    
    public static int[] petAge(int humanYears) {
        int catYears = 0, dogYears = 0;
        final int FIRST_YEAR = 15;
        final int SECOND_YEAR = 9;
        for (int i = 1; i <= humanYears; i++) {
            switch (i) {
                case 1 -> {
                    catYears += FIRST_YEAR;
                    dogYears += FIRST_YEAR;
                }
                case 2 -> {
                    catYears += SECOND_YEAR;
                    dogYears += SECOND_YEAR;
                }
                default -> {
                    catYears += 4;
                    dogYears += 5;
                }
            }
        }

        return new int[]{humanYears, catYears, dogYears};
    }
    
    public static String replace(final String s) {
        String newString = s;
        return newString.replaceAll("[aeiouAEIOU]", "!"); //coding and coding....
    }
}


