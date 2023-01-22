
package LoopsAndString;
import java.util.Scanner;
/**
 *
 * @author Alondra Bio
 */
public class LoopsAndString {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // call your method here
        triangle6();
    }    
    public static void recap(){
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
    
    /*Print a right triangle using the for loop but instead of star it should be 
    same number every column starting from 1 to the end of column depending on the number of rows the user wants.
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5 
    1 2 3 4 5 6 
    1 2 3 4 5 6 7 
    */
    public static void triangle3(){
        System.out.println("Printing a half Right Pyramid");
        System.out.print("How many rows do you want? ");
        int rows = scanner.nextInt();
        int i=1;
        for (int r = 1; r <= rows; r++) {
            for (int col = 1; col <= r; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    /*Print a right triangle using the for loop but instead of star it should be 
    same number every row starting from 1 to the end of row depending on the number of rows the user wants.
    1 
    2 2 
    3 3 3 
    4 4 4 4 
    5 5 5 5 5 
    6 6 6 6 6 6 
    */
    public static void triangle4(){
        System.out.println("Printing a half Right Pyramid");
        System.out.print("How many rows do you want? ");
        int rows = scanner.nextInt();
        int i=1;
        for (int r = 1; r <= rows; r++) {
            for (int col = 0; col < r; col++) {
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
    
    //Hourglass
    public static void triangle5(){
        int row = 5, i;
        for ( i = 0; i < row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }
                System.out.println();
        }
        for (int k = 1; k < 5; k++) {
            for (int l = row - k; l > 1; l--) {
                System.out.print(" "); 
            }
            for (int l = 0; l <= k; l++) {
                System.out.print("* ");
            }
                System.out.println();
            }
    }
    
    //Diamond
    public static void triangle8(){
        int row = 6, i, j;
        for (i = 0; i < row; i++) {
            for (j = row-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for ( i = 0; i < row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = i; j < row; j++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }
    
    //Inverted Pyramid using letters
    public static void triangle6(){
        int i, j, row = 5; char letter = 'A';
        for (i = 5; i >= 0; i--) {
            for ( j = row-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++, letter++) {
                System.out.print(letter + " ");
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
    
    /*
    Test if the word starts with uppercase or lowercase
    */
    public static void firstChar(){
    Scanner in = new Scanner(System.in);
        System.out.println("I will tell you a word starts with uppercase or lowercase!");
        System.out.print("Enter a word: ");
        String word = in.next();
        char firstChar = word.charAt(0);
        if (Character.isLetter(firstChar)){
            if (Character.isLowerCase(firstChar)){
                System.out.println("The word starts with a Lowercase letter");
            }else if (Character.isUpperCase(firstChar)){
                System.out.println("The word starts with an Uppercase letter");
            }
        }else{
                System.out.println("Invalid input.");
        }
    }
    
    /*
    Create a program that replace a letter in a message (Series of String)
    with another letter.
    */
    public static void replaceLetter(){
        System.out.println("THIS IS A CODE MESSAGE CREATOR!");
        System.out.println("Enter a message: ");
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        System.out.print("Enter a Letter to replace a letter\nReplace Letter: ");
        char letter1 = in.next().charAt(0);
        System.out.print("With letter: ");
        char letter2 = in.next().charAt(0);
        if (!message.isEmpty()){
            String result = message.replace(letter1, letter2);
            System.out.println("The new message is \n"+result);
        }else{
                System.out.println("Invalid Message.");
        }
        
    }
    
    /*
    Create a program that ask for any character as long as it is a digit and 
    it is a letter. If the character entered is a symbol print "I told you to 
    enter a letter or digit only." and ends.
    */
    public static void letterDigit(){
        System.out.println("Enter a LETTER or a DIGIT");
        char start = scanner.next().charAt(0);
        while (Character.isLetter(start) || Character.isDigit(start)) {            
             start = scanner.next().charAt(0);
        }
        System.out.println("I told you to enter a letter or digit only.");
    }
    
    /*
    create a program that ask the user to continously enter a character or letter, we will 
    return "That's a letter" if the character is a letter and return "That's a number"
    if the character is a number. If the user enter anything else print "That's 
    not a LETTER or a DIGIT" end the loop.
    */
    public static void letterOrNum(){
        System.out.println("Enter a Letter or a Digit.");
        char input = scanner.next().charAt(0);
        while (Character.isDigit(input) || Character.isLetter(input)){  
            if (Character.isDigit(input)) {
                System.out.print("That's a number");
            } else if (Character.isLetter(input)){
                System.out.println("That's a letter");
            }
            input = scanner.next().charAt(0);
        } 
        System.out.println("That's not a LETTER or a DIGIT");
    }
    
    /*
    Printing using the printf() method and using the .format() String method.
    */
    public static void printing(){
        double tryThis = 120.25364;
        System.out.printf("%.0f%n"  ,tryThis);
        System.out.printf("%.1f%n"  ,tryThis);
        System.out.printf("The number %.2f is rounded off to 2 decimal places",tryThis);
        System.out.printf("%n%.3f%n",tryThis);
        System.out.printf("%.4f%n"  ,tryThis);
        System.out.printf("%.5f%n"  ,tryThis);
        String format = String.format("The number rounded off to 2 decimal places %.2f%n",
               tryThis);
        System.out.println(format);
    }
    /*
    Create a program that takes the seconds and print it in this format, hh:mm:ss
    */
    public static void secondsConverter1(){
        System.out.print("Input seconds: ");
	int secs = scanner.nextInt();
        int hours = secs / 3600;
        int minutes = (secs % 3600) / 60;
        int seconds = secs % 60;
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		System.out.println(timeString);
    }
    
    //Using some of the String Methods (indexOf(), concat(), toUpperCase(), toLowerCase())
    public static void stringExamples(){
    //returns the index of the letter in a string
        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("o"));
    
    //concat examples
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    
    //Convert the string into Upper Case
        String toUpper = "Hello";
        System.out.println(toUpper.toUpperCase());
        
    //Convert the String to lower case
        String toLower = "Hello";
        System.out.println(toLower.toLowerCase());
    
    //Get the Length of the String
        String getLength = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + getLength.length());

    }
    
    /*
    Create a program that replace a profane word to a child friendly words
    */
    public static void replaceWord(){
        System.out.println("I WILL REPLACE BAD WORDS WITH APPROPRIATE OR FRIENDLY TERMS!");
        System.out.println("Enter a message: ");
        Scanner in = new Scanner(System.in);
        String message = in.nextLine().toLowerCase();
        String newMessage;
        if (!message.isEmpty()){
               newMessage = message.replace("fucking", "freaking")
                      .replace("fuck", "fudge")
                      .replace("son of a bitch","son of a biscuit")
                      .replace("damn", "darn")
                      .replace("shit", "shoot")
                      .replace("hell", "heck");
               System.out.println("Censored Message:\n"+newMessage);
        }else{
            System.out.println("Invalid Message.");
        }
    }
    
    /*
    Create a program that encrypt a message using the caesar Cipher
    */
    public static void cipherMessage(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the plaintext message : ");
        String plaintext = in.nextLine();
        System.out.print("Enter the shift value : ");
        int shift = in.nextInt();
        String message = "";
        char alphabet;
        for (int i = 0; i < plaintext.length(); i++) {
            // Shift one character at a time
            alphabet = plaintext.charAt(i);
            // if alphabet lies between a and z (lowercase)
            if (alphabet >= 'a' && alphabet <= 'z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                // if shift alphabet greater than 'z'
                if (alphabet > 'z') {
                    // reshift to starting position 
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                message += alphabet;

                //if alphabet lies between A and Z (Uppercase)
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Z') {
                    //reshift to starting position 
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                message += alphabet;
            } else {
                message += alphabet;
            }

        }
        System.out.println("Encrypted Message: ");
        System.out.println(message);
    }
    
    public static void decipherMessage(){
    Scanner in = new Scanner(System.in);
        System.out.println("Input the encrypted message : ");
        String message = in.nextLine();
        System.out.print("Enter the shift value : ");
        int shift = in.nextInt();
        String decryptMessage = "";
        for(int i=0; i < message.length();i++)  
        {
            // Shift one character at a time
            char alphabet = message.charAt(i);
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z'){
                // shift alphabet
                alphabet = (char) (alphabet - shift);
                // shift alphabet lesser than 'a'
                if(alphabet < 'a') {
                    //reshift to starting position 
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage += alphabet;
            } else if(alphabet >= 'A' && alphabet <= 'Z'){
             // shift alphabet
                alphabet = (char) (alphabet - shift);
                //shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position 
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage += alphabet;            
            } else {
             decryptMessage += alphabet;            
            } 
        }
        System.out.println("Decrypted Message :" );
        System.out.println(decryptMessage);
    }
}
