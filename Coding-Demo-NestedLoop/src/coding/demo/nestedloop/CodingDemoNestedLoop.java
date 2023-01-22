
package coding.demo.nestedloop;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class CodingDemoNestedLoop {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    
    public static void recap(){
        //While loop "hello" (10)
        //initialize, condition , update
        int a = 100;
        while (a <= 10) {
            System.out.println(a+".) Hello");
            a++;
        }
        
        //do while "hi" 
        int b = 100;
        do {            
            System.out.println(b +".) Hi");
            ++b;
        } while (b <= 10);
        
        //for loop "hey"
        //(initialize ; condition ; update)
        for (int i = 100; i <= 10; i++) {
            System.out.println(i+".) Hey");
        }
        
        /*
        Initialization of more than one variable by placing commas between the
        separate statements, as in the following:
         */
        System.out.println("Initialization of more than one variable by placing commas");
        for (int g = 0, h = 6; g < h; ++g) {
            System.out.println(g);
        }

        /*
        Performance of more than one test using AND or OR operators, as in 
        the following
         */
        System.out.println("Performance of more than one test using AND or OR operators");
        for (int g = 0, h = 0; g < 3 && h <= 0; ++g) {
            System.out.println(g);
        }
        
        /*Decrementation or performance of some other task, as in the following*/
        System.out.println("Decrementation or performance of some other task");
        for (int g = 5; g >= 1; --g) {
            System.out.println(g);
        }

        //Altering more than one value, as in the following
        int total = 0;
        for (int start = 0, end = 10; start < end; start++, total += start) {
            System.out.println(start);
        }
        System.out.println("Total: " + total);

        /*You can leave one or more portions of a for loop empty, although the 
        two semicolons are still required as placeholders. For example, if x has 
        been initialized in a previous program statement, you might write the 
        following:*/
        System.out.println("Leaving one or more portions of a for loop empty");
        int x = 0;
        for (; x <= 10;) {
            System.out.println(x);
            ++x;
        }
    }
    
    public static void altering(){
        System.out.print("Enge number: ");
        int num = scanner.nextInt();
        int total = 0;
        System.out.println("The total of numbers from 1 to "+num);
        for (int i = 1; i <= num; total+=i, i++) {
            if (i == num) System.out.print(i);
            else System.out.print(i+" + ");
        }
        System.out.println(" = "+total);
    }
    
    public static void factorial(){
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        System.out.print(num+"! = ");
        for (int i = 1; i <= num; factorial*=i, num--) {
            if (i == num) System.out.print(num);
            else System.out.print(num+" * ");
        }
        System.out.println("Factorial: "+factorial);
    }
    
    /*
    Print a half pyramid using for loop use (*)
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
    * * * * * *  
    */
    /*
    Triangle using for loop
    */
    //half pyramid
    public static void triangles1(){
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //inverted half
    public static void triangles2(){
        for (int row = 6; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //pyramid full
    public static void triangles3(){
        int row = 5, i, j;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //pyramid inverted
    public static void triangles(){
        int row = 5, i, j;
        for (i = 5; i >= 0; i--) {
            for (j = row-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    /*For each number in the outer loop, the inner loop uses each positive integer
    from 1 up to the number, and tests whether it divides evenly into the number*/
    public  static void test(){
        for (int number = 1; number <= 100; ++number) {
            System.out.print(number + " is evenly divisible by ");
            for (int var = 1; var <= number; ++var) {
                if (number % var == 0) {
                    System.out.print(var + " ");
                }
            }
            // Display the number and two spaces
            System.out.println();
        }
    }
}
