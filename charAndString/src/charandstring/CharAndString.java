package charandstring;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class CharAndString {
    /*
       Character Class
       .isLowerCase()
       .isUpperCase()
       .isLetterOrDigit()
       .isLetter()
       .isDigit()
       .toLowerCase()
       .toUpperCase()
       
       String Class
       .toUpperCase()
       .toLowerCase()
       .equals()
       .equalsIgnoreCase
       .contains()
       .format()
       .concat()
       .startsWith()
       .endsWith()
       .indexOf()
       .length()
       .replace(oldChar, newChar)
       .replace(target, replacement)
       */
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    }
 
    public static void convertChar(){
    /*
    Using the Character class test if the letter starts with uppercase or 
    lowercase. If the character starts with lowercase convert it to Uppercase 
    and vice versa.
    */
    Scanner in = new Scanner(System.in);
        System.out.println("I will tell you a word starts with uppercase or lowercase!");
        System.out.print("Enter a word: ");
        String word = in.next();
        char firstChar = word.charAt(0);
        if (Character.isLetter(firstChar)){
            if (Character.isLowerCase(firstChar)){
                System.out.println("The word starts with a Lowercase letter");
                System.out.println("Converted to Uppercase: "+ Character.toUpperCase(firstChar));
            }else if (Character.isUpperCase(firstChar)){
                System.out.println("The word starts with an Uppercase letter");
                System.out.println("Converted to lowercase: "+ Character.toLowerCase(firstChar));
            }
        }else{
                System.out.println("Invalid input.");
        }
    }
    
    public static void convertChar2(){
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        if (Character.isUpperCase(letter)) {
            System.out.println("Converted to lowercase: "+ Character.toLowerCase(letter));
        } else if (Character.isLowerCase(letter)) {
            System.out.println("Converted to Uppercase: "+ Character.toUpperCase(letter));
        } else {
            System.out.println("Please enter a letter only.");
        }
    }
    
    public static void letterDigit(){
    /*
    Create a program that ask for any character as long as it is a digit and 
    it is a letter. If the character entered is a symbol print "I told you to 
    enter a letter or digit only." and ends.
    */
       System.out.println("Enter a letter or Digit:");
        char letter;
        do {            
            letter = scanner.next().charAt(0);
        } while (Character.isLetterOrDigit(letter));
        System.out.println("I told you to enter a letter or digit only.");
    }
    
    public static void symbol(){
        System.out.println("Enter a symbol");
        char letter;
        do {            
            letter = scanner.next().charAt(0);
        } while (!Character.isLetterOrDigit(letter));
        System.out.println("I told you to enter a symbol");
    }
    
    public static void letterOrNum(){
    /*
    create a program that ask the user to continously enter a character or letter, we will 
    return "That's a letter" if the character is a letter and return "That's a number"
    if the character is a number. If the user enter anything else print "That's 
    not a LETTER or a DIGIT" end the loop.
    */
        System.out.println("Enter a Letter or a Digit.");
        char input = scanner.next().charAt(0);
        while (Character.isLetterOrDigit(input)){  
            if (Character.isDigit(input)) {
                System.out.print("That's a number");
            } else if (Character.isLetter(input)){
                System.out.println("That's a letter");
            }
            input = scanner.next().charAt(0);
        } 
        System.out.println("That's not a LETTER or a DIGIT");
    }
    
    public static void replaceLetter(){
    /*
    Create a program that replace a letter in a message (Series of String)
    with another letter.
    */
        System.out.println("THIS IS A CODE MESSAGE CREATOR!");
        System.out.println("Enter your message:");
        String message = scanner.nextLine();
        System.out.print("Replace letter: ");
        char papalitan = scanner.next().charAt(0);
        System.out.println("Replace with: ");
        char ipapalit = scanner.next().charAt(0);
        String newMessage = message.replace(papalitan, ipapalit);
        System.out.printf("New Message: %n%s%n", newMessage);
        
    }
    
    //Printing using the printf() method and using the .format() String method.
    public static void printing(){
        //%n - newline , Platform specific newline character for greater 
        //%s - String format specifier
        String fname = "Xeniorita Alondra";
        String lname = "Bio";
        System.out.printf("Hello ako nga pala si %s %n", fname);
        System.out.printf("Ako ay si %s cutie pie.%n", fname);
        System.out.printf("My firstname is %s and my lastname is %s%n", fname, lname);
        
        //Printing the same String value in one statement
        //Make sure to have the same number of conversion character and variable (parameter)
        System.out.printf("Ang %s ay BI-YO hindi %s sa Biogesic at %s sa Bioflu%n"
                            , lname, lname, lname);
        
        //%S - String format in UPPERCASE
        System.out.printf("Hello ako nga pala si %S%n", fname);
        System.out.printf("Ako ay si %S cutie pie.%n", fname);
        
        //%c - Character format specifier
        //%C - Character format in UPPERCASE
        char middle = 'l';
        System.out.printf("My middle initial is %c%n", middle);
        System.out.printf("My middle initial is %C%n", middle);
        
        //%d - integer value (decimal value)
        int age = 20;
        int ageMo = 19;
        System.out.printf("Hello my age is %d and your age is %d%n", age, ageMo);
        System.out.printf("Ako ay %d taong gulang%n", age);
        
        //you can use any mix of data with different datatype in one statement
        System.out.printf("My firstname is %s, my middle initial is %C. and my lastname is %s.%nI am %d years old%n"
                            , fname, middle, lname, age);
        
        //.format() method 
        String formatted = String.format("My firstname is %s, my middle initial is %C. and my lastname is %s.%nI am %d years old%n"
                            , fname, middle, lname, age);
        System.out.println(formatted);
        
        //%f - floating point numbers (numbers w/ decimal point) (has a default of 6 decimal places)
        String product = "Notebook";
        double price = 25.8642;
        System.out.printf("A %s cost PHP %f%n", product, price);
        
        //%.0f%n , %.0f, - floating point precision and equality
        product = "Sibuyas";
        price = 30.58632;
        System.out.printf("Ang mahal ng %s ang presyo PHP %.0f%n",product, price);
        System.out.printf("Ang mahal ng %s ang presyo PHP %.1f%n",product, price);
        System.out.printf("Ang mahal ng %s ang presyo PHP %.2f%n",product, price);
        System.out.printf("Ang mahal ng %s ang presyo PHP %.3f%n",product, price);
        System.out.printf("Ang mahal ng %s ang presyo PHP %.4f%n",product, price);
        System.out.printf("Ang mahal ng %s ang presyo PHP %.5f%n",product, price);
        
        //%02d - zero padding for numbers
        int num = 5;
        System.out.printf("The number 5 has 02d format: %02d%n",num);
        System.out.printf("The number 5 has 03d format: %03d%n",num);
        System.out.printf("The number 5 has 04d format: %04d%n",num);
        System.out.printf("The number 5 has 05d format: %05d%n",num);
        
        //%02d:%02d:%02d
        int hour = 3;
        int minutes = 5;
        int sec = 20;
        System.out.printf("Time is %02d:%02d:%02d%n"
            , hour, minutes, sec);
        
        //%, - comma grouping separator for numbers >1000
        //%,d integer value with comma separator
        System.out.print("Enter a thousand: ");
        int th = scanner.nextInt();
        String out = String.format("The formatted number is %,d", th);
        System.out.println(out);
        System.out.printf("The formatted number is %,d%n", th);
        
        //%.02f - floating point number with comma separator
        System.out.println("Enter a thousand with decimal point: ");
        double thd = scanner.nextDouble();
        String out2 = String.format("The formatted number is %,.03f", thd);
        System.out.println(out2);
        System.out.printf("The formatted number is %,.02f%n", thd);
        scanner.nextLine();
    }        
    
    public static void concat(){
        //concat() examples
        System.out.println("Firstname: ");
        String fn = scanner.nextLine().concat(" ");
        System.out.println("Lastname: ");
        String ln = scanner.nextLine();
        System.out.println(fn.concat(ln));
    }
    
    public static void startsWith() {
        System.out.println("Enter a word that starts with A");
        String word;
        do {            
            word = scanner.next().toLowerCase();
        } while (word.startsWith("a"));
        System.out.println("That is not a word that starts with A");
    }
    
    public static void endsWith() {
        System.out.println("Enter a word that ends with Y");
        String word;
        do {            
            word = scanner.next().toLowerCase();
        } while (word.endsWith("y"));
        System.out.println("That is not a word that ends with Y");
    }
    
    public static void indexOf(){
        //indexOf() returns the index of the letter in a string
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.print("Find letter: ");
        String letter = scanner.next();
        int index = word.indexOf(letter);
        if (index < 0) {
            System.out.printf("The letter %s is not found in the word %s%n", letter, word);
        } else {
            System.out.printf("The letter %s is located at index %d%n", letter, index);
        }
    }
    
    public static void getLength(){
        System.out.println("REGISTER FORM");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        if (email.contains("@")) {
            System.out.print("Password: ");
            String pw = scanner.nextLine();
            if (pw.length() >= 8) {
                System.out.print("Confirm Password: ");
                String confirmP = scanner.nextLine();
                if (pw.equals(confirmP)) {
                    System.out.println("Sucessfully registered.");
                } else {
                    System.out.println("Password did not match.");
                }
            } else {
                System.out.println("Password should have at least 8 Characters.");
            }
        } else {
            System.out.println("Please enter a valid email.");
        }
    }
    
    public static void censor(){
        System.out.println("Enter a comment:");
        String comment = scanner.nextLine().toLowerCase();
        String censored = comment.replace("fucking", "freaking")
                      .replace("fuck", "fudge")
                      .replace("son of a bitch","son of a biscuit")
                      .replace("damn", "darn")
                      .replace("shit", "shoot")
                      .replace("hell", "heck");
        System.out.printf("Censored comment:%n%s%n", censored);
    }
}
