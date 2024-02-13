/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringincrementer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alondra Bio
 */
public class StringIncrementer {

    public static String incrementString(String str) {
        // Define a regex to match the numeric part at the end of the string
        Pattern pattern = Pattern.compile("(\\d+)$");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            // Extract the numeric part
            String numbers = matcher.group();
            // Increment the numeric part
            String formattedNumber = incrementNumber(numbers);
            // Replace the original numeric part with the incremented one
            return str.substring(0, matcher.start()) + formattedNumber + str.substring(matcher.end());
        }

        // If no numeric part is found, append "1" to the string
        return str + 1;
    }

    // Increment a numeric string considering each digit and its position
    private static String incrementNumber(String numbers) {
        int length = numbers.length();
        int carry = 1;
        StringBuilder result = new StringBuilder();

        // Iterate through each digit from right to left
        for (int i = length - 1; i >= 0; i--) {
            char digit = numbers.charAt(i);
            int sum = Character.getNumericValue(digit) + carry;
            carry = sum / 10;
            // Insert the result at the beginning to maintain the correct order
            result.insert(0, sum % 10);
        }

        // If there is a carry after processing all digits, insert it at the beginning
        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(incrementString("foo"));       // Output: foo1
        System.out.println(incrementString("foobar23"));   // Output: foobar24
        System.out.println(incrementString("foo0042"));    // Output: foo0043
        System.out.println(incrementString("foo9"));       // Output: foo10
        System.out.println(incrementString("foo099"));     // Output: foo100
        System.out.println(incrementString("OVSs6:SWNkq84181908536122225396558"));
    }

}
