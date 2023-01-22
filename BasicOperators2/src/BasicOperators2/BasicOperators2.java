/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BasicOperators2;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class BasicOperators2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Call the method here
    }
    public static void operators(){
    //ARITHMETIC OPERATORS
    int a = 11;
    int b = 16;
    a++; b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println( a + b);
        System.out.println( b - a);
        System.out.println( b / a);
        System.out.println( b % a);
        System.out.println( a * b);
        System.out.println( a * b - 10);
        System.out.println( a * (b - 10));
        System.out.println( 10 * 5 - b + a );
        
    //ASSIGNMENT OPERATORS
    int x, y;
    x = 5;
    y = 3;
    x += y; //addition assignment 
        System.out.println(x);
    y -= 2; //subtraction assignment 
        System.out.println(y);
    int j = 6;
    int k = 5;
    int l = k; //The value of l would be the number assigned to k
        System.out.println(l + j);
        
    //RELATIONAL OPERATORS
    //greater than
        System.out.println(7 > 1);
    //less than
        System.out.println(4 < 2);
    //greater than equals
        System.out.println(9 >= 4);
    //less than equals
        System.out.println(9 <= 4);
    //is equals (equality)
        System.out.println(7 == 8);
    //is not equals (inequality)
        System.out.println(7 != 8);
        
    //LOGICAL OPERATORS
    //Logical NOT ! - if expression is false return true, vice versa
        System.out.println(!(5>9));
    //Logical AND - if one expression is false return false. Return true if all expression is true.
        System.out.println(7>3 && 5>9 && 8<9);
    //LOGICAL OR - if one expression is true, return true.
        System.out.println(8>2 || 1>9 || 5<6);
    // more exaples of using logical operators
        System.out.println(!(5>2 && 5<5) || 8>2);
        System.out.println((5>3 || 2<6) && 2<9);
    }
    
    public static void escape(){
    //Declaring a char variable with a single quote value
       char dq = '\'';
        System.out.println("My name " +dq+ "Alondra" +dq+ " has single quote.");
    //escape sequence
    //backslash \"
        System.out.println("My name \"Alondra\"  has double quote.");
        System.out.println("My name 'Alondra' has single quote.");
    //double backlash \\ - denotes backslash
        System.out.println("This is an \\example\\ of double backslash");
    //backslash \n - new line
        System.out.println("\n\nHello.\nFrom the other side.");
    //backslash \t - tab
        System.out.println("Dear ate charo,\n\tSumulat ako para sabihing mahal kita.");
        System.out.println("\t\t\ttab tab tab");
        System.out.println("\ttab\ttab\ttab");
    //backslash r - \r - carriage return
        System.out.println("This will not be printed.\rThis will be printed.\rI'm the new print.");
    //backslash b - \b - backspace
        System.out.println("My question mark was deleted?\b");
    //backslash f - \f - feed character
        System.out.println("\f this has feed character \f");
    //TEXT BLOCK
    String print = """
                   this is so 
                   freaking awesomeee
                   !!!!!!!!!!!!!!!!!!!!!!
                   """;
    System.out.println(print);
    }
    
     public static void if_statement(){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter your score on the quiz");
        int score = in.nextInt();
        //If-else can have only one statement each
        if (score == 10) 
            System.out.println("You got the perfect score");
        
    }
    
    public static void if_else(){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter your score on the quiz");
        int score = in.nextInt();
        //If-else can have only one statement each
        if (score == 10) 
            System.out.println("You got the perfect score");
        else 
            System.out.println("Better luck next time.");
        
    }
    
    public static void odd_even(){
    Scanner in = new Scanner(System.in);
        System.out.print("ODD OR EVEN??\nEnter a number: ");
        int num = in.nextInt();
        //If-else can have only one statement each
        if (num%2 == 0) 
            System.out.println("That's an even number!");
        else 
            System.out.println("That's an odd number!");
    }
    
    public static void if_elseBlock(){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter your score on the quiz");
        int score = in.nextInt();
        //If else block has curly braces and can have more than one statement
        if (score == 10) {
            System.out.println("Wow!");
            System.out.println("Sana all perfect.");
        } else {
            System.out.println("Awit!");
            System.out.println("Bawi next time.");
        }
    }
    
    public static void compareStrings(){
    Scanner in = new Scanner(System.in);
        System.out.print("GUESS MY NAME???\nEnter your guess: ");
        String name = in.nextLine();
        //.equals() - case sensitive
        //.equalsIgnoreCase()
        if ( name.equalsIgnoreCase("Alondra")  ||
             name.equalsIgnoreCase("Xeniorita") ||
             name.equalsIgnoreCase("Bio  cxv")) {
            System.out.println("Yezz! That's my name.");
        } else {
            System.out.println("Ops, not my name.");
        }
    }
    
}
