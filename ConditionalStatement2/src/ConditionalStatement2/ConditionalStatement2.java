package ConditionalStatement2;

import java.util.Scanner;

/**
 * @author Alondra Bio
 */
public class ConditionalStatement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Negate();
    }
    
    public static void oddEven(){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String isEven = (num%2 == 0) ? "EVEN!" : "ODD!";
        System.out.println(isEven);
    }
    
    public static void EvenOdd(){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println((num%2 == 0) ? "EVEN!" : "ODD!");
    }
    
    //short hand if-else
    public static void makeNegative(){
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int positive = scan.nextInt();
        // variable = (condition) ? ifTrue : ifFalse;
        int negative = (positive > 0) ? -positive : positive;
        System.out.println("Negative Value: "+negative);
    }
    
    //short hand if-else
    public static void Negate(){
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int positive = scan.nextInt();
        System.out.println("Negate: "+ (-positive));
    }
    
    //Legal age or minor
    public static void age(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age  = in.nextInt();
        String checkAge = (age >= 18 && age <=100) ? 
        "You are in legal age!" : "You are a minor!";
        System.out.println(checkAge);        
    }
    
    //short hand else-if
    public static void ageValid(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age  = in.nextInt();
        String checkAge = (age <= 0 || age > 100) ?
        "Invalid age." : ((age >= 18) ? 
        "You are in legal age!" : "You are a minor!");
        System.out.println(checkAge); 
    }
    
    //Switch with no break
    public static void weekdays(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter number from 1-7: ");
        int day = in.nextInt();
        switch (day) {
            case 1: System.out.println("It's Monday!");
            case 2: System.out.println("It's Tuesday!");
            case 3: System.out.println("It's Wednesday!");
            case 4: System.out.println("It's Thursday!");
            case 5: System.out.println("It's Friday!");
            case 6: System.out.println("It's Saturday!");
            case 7: System.out.println("It's Sunday!");
            default:System.out.println("Invalid");
        }
    }
    
    //Switch with break
    public static void weekday(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter number from 1-7: ");
        int day = in.nextInt();
        switch (day) {
            case 1: System.out.println("It's Monday!");break;
            case 2: System.out.println("It's Tuesday!");break;
            case 3: System.out.println("It's Wednesday!");break;
            case 4: System.out.println("It's Thursday!");break;
            case 5: System.out.println("It's Friday!");break;
            case 6: System.out.println("It's Saturday!");break;
            case 7: System.out.println("It's Sunday!");break;
            default:System.out.println("Invalid");break;
        }
    }
    
    public static void oddevenSwitch(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int rem = num%2;
        switch (rem) {
            case 0: //integers, char and String
                System.out.println("EVEN!");
                break;
            default:
                System.out.println("ODD!");
        }
    }
    public static void oddevenSwitch1(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        switch (num%2) {
            case 0: //integers, char and String
                System.out.println("EVEN!");
                break;
            default:
                System.out.println("ODD!");
        }
    }
    public static void oddevenSwitch2(){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        switch (num%2) {
            case 1: //integers, char and String
                System.out.println("ODD!");
                break;
            default:
                System.out.println("EVEN!");
        }
    }
    //Create a program that check if a letter is a vowel or consonant
    public static void vowels(){
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scan.next().charAt(0);
        switch(letter){
            case 'A': case 'E': case 'I': case 'O': case 'U': case 'Y':
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                System.out.println("It's a VOWEL!"); break;
            default:
                System.out.println("It's a CONSONANT");
        }
    }
    
    //Check the spelling of a digit and then return the number
    public static void spellNum(){
    Scanner input = new Scanner(System.in);
        System.out.println("Spell a number from 0-9: ");
        String spell = input.nextLine().toLowerCase();
        switch(spell){
            case "zero":System.out.println("That's 0");break;
            case "one":System.out.println("That's 1");break;
            case "two":System.out.println("That's 2");break;
            case "three":System.out.println("That's 3");break;
            case "four":System.out.println("That's 4");break;
            case "five":System.out.println("That's 5");break;
            case "six":System.out.println("That's 6");break;
            case "seven":System.out.println("That's 7");break;
            case "eight":System.out.println("That's 8");break;
            case "nine":System.out.println("That's 9");break;
            default:
                System.out.println("Pick numbers from 0-9 only, or kindly check your spelling.");
        }
    }
}
