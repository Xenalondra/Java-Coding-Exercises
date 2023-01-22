
package BasicLoops2;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class BasicLoops2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        triangle();
    }
    
    //POSTFIX AND PREFIX INCREMENT num++, ++num
    public static void unary(){
    //prefix
    int myNum = 10;
        System.out.println("Original value of myNum: "+myNum);
    int num1 = ++myNum;
        System.out.println("After prefix the value is: "+myNum);
        System.out.println("The value of new variable: "+num1);
    //postfix
    int yourNum = 10;
        System.out.println("\nOriginal value of yourNum: "+yourNum);
    int num2 = yourNum++;
        System.out.println("After postfix the value is: "+yourNum);
        System.out.println("The value of new variable: "+num2);
    }
  
    //While loop sample: count to number 10 (whilexp)
    public static void count(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int start = 0;
        System.out.println("I will count from 0 to "+num);
        while (start <= num) {            
            System.out.println(start);
            //start++;
        }
        System.out.println("Counting Ends!");
    }
    
    //Using while loop create a program that returns barabida to omsim
    //indefinite loop
    public static void omsim(){
    Scanner in = new Scanner(System.in);
        System.out.println("You say OMSIM, I'll say BARABIDA");
        String omsim = in.nextLine().toLowerCase();
        while (omsim.contains("omsim")) {            
            System.out.println("Barabida!");
            omsim = in.nextLine().toLowerCase();
        }
        System.out.println("OKAY, STOP.");
    }
    
    //Using do while loop create a program that returns Yes love? to love
    public static void omsims(){
    Scanner in = new Scanner(System.in);
        System.out.println("Call me love");
        String omsim;
        //dowhile + tab
        do {            
           omsim = in.nextLine().toLowerCase();
           System.out.println("Yes, love?");
        } while (omsim.contains("love"));
        System.out.println("Sorry.");
    }
    
    //Count down from the number specified by the user to zero using for loop
    public static void forLoop(){
    Scanner in = new Scanner(System.in);
        System.out.println("I will countdown for you");
        System.out.print("Enter starting number: ");
        int num = in.nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Countdown Ends!!");
    }
    
    //print 10 hello world using for loop
    public static void hello(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
    }
    
    //print hello world depending on the number entered by the user (using for loop)
    public static void forloop1(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many print do you want? ");
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Hello World");
        }
        System.out.println("Printing ends.");
    }
    
    //Countdown from 10 to 0
    public static void count1(){
        System.out.println("Countdown:");
        for (int num = 10; num >= 0; num--) {
            System.out.println(num+ "!");
        }
        System.out.println("Countdown ENDS.");
    }
    
    //Count down from the number specified by the user to zero using for loop
    public static void forloop(){
        Scanner in = new Scanner(System.in);
    System.out.println("I will countdown for you!");
        System.out.print("Enter starting number: ");
        int count = in.nextInt();
        System.out.println("Counting starts....");
        for (int i = 0; i <= count; count--) {
            System.out.println(count+ "!");
        }
        System.out.println("Counting ends.");
    }
    
    //Print a right triangle using the for loop
    public static void triangle(){
    for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //Print a reverse right triangle using the for loop
    public static void triangle1(){
        for (int rows = 5; rows > 0; rows--) {
            for (int col = 0; col < rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
