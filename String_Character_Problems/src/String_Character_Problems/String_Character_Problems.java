
package String_Character_Problems;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class String_Character_Problems {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mp4C();
    }
    
    public static void mp1() {
        String word, replacer ="";
        do {
            System.out.println("Please enter at least 4 Character word to censor: ");
            word = scanner.nextLine().toLowerCase();
        } while (word.length() < 4);
        System.out.println("Enter a message: ");
        String message = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            replacer += "*"; 
        }
        String newMessage = message.replace(word, replacer);
        System.out.printf("Censored Message: %n%s%n", newMessage);
    }
    
    public static void mp2() {
        System.out.print("Enter a 4 letter word that starts with A: \n> ");
        String word = scanner.nextLine().toLowerCase();
        while (!word.equals("stop")) {
            if (word.length() == 4 && word.startsWith("a")) {
                System.out.println("That's right!");
            }if (word.length() != 4) {
                System.out.println("That is not a 4 letter word");
            }if (!word.startsWith("a")) {
                System.out.println("That is not a word that starts with A");
            }
            System.out.print("> ");
            word = scanner.nextLine().toLowerCase();
        }
    }
    
    /*
    Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this exercise (but not y).
    */
    public static void mp3() {
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.toLowerCase().charAt(i)) {
                case 'a': case 'e': case 'i': case 'o': case 'u': 
                counter++;
            }
        }
        if (counter > 0) System.out.printf("Number of vowels: %d%n", counter);
        else System.out.printf("There are no vowels in the String %s%n",str);
    }
    
    /*
    ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain 
    anything but exactly 4 digits or exactly 6 digits. If the function is passed
    a valid PIN string, return "Successfully Changed Your Pin", else return 
    "Invalid Pin Number".
    */
    public static void mp4() {
        int validator = 0; boolean valid = false, hasLetter = false; 
        System.out.println("Pin should be exactly 4 or 6 digits only.");
        do{
        System.out.print("Change your Pin number: ");
        String pin = scanner.next();
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) hasLetter = true;
            }
            if ((pin.length() == 4 || pin.length() == 6) && hasLetter == false){
                valid = true;
                System.out.println("Successfully Changed Your Pin");
            } else {
                System.out.println("Invalid Pin Number.");
                hasLetter = false;
            }
        } while (!valid);
    }
    
    public static void mp4A() {
        int validator = 0; boolean valid = false;
        System.out.println("Pin should be exactly 4 or 6 digits only.");
        do{
        System.out.print("Change your Pin number: ");
        String pin = scanner.next();
            for (int i = 0; i < pin.length(); i++) {
                if (Character.isDigit(pin.charAt(i))) validator++;
            }
            if ((pin.length() == 4 || pin.length() == 6) && (validator == pin.length())){
                valid = true;
                System.out.println("Successfully Changed Your Pin");  
            } else {
                System.out.println("Invalid Pin Number.");
                validator = 0;
            }
        } while (!valid);
    }
    
    public static void mp4B() {
        int validator = 0; boolean valid = false;
        System.out.println("Pin should be exactly 4 or 6 digits only.");
        do{
        System.out.print("Change your Pin number: ");
        String pin = scanner.next();
            for (int i = 0; i < pin.length(); i++) {
                if (Character.isDigit(pin.charAt(i))) validator++;
            }
            if ((pin.length() == 4 || pin.length() == 6) && (validator == pin.length())){
                valid = true;
                System.out.println("Successfully Changed Your Pin");  
            } else {
                System.out.println("Invalid Pin Number.");
                validator = 0;
            }
        } while (!valid);
    }
    
    public static void mp4C() {
        boolean valid = false;
        System.out.println("Pin should be exactly 4 or 6 digits only.");
        do{
        System.out.print("Change your Pin number: ");
        String pin = scanner.next();
            if ((pin.length() == 4 && 
                (Character.isDigit(pin.charAt(0))  && 
                Character.isDigit(pin.charAt(1))   &&
                Character.isDigit(pin.charAt(2))   && 
                Character.isDigit(pin.charAt(3)))) || 
                (pin.length() == 6 && 
                (Character.isDigit(pin.charAt(0))  && 
                Character.isDigit(pin.charAt(1))   &&
                Character.isDigit(pin.charAt(2))   && 
                Character.isDigit(pin.charAt(3))   &&
                Character.isDigit(pin.charAt(4))   && 
                Character.isDigit(pin.charAt(5))))) 
            {
                    valid = true;
                    System.out.println("Successfully Changed Your Pin");  
            } else {
                System.out.println("Invalid Pin Number.");
            }
        } while (!valid);
    }
    
    //palindrome checker using int
    public static void mp5(){
        int number, temp, remainder, reverse = 0; boolean invalid; String result;
        System.out.println("PALINDROME DETECTOR");
        do {            
            System.out.print("Enter a 5 digit number: ");
            number = scanner.nextInt();
            temp = number;
            invalid = (number < 9999 || number > 100000);
        } while (invalid == true);
        while (temp > 0) {
	    remainder = temp%10;
	    reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.printf("Number in reverse: %d%n", reverse);
        result = (number == reverse) ? number + " is a Palindrome": 
                                       number + " is not a Palindrome";
        System.out.println(result);
    }
    //palindrome checker using int
    public static void mp5A(){
        int number = 0, num1, num2, num3, num4, num5, div = 10; boolean invalid;
        System.out.println("PALINDROME DETECTOR");
        do {            
            System.out.print("Enter a 5 digit number: ");
            number = scanner.nextInt();
            invalid = (number < 9999 || number > 100000);
        } while (invalid == true);
        num1 = number / 10000;
        num2 = number % 10000 / 1000;
        num3 = number % 10000 % 1000 / 100;
        num4 = number % 10000 % 1000 % 100 / 10;
        num5 = number % 10000 % 1000 % 100 % 10;
        System.out.printf("Number in reverse: %d%d%d%d%d%n", num5,num4,num3,num2,num1);
        if (num1 == num5 && num2 == num4) System.out.printf("%d is a Palindrome%n", number);
        else System.out.printf("%d is not a Palindrome%n", number);
    }
    
    //palindrome checker using int
    public static void mp5B(){
        int number, temp, remainder, reverse = 0, count;
        System.out.println("PALINDROME DETECTOR");
        do {            
            System.out.print("Enter a 5 digit number: ");
            number = scanner.nextInt();
            count = (number +"").length();
            temp = number;
        } while (count != 5);
        while(temp > 0) {
	    remainder = temp%10;
	    reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.printf("Number in reverse: %d%n", reverse);
        if (number == reverse) System.out.printf("%d is a Palindrome%n", number);
        else System.out.printf("%d is not a Palindrome%n", number);
    }
    
    //palindrome checker using String
    public static void mp6(){
        String num, reverse, result; int length;
        System.out.println("PALINDROME DETECTOR");
        do {            
            System.out.print("Enter a 5 digit number: ");
            num = scanner.next();
        } while (num.length() != 5);
        System.out.printf("Number in reverse: %c%c%c%c%c%n", 
                num.charAt(4), num.charAt(3), num.charAt(2), num.charAt(1), num.charAt(0) );
        result = (num.charAt(0) == num.charAt(4) && num.charAt(1) == num.charAt(3)) ?  
                num + " is a Palindrome": num + " is not a Palindrome";
        System.out.println(result);
    }
    
    public static void mp6A(){
        String num, reverse = "", result; int length;
        System.out.println("PALINDROME DETECTOR");
        do {            
            System.out.print("Enter a 5 digit number: ");
            num = scanner.next();
        } while (num.length() != 5);
        length = num.length();
        for (int i = 0; i < length; --length) {
            reverse += num.charAt(length-1);
        }
        System.out.printf("Number in reverse: %s%n", reverse);
        result = (num.equals(reverse)) ?  num + " is a Palindrome" : 
                                           num + " is not a Palindrome";
        System.out.println(result);
    }
    public static void mp6B(){
        String num, reverse, result; int length;
        System.out.println("PALINDROME DETECTOR");
        do {            
            System.out.print("Enter a 5 digit number: ");
            num = scanner.next();
        } while (num.length() != 5);
        reverse = Character.toString(num.charAt(4)) + 
                  Character.toString(num.charAt(3)) + 
                  Character.toString(num.charAt(2)) +
                  Character.toString(num.charAt(1)) + 
                  Character.toString(num.charAt(0));
        System.out.printf("Number in reverse: %s%n", reverse);
        result = (num.equals(reverse)) ?  num + " is a Palindrome": 
                                           num + " is not a Palindrome";
        System.out.println(result);
    }
    
    public static void mp7() {
        System.out.print("Enter a 4 letter word that starts with A: \n> ");
        String word = scanner.nextLine().toLowerCase();
        while (!word.equals("stop")) {
            if (word.length() == 4 && word.startsWith("a")) {
                System.out.println("That's right!");
            }if (word.length() != 4) {
                System.out.println("That is not a 4 letter word");
            }if (!word.startsWith("a")) {
                System.out.println("That is not a word that starts with A");
            }
            System.out.print("> ");
            word = scanner.nextLine().toLowerCase();
        }
    }
    
    public static void mp7A() {
        System.out.print("Enter a 4 letter word that starts with A: \n> ");
        String word = scanner.nextLine().toLowerCase();
        while (!word.equals("stop")) {
            if (word.length() == 4 && word.startsWith("a")) 
                System.out.println("That's right!");
            if (word.length() != 4)   
                System.out.println("That is not a 4 letter word");
            if (!word.startsWith("a"))
                System.out.println("That is not a word that starts with A");
            System.out.print("> ");
            word = scanner.nextLine().toLowerCase();
        } 
    }
    public static void mp8() {
        System.out.print("Enter a 5 letter word that ends with Y: \n> ");
        String word = scanner.nextLine().toLowerCase();
        while (!word.equals("stop")){
            if (word.length() == 5 && word.endsWith("y")) 
                System.out.println("That's right!");
            if (word.length() != 5)   
                System.out.println("That is not a 5 letter word");
            if (!word.endsWith("y"))
                System.out.println("That is not a word that ends with Y");
            System.out.print("> ");
            word = scanner.nextLine().toLowerCase();
        }
    }
    
    public static void mp8A() {
        System.out.print("Enter a 5 letter word that ends with Y: \n> ");
        String word = scanner.nextLine().toLowerCase();
        while (!word.equals("stop")) {
            if (word.length() == 5 && word.endsWith("y")) {
                System.out.println("That's right!");
            } else {
                if (word.length() != 5)   
                System.out.println("That is not a 5 letter word");
                if (!word.endsWith("y"))
                System.out.println("That is not a word that ends with Y");
            }
            System.out.print("> ");
            word = scanner.nextLine().toLowerCase();
        } 
    }
}
