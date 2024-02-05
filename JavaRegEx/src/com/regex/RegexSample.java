/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alondra Bio
 */
public class RegexSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        regexSample1();
    }
    
    public static void regexSample1() {
        /*
         * A regular expression is a sequence of characters that forms a search
         * pattern.
         * A regular expression can be a single character, or a more complicated
         * pattern.
         * Pattern Class - Defines a pattern (to be used in a search)
         * Matcher Class - Used to search for the pattern
         * PatternSyntaxException Class - Indicates syntax error in a regular
         * expression pattern
         */
        
        //Creating a pattern to match the string "hello" with case-insensitivity
        Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        
        //Creating a matcher to apply the pattern to the input string "Hello World!"
        Matcher matcher = pattern.matcher("Hello World!");
        
        //Attempting to find a match in the input string
        boolean matchFound = matcher.find();
        
        //Checking if a match is found and printing the appropriate message
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
    
    /*
     * Important Notes:
     * Pattern is created using Pattern.compile() with a specified search
     * pattern ("hello") and a flag for case-insensitivity.
     * matcher() method is applied to the target string, creating a Matcher
     * object for pattern matching.
     * The find() method is used to determine if the pattern is present in the
     * string.
     * If a match is found, the program prints "Match found"; otherwise, it
     * prints "Match not found."
     * 
     * FLAGS
     * Pattern.CASE_INSENSITIVE - The case of letters will be ignored when
     * performing a search.
     * Pattern.LITERAL - Special characters in the pattern will not have any
     * special meaning and will be treated as ordinary characters when
     * performing a search.
     * Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to
     * also ignore the case of letters outside of the English alphabet
     * 
     * Brackets
     * Brackets are used to find a range of characters:
     * [abc]	Find one character from the options between the brackets
     * [^abc]	Find one character NOT between the brackets
     * [0-9]	Find one character from the range 0 to 9
     *
     * Metacharacters
     * Metacharacters are characters with a special meaning:
     * |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
     * .	Find just one instance of any character
     * ^	Finds a match as the beginning of a string as in: ^Hello
     * $	Finds a match at the end of the string as in: World$
     * \d	Find a digit
     * \s	Find a whitespace character
     * \b	Find a match at the beginning of a word like this: \bWORD, or at the
     * end of a word like this: WORD\b
     *
     * Quantifiers
     * Quantifiers define quantities:
     * n+	Matches any string that contains at least one n
     * n*	Matches any string that contains zero or more occurrences of n
     * n?	Matches any string that contains zero or one occurrences of n
     * n{x}	Matches any string that contains a sequence of X n's
     * n{x,y}	Matches any string that contains a sequence of X to Y n's
     * n{x,}	Matches any string that contains a sequence of at least X n's
     */
}
