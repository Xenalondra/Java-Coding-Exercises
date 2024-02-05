/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.regex;

import java.util.Scanner;
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
        //Call the method here
        sample2();
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
    
    //Quantifiers in regular expressions
    public static void regexSample2() {
        // Matches if there is at least one 'n' in the string
        System.out.println("Examples of : n+");
        Pattern pattern = Pattern.compile("n+", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher("abnxyz");
        Matcher matcher2 = pattern.matcher("xyz");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample4() {
        // Matches if there are zero or more 'n' in the string
        System.out.println("Examples of : n*");
        Pattern pattern = Pattern.compile("n*");
        Matcher matcher1 = pattern.matcher("abnxyz");
        Matcher matcher2 = pattern.matcher("xyz");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: true
    }
    
    public static void regexSample5() {
        // Matches if there are zero or one 'n' in the string
        System.out.println("Examples of : n?");
        Pattern pattern = Pattern.compile("n?");
        Matcher matcher1 = pattern.matcher("abnxyz");
        Matcher matcher2 = pattern.matcher("xyz");
        Matcher matcher3 = pattern.matcher("annxyz");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: true
        System.out.println(matcher3.find()); // Output: false
    }
    
    public static void regexSample6() {
        // Matches if there is a sequence of exactly 3 'n' in the string
        System.out.println("Examples of : n{3}");
        Pattern pattern = Pattern.compile("n{3}");
        Matcher matcher1 = pattern.matcher("annnnxyz");
        Matcher matcher2 = pattern.matcher("annxyz");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample7() {
        // Matches if there is a sequence of 2 to 4 'n' in the string
        System.out.println("Examples of : n{2,4}");
        Pattern pattern = Pattern.compile("n{2,4}");
        Matcher matcher1 = pattern.matcher("annnxyz");
        Matcher matcher2 = pattern.matcher("anxyz");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample8() {
        // Matches if there is a sequence of at least 2 'n' in the string
        System.out.println("Examples of : n{2,}");
        Pattern pattern = Pattern.compile("n{2,}");
        Matcher matcher1 = pattern.matcher("annnnxyz");
        Matcher matcher2 = pattern.matcher("anxyz");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    //Metacharacters in regular expressions
    public static void regexSample9() {
        // Matches if the string contains 'cat', 'dog', or 'fish'
        System.out.println("Examples of : |");
        System.out.println("Pattern: cat|dog|fish");
        Pattern pattern = Pattern.compile("cat|dog|fish");
        Matcher matcher1 = pattern.matcher("I love my dog!"); 
        Matcher matcher2 = pattern.matcher("Hello world!");   
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample10() {
        // Matches if the string has any character in the specified position
        System.out.println("Examples of : .");
        System.out.println("Pattern: h.t");
        Pattern pattern = Pattern.compile("h.t");    
        Matcher matcher1 = pattern.matcher("hat");   
        Matcher matcher2 = pattern.matcher("hot");   
        Matcher matcher3 = pattern.matcher("hit");   
        Matcher matcher4 = pattern.matcher("hut");   
        Matcher matcher5 = pattern.matcher("hello"); 
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: true
        System.out.println(matcher3.find()); // Output: true
        System.out.println(matcher4.find()); // Output: true
        System.out.println(matcher5.find()); // Output: false
    }
    
    public static void regexSample11() {
        // Matches if the string starts with 'Hello'
        System.out.println("Examples of : ^");
        System.out.println("Pattern: ^Hello");
        Pattern pattern = Pattern.compile("^Hello");
        Matcher matcher1 = pattern.matcher("Hello World");
        Matcher matcher2 = pattern.matcher("World, Hello!");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample12() {
        // Matches if the string ends with 'World'
        System.out.println("Examples of : $");
        System.out.println("Pattern: World$");
        Pattern pattern = Pattern.compile("World$");
        Matcher matcher1 = pattern.matcher("Hello World!");
        Matcher matcher2 = pattern.matcher("World, Hello!");
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample13() {
        // Matches if the string contains a digit
        System.out.println("Examples of : \\\\");
        System.out.println("Pattern: \\d");
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher1 = pattern.matcher("The number is 5"); 
        Matcher matcher2 = pattern.matcher("No digits here!"); 
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample14() {
        // Matches if the string contains a whitespace character
        System.out.println("Examples of : \\\\");
        System.out.println("Pattern: \\s");
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher1 = pattern.matcher("Hello World!"); 
        Matcher matcher2 = pattern.matcher("No spaces here!"); 
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample15() {
        // Matches if the string has 'WORD' at the beginning or end of a word
        System.out.println("Examples of : \\\\");
        System.out.println("Pattern: \\bWORD\\b");
        Pattern pattern = Pattern.compile("\\bWORD\\b");
        Matcher matcher1 = pattern.matcher("WORD is important."); 
        Matcher matcher2 = pattern.matcher("PASSWORD is secret."); 
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    public static void regexSample16() {
        // Matches if the string contains the specified Unicode character
        System.out.println("Examples of : \\u0068");
        System.out.println("Pattern: \\u0068");
        Pattern pattern = Pattern.compile("\\u0068");
        Matcher matcher1 = pattern.matcher("hello"); 
        Matcher matcher2 = pattern.matcher("world"); 
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
    }
    
    //Regular expression patterns using brackets
    public static void regexSample17() {
        // Matches if the string matches one character, which can be 'a', 'b', or 'c'
        System.out.println("Examples of : [abc]");
        System.out.println("Pattern: [abc]");
        Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher1 = pattern.matcher("orange"); 
        Matcher matcher2 = pattern.matcher("abc"); 
        Matcher matcher3 = pattern.matcher("wxyz"); 
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: true
        System.out.println(matcher3.find()); // Output: false
    }
    
    public static void regexSample18() {
        // Matches if the string matches one character that is NOT 'a', 'b', or 'c'
        System.out.println("Examples of : [^abc]");
        System.out.println("Pattern: [^abc]");
        Pattern pattern = Pattern.compile("[^abc]");
        Matcher matcher1 = pattern.matcher("apple"); 
        Matcher matcher2 = pattern.matcher("abc"); 
        Matcher matcher3 = pattern.matcher("orange"); 
        Matcher matcher4 = pattern.matcher("sdsabcsds"); 
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
        System.out.println(matcher3.find()); // Output: true
        System.out.println(matcher4.find()); // Output: true
    }
    
    public static void regexSample19() {
        // Matches if the string matches one digit (character in the range 0 to 9)
        System.out.println("Examples of : [0-9]");
        System.out.println("Pattern: [0-9]");
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher1 = pattern.matcher("The number is 5"); 
        Matcher matcher2 = pattern.matcher("No digits here!"); 
        Matcher matcher3 = pattern.matcher("54321");  
        System.out.println(matcher1.find()); // Output: true
        System.out.println(matcher2.find()); // Output: false
        System.out.println(matcher3.find()); // Output: true
    }
    
    //Sample problem: 
    public static void emailValidator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.find()) {
            System.out.println("That is a valid email.");
        } else {
            System.out.println("That is not a valid email.");
        }
    }
    
    public static void sample2() {
        String text = "The price is $15.99 and $20.50.";
        String patternString = "\\$([0-9]+\\.[0-9]{2})"; // Pattern to match currency values

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String matchedGroup = matcher.group(); // Returns the entire matched substring
            String priceGroup = matcher.group(1); // Returns the content of the first capturing group

            System.out.println("Matched substring: " + matchedGroup);
            System.out.println("Price: " + priceGroup);
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
