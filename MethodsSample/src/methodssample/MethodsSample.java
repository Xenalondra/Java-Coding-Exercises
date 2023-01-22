package methodssample;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class MethodsSample {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        print("Jovince","Baldivino");//argument
        print("Christian","Baldivino");
        name();
        getInput();
        //To access non static method we need to create an object
        MethodsSample nonStat = new MethodsSample();
        nonStat.nonstatic();
        nonStat.nonstatic2();
    }
    
    //non static method
    public void nonstatic() {
        System.out.println("IM FROM NON STATIC METHOD");
    }
    
    public void nonstatic2() {
        System.out.println("IM FROM NON STATIC METHOD 2");
    }
    
    public static void name(){
        String firstname = "Alondra";
        String lastname = "Bio";
        print(firstname,lastname);
    }
    
    //argument vs parameter
    public static void print(String fname, String lname) {
        System.out.println("Hello my name is "+fname+" "+lname);
    }
    
    public static void getInput() {
        System.out.println("Give me 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        choice(a, b);
    }
    
    public static void choice(int a, int b) {
        System.out.println("What operation would you like? ");
        System.out.println("Press 1 for add\nPress 2 for Subtract\nPress 3 for multiply\nPress 4 for Division");
        int choice = scanner.nextInt();
        switch(choice){
            case 1: System.out.println(add(a,b));   break;
            case 2: System.out.println(sub(a, b));  break;
            case 3: System.out.println(multi(a,b)); break;
            case 4: System.out.println(div(a,b));   break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    
    //Another choices using string naman
    public static void choices2(int a, int b) {
        System.out.println("CHOOSE YOUR OPERATOR");
        System.out.println("Press + for Addition\nPress - for Subtraction\nPress * for Multiplication\nPress / for Division");
        System.out.print("Operator : ");
        String choice = scanner.next();
        switch (choice) {
            case "+": System.out.println(add(a, b));  break;
            case "-": System.out.println(sub(a, b));  break;
            case "*": System.out.println(multi(a, b));break;
            case "/": System.out.println(div(a, b));  break;
            default: System.out.println("Invalid choice");
        }
    }
    
    //return type methods
    public static String add(int a, int b) {
        System.out.println("Adding two Integers");
        int sum = a + b;
        String res = a+" + "+b+" = "+sum;
        return res;
    }
    public static String sub(int a, int b) {
        System.out.println("Subtracting two Integers");
        int sub = a - b;
        String res = a+" - "+b+" = "+sub;
        return res;
    }
    public static String multi(int a, int b) {
        System.out.println("Multiplying two Integers");
        int mul = a * b;
        String res = a+" * "+b+" = "+mul;
        return res;
    }
    public static String div(int a, int b) {
        System.out.println("Dividing two Integers");
        int div = a / b;
        String res = a+" / "+b+" = "+div;
        return res;
    }

}
