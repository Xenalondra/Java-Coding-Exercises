package arrayscodingdemo;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Ms. Xeniorita Alondra Bio
 */
public class ArraysCodingDemo {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Call your method here
    }
    public static void sample1() {
        //basetype[] arrayName = new basetype[length];
        //Declaration / instantiation - create array
        //populating an array
        String[] names = new String[6];
        names[0] ="Angelo";
        names[1] ="Anita";
        names[2] ="RM";
        names[3] ="Walter";
        names[4] ="Jib";
        names[5] ="Eminem";
        names[0] ="kate";
        System.out.println(names[0]);
    }

    public static void sample2() {
        int[] someNums = {38, 14, 25, 30, 28};
        System.out.println(someNums[0]);
        System.out.println(someNums[1]);
        System.out.println(someNums[2]);
        System.out.println(someNums[3]);
        System.out.println(someNums[4]);
    }

    public static void sample3() {
        int[] someNums = {38, 14, 25, 30, 28};
        for (int i = 0; i < someNums.length; i++) {
            System.out.println(someNums[i]);
        }
    }
    
    public static void sample4() {
        String[] names = new String[6];
        names[0] ="June";
        names[1] ="July";
        names[2] ="Jane";
        names[3] ="Jean";
        names[4] ="John";
        names[5] ="Joan";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[0]);
        }
    }

    public static void sample5() {
        //Create an array, populate it with random numbers from 1 - 100
        //random.nextInt(max) + min;   
        System.out.println("Printing random numbers from 1-100");
        int[] randomNum = new int[5];
        for (int i = 0; i < 5; i++) {
            //(int) (Math.random() * max) + min
            randomNum[i] = (int) (Math.random() * 100) + 1;
            System.out.printf("Index %d: %d%n", i, randomNum[i]);
        }
    }
    
    public static void sample6() {
        System.out.println("Printing random numbers from 1-100");
        int[] randomNum = new int[5];
        int largest = 0;
        double total = 0, avg;
        for (int i = 0; i < 5; i++) {
            //(int) (Math.random() * max) + min
            randomNum[i] = (int) (Math.random() * 100) + 1;
            System.out.println(randomNum[i]);
            if (randomNum[i] > largest) largest = randomNum[i];
            total += randomNum[i];
        }
        avg = total / 5;
        System.out.printf("TOTAL   : %.2f%n", total);
        System.out.printf("AVERAGE : %.2f%n", avg);
        System.out.printf("LARGEST : %d%n", largest);
    }
    
    /*Ask for how many numbers to save in the array. After the array is populated
    print the numbers using loop.
     */
    public static void sample7() {
        System.out.print("How many numbers? ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        //First loop is to populate the array
        for (int i = 0; i < count; i++) {
            numbers[i] =  scanner.nextInt();
        }
        System.out.println("SAVED THE NUMBERS TO THE COLLECTION");
        System.out.println("Printing the elements of the ARRAY");
        //Second loop is to display the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Index %d: %d%n", i, numbers[i]);
        }
    }

    public static void sample8() {
        /*
        Create a program that stores the score of the user depending on the number of 
        students. After the scores are added to the array add an incentive that is
        again from the input of the user. Lastly, display the scores of the student.
        */
        System.out.print("How many students? ");
        int numStuds = scanner.nextInt();
        int[] scores = new int[numStuds];
        System.out.println("Enter score: ");
        for (int i = 0; i < numStuds; i++) {
            scores[i] = scanner.nextInt();
        }
        System.out.println("Successfully added all scores");
        System.out.print("How many incentives to add? ");
        int plus = scanner.nextInt();
        System.out.println("New Scores:");
        for (int i = 0; i < numStuds; i++) {
            scores[i] += plus;
            System.out.println(scores[i]);
        }
    }
    
    //Accessing an array using the index
    public static void sample9() {
        System.out.print("How many friends do you have? ");
        int numFriends = scanner.nextInt();
        scanner.nextLine();
        String[] friends = new String[numFriends];
        for (int i = 0; i < numFriends; i++) {
            System.out.printf("Friend %d : ", i);
            friends[i] = scanner.nextLine();
        }
        System.out.println("DISPLAYING FRIEND BY INDEX");
        int friend = scanner.nextInt();
        if (friend >= 0 && friend < 5) 
            System.out.printf("That's my friend %s with index %d%n", friends[friend], friend);
        else
            System.out.println("Invalid index.");
    }
    
    //Searching friend by element
    public static void sample10() {
        System.out.print("How many friends do you have? ");
        int numPrens = scanner.nextInt();
        scanner.nextLine();//only after we used nextInt(), nextDouble followed by nextLine()
        String[] prends = new String[numPrens];
        for (int i = 0; i < numPrens; i++) {
            System.out.print("Friend "+i+" : ");
            prends[i] = scanner.nextLine();
        }
        System.out.println("SUCCESSFULLY SAVED!");
        System.out.print("SEARCH FRIEND : ");
        String search = scanner.nextLine();
        boolean existing = false;
        for (int i = 0; i < prends.length; i++) {
            if (prends[i].equalsIgnoreCase(search)) {
                 System.out.println(prends[i] + " found!"); 
                 existing = true;
            } 
        }
        if(!existing){
            System.out.println("Friend not found!");
        }
    }
    
    public static void fruitsColor() {
        String[] colors = new String[5];
        String[] fruits = new String[5];
        boolean hasfound = false;
        System.out.println("ENTER 5 FRUITS AND THEIR COLOR");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Fruit : ");
            fruits[i] = scanner.nextLine();
            System.out.print("Color : ");
            colors[i] = scanner.nextLine();
            System.out.println();
        }
        System.out.print("SEARCH BY COLOR : ");
        String color = scanner.nextLine();
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equalsIgnoreCase(color)) {
                System.out.println(fruits[i]+" is color "+ colors[i]);
                hasfound = true;
            }
        }
        if (!hasfound) System.out.println("No fruit of the same color is saved in our database.");
    }
}
