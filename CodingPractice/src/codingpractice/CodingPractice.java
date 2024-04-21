/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codingpractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Alondra Bio
 */
public class CodingPractice {

    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Example usage:
        List<Integer> price1 = List.of(4, 2, 1, 4, 7);
        int k1 = 3;
        long result1 = getMinimumMoves(new ArrayList<>(price1), k1);
        System.out.println("Minimum Moves: " + result1);

        List<Integer> price2 = List.of(3, 3, 3, 6, 9);
        int k2 = 2;
        long result2 = getMinimumMoves(new ArrayList<>(price2), k2);
        System.out.println("Minimum Moves: " + result2);
    }
    
    public static long getMinimumMoves(List<Integer> price, int k) {
    // Write your code here
        // Sort the array
        Collections.sort(price);

        // Find the current median index
        int medianIndex = (price.size() - 1) / 2;

        // Calculate the minimum moves needed
        long moves = 0;
        for (int i = medianIndex; i >= 0; i--) {
            if (price.get(i) > k) {
                moves += price.get(i) - k;
            }
        }

        return moves;
    }
    
    
    /*
     * problem 1: convert decimal to binary
     */
    public static void prob1() {
        //get user input
        System.out.print("Enter a decimal number: ");
        int num = scan.nextInt();
        
        //create an arraylist where we will put the digits
        ArrayList<Integer> binary = new ArrayList<>();
        
        int digits;
        
        //convert to binary
        System.out.println("Solution:");
        for (int i = num; i > 0; i /= 2) {
            System.out.print("("+i+")/2 = ");
            digits = i % 2;
            System.out.println(digits);
            binary.add(digits);
        }
        
        //Display output
        System.out.print("Converted to binary: ");
        for (int i = binary.size()-1; i >= 0; i--) {
            System.out.print(binary.get(i));
        }
        System.out.println();
    }
    
    /*
     * Problem 2: Fibonacci Sequence triangle
     */
    public static void prob2() {
        System.out.print("Enter the limit: ");
        int limit = scan.nextInt();

        int first = 0, second = 1;

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                
                int fn = (i <= 1) ? i : first + second;
                System.out.printf(fn + " ");
                
                if (i > 1) {
                    first = second;
                    second = fn;
                }
            }
            //reset the values of first and second every row
            first = 0; second = 1;
            System.out.println();
        }
    }
    
    /*
     * Given a number x, determine whether the given number is Armstrong Number or not.
     * Armstrong number is a number that is the sum of its own digits each raised 
     * to the power of the number of digits.
     */
    public static void prob3() {
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
        
        //get the number of digits by using String
        String number = Integer.toString(x);
        
        //Get the length 
        int numDigits = number.length();
        
        int temp = x, sum = 0, digit, raised;
        while (temp > 0) {
            digit = temp %10;
            raised = (int) Math.pow(digit, numDigits);
            sum += raised;
            temp /= 10;
        }
        
        String result = (x == sum) ? "Armstrong Number" : "Not an Armstrong number";
        System.out.println(result);
    }
    
    /*
     * Given a number n, print n-th Fibonacci Number.
     */
    public static void prob4() {
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        
        int first = 0, second = 1, nth = 0;
        for (int i = 0; i < n; i++) {
            nth = (i <= 1) ? i : first + second;
            if(i > 1){
                first  = second;
                second = nth;
            }
        }
        System.out.println("nth Fibonacci Number: " + nth);
    }
    
    /*
     * Write a program to find HCF of two numbers without using recursion.
     */
    public static void prob5A() {
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();

        int hcf = 1;
        int smaller = (num1 > num2) ? num1 : num2;
        for (int i = smaller; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
                break;
            }
        }
        System.out.println("HCF: " + hcf);
    }
    
    //HCF using euclidean algorithm
    public static void prob5B() {
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("HCF: " + Math.abs(num1));
    }
    
    /*
     * Program to check if a given year is leap year
     */
    public static void prob6() {
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        boolean leapYear = false;
        
        if (year % 400 == 0) {
            leapYear = true;
        } else if (year % 100 == 0) {
            leapYear = false;
        } else if (year % 4 == 0) {
            leapYear = true;
        }
        
        String result = (leapYear) ? year+ " is a leap year" : year+ " is not a leap year";
        System.out.println(result);
    }
    
    /*
     * Write a program to reverse digits of a number
     */
    public static void prob7() {
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        
        int lastDigit, reversedNum = 0;
        while (number > 0) {
            lastDigit = number % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNum);
    }
    
    /*
     * Program to Check if a Given String is Palindrome
     */
    
    public static void prob8() {
        System.out.println("Enter a String: ");
        String word = scan.nextLine();
        
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        
        String result = (sb.toString().equals(word))? "Palindrome":"Not a Palindrome";
        System.out.println(result);
    }
    
    /*
     * Print all prime numbers less than or equal to N
     */
    
    public static void prob9() {
        System.out.println("Enter the limit: ");
        int n = scan.nextInt();
        
        System.out.println("Prime numbers are: ");
        printPrimes(n);
    }

    private static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    private static boolean prime(int num) {
        if (num < 2) {
            return false;
        }
        
        //optimization technique known as the trial division method
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false; // If divisible, it's not a prime number
            }
        }
        return true;
    }
    
    /*
     * 
     * LCM(a,b)= (a*b) /
     *          GCD(a,b)
     * 
     */
    public static void prob10() {
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();

        int LCD = getLCD(num1, num2);
        System.out.println("LCD: " + LCD);
    }

    private static int getLCD(int num1, int num2) {
        int GCD = getGCD(num1, num2);
        return Math.abs(num1 * num2) / GCD;
    }

    private static int getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return Math.abs(num1);
    }
    
    /*
     * How to swap two numbers without using a temporary variable?
     */
    public static void prob11() {
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
    
    /*
     * program to Find the Largest Number Among Three Numbers
     */
    public static void prob12() {
        int[] numbers = new int[3];
        System.out.println("Enter 3 numbers: ");
        
        int largest = 0;
        for (int i = 0; i < 3; i++) {
            numbers[i] = scan.nextInt();
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest Number: "+ largest);
    }
    
    public static int prob12(int a, int b, int c) {
        /*
         * Using nested ternary operator to find the largest among three numbers
         * return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
         */
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
    
    /*
     * Check if a given number is Prime Number or not.
     */
    public static void prob13() {
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        boolean isPrime = checkNumber(num);
        System.out.println("Prime Number: " + isPrime);
    }

    private static boolean checkNumber(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static List<Integer> subsetA(List<Integer> arr) {
        List<Integer> subsetA = new ArrayList<>();
        int leftSum = 0;
        int rightSum = 0;
        int indexStart = 0;
        //Sort the array
        Collections.sort(arr);
        
        // Calculate the total sum of the array
        for (int num : arr) {
            rightSum += num;
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            leftSum += arr.get(i);
            rightSum -= arr.get(i);

            if (leftSum > rightSum) {
                indexStart = (i);
                break;
            }
        }
        
        for (int i = indexStart; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            subsetA.add(arr.get(i));
        }

        return subsetA;
    }
    
    /*
    * Given a positive integer n, the task is to find the maximum sum obtained by 
    * recursively breaking n into parts (n/2, n/3, and n/4) until no further breaking 
    * leads to a higher sum.
     */
    public static int maxSum(int n) {
        // Create an array to store computed values to avoid recomputation
        int[] dp = new int[n + 1];

        // Initialize dp array with values from 1 to n
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }

        // Iterate through each value from 2 to n
        for (int i = 2; i <= n; i++) {
            // Break the current value into three parts and consider the maximum sum
            int temp = dp[i / 2] + dp[i / 3] + dp[i / 4];
            // Update dp[i] with the maximum sum
            dp[i] = Math.max(dp[i], temp);
        }

        // The final result is stored in dp[n]
        return dp[n];
    }
    
    /*
     * Given an integer n, return the number of trailing zeroes in n!.
     */
}
