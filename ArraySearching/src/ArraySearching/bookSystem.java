/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraySearching;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class bookSystem {

    static Scanner scanner = new Scanner(System.in);

    //ONE METHOD CODE FOR BOOK
    public static void bookLib() {
        String[] bookName = {
            "To Kill a Mockingbird",
            "1984",
            "Harry Potter",
            "The Lord of the Rings",
            "Pride and Prejudice",
            "The Book Thief",
            "The Hobbit",
            "Animal Farm"
        };
        String[] authors = {
            "Harper Lee",
            "George Orwell",
            "J.K. Rowling",
            "J.R.R. Tolkien",
            "Jane Austen",
            "Markus Zusak",
            "J.R.R. Tolkien",
            "George Orwell"
        };
        double[] ratings = {4.6, 4.5, 4.52, 4.7, 4.8, 4.5, 4.6, 4.7};
        char ans;
        boolean foundBook = false, foundAuthor = false;
        
        do {
            ans = 0;
            System.out.println("WELCOME TO BOOKWORM LIBRARY!");
            System.out.println("What would you like to do?");
            String choices = "1. View All Books\n"
                    + "2. Search a Book\n"
                    + "3. Search an Author\n"
                    + "4. Rate a Book";
            System.out.println(choices);
            System.out.print("Enter number : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("\nDISPLAYING ALL THE BOOKS IN THE LIBRARY");
                    for (int i = 0; i < bookName.length; i++) {
                        System.out.printf("Book Number : %d%n", i + 1);
                        System.out.printf("Book Name   : %s%n", bookName[i]);
                        System.out.printf("Book Author : %s%n", authors[i]);
                        System.out.printf("Book Rating : %.2f%n", ratings[i]);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("SEARCH BOOK TITLE : ");
                    String search = scanner.nextLine().toLowerCase();
                    for (int i = 0; i < bookName.length; i++) {
                        if (bookName[i].toLowerCase().contains(search)) {
                            System.out.printf("Book Number : %d%n", i + 1);
                            System.out.printf("Book Name   : %s%n", bookName[i]);
                            System.out.printf("Book Author : %s%n", authors[i]);
                            System.out.printf("Book Rating : %.2f%n", ratings[i]);
                            foundBook = true;
                            System.out.println();
                        }
                    }
                    if (!foundBook) {
                        System.out.println("Sorry, we cannot find the book you are looking for.");
                    }
                    break;
                case 3:
                    System.out.print("SEARCH AUTHOR NAME : ");
                    String search2 = scanner.nextLine().toLowerCase();
                    for (int i = 0; i < 8; i++) {
                        if (authors[i].toLowerCase().contains(search2)) {
                            System.out.printf("Book Number : %d%n", i + 1);
                            System.out.printf("Book Name   : %s%n", bookName[i]);
                            System.out.printf("Book Author : %s%n", authors[i]);
                            System.out.printf("Book Rating : %.2f%n", ratings[i]);
                            foundAuthor = true;
                            System.out.println();
                        }
                    }
                    if (!foundAuthor) {
                        System.out.println("Sorry, we cannot find the author you are looking for.");
                    }
                    break;
                case 4:
                    System.out.println("\nDISPLAYING ALL THE BOOKS IN THE LIBRARY");
                    for (int i = 0; i < bookName.length; i++) {
                        System.out.printf("%d. %s%n", i + 1, bookName[i]);
                    }
                    System.out.print("\nEnter book number to rate : ");
                    int bookNum = scanner.nextInt() - 1;
                    if (bookNum >= 0 && bookNum <= bookName.length) {
                        System.out.print("Enter your rate (1 lowest - 5 highest) : ");
                        double rate = scanner.nextDouble();
                        if (rate >= 1 && rate <= 5) {
                            ratings[bookNum] = (ratings[bookNum] + rate) / 2;
                            System.out.printf("Successfully rated book %s%n", bookName[bookNum]);
                            System.out.printf("Book Number : %d%n", bookNum + 1);
                            System.out.printf("Book Name   : %s%n", bookName[bookNum]);
                            System.out.printf("Book Author : %s%n", authors[bookNum]);
                            System.out.printf("Book Rating : %.2f%n", ratings[bookNum]);
                        } else {
                            System.out.println("Invalid Rate. Please choose from 1-5 only.");
                        }
                    } else {
                        System.out.println("As of the moment we only have 8 books in our collection.");
                    }
                    break;
                default:
                    System.out.println("Invalid number. Pick only from 1-4");
            }
            System.out.print("Do you want to do another action (Y/N)?  ");
            ans = scanner.next().charAt(0);
        } while (ans == 'y');
        System.out.println("Thank you for visiting Bookworm Library!");
    }

    /*LIBRARY SYSTEM*/
    /**
     * Declaration of our collection
     */
    public static void books() {
        String[] bookName = {
            "To Kill a Mockingbird",
            "1984",
            "Harry Potter",
            "The Lord of the Rings",
            "Pride and Prejudice",
            "The Book Thief",
            "The Hobbit",
            "Animal Farm"
        };
        String[] authors = {
            "Harper Lee",
            "George Orwell",
            "J.K. Rowling",
            "J.R.R. Tolkien",
            "Jane Austen",
            "Markus Zusak",
            "J.R.R. Tolkien",
            "George Orwell"
        };
        double[] ratings = {4.6, 4.5, 4.52, 4.7, 4.8, 4.5, 4.6, 4.7};
        options(bookName, authors, ratings);
    }

    /**
     * Displaying the options
     *
     * @param bookName
     * @param authors
     * @param ratings
     */
    public static void options(String[] bookName, String[] authors, double[] ratings) {
        System.out.println("WELCOME TO BOOKWORM LIBRARY!");
        System.out.println("What would you like to do?");
        String choices = "1. View All Books\n"
                + "2. Search a Book\n"
                + "3. Search an Author\n"
                + "4. Rate a Book";
        System.out.println(choices);
        System.out.print("Enter number : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                viewAll(bookName, authors, ratings);
                break;
            case 2:
                if (!searchBook(bookName, authors, ratings)) {
                    System.out.println("Sorry, we cannot find the book you are looking for.");
                }
                break;
            case 3:
                if (!searchAuthor(bookName, authors, ratings)) {
                    System.out.println("Sorry, we cannot find the author you are looking for.");
                }
                break;
            case 4:
                rate(bookName, authors, ratings);
                break;
            default:
                System.out.println("Invalid number. Pick only from 1-4");
        }
        anotherAction(bookName, authors, ratings);
    }

    /**
     * Viewing all the books in the collection
     *
     * @param bookName
     * @param authors
     * @param ratings
     */
    public static void viewAll(String[] bookName, String[] authors, double[] ratings) {
        System.out.println("\nDISPLAYING ALL THE BOOKS IN THE LIBRARY");
        for (int i = 0; i < bookName.length; i++) {
            System.out.printf("Book Number : %d%n", i + 1);
            System.out.printf("Book Name   : %s%n", bookName[i]);
            System.out.printf("Book Author : %s%n", authors[i]);
            System.out.printf("Book Rating : %.2f%n", ratings[i]);
            System.out.println();
        }
    }

    /**
     * Searching for a specific book
     *
     * @param bookName
     * @param authors
     * @param ratings
     * @return
     */
    public static boolean searchBook(String[] bookName, String[] authors, double[] ratings) {
        boolean bookFound = false;
        String ans;
        System.out.print("SEARCH BOOK TITLE : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < bookName.length; i++) {
            if (bookName[i].toLowerCase().contains(search)) {
                System.out.printf("Book Number : %d%n", i + 1);
                System.out.printf("Book Name   : %s%n", bookName[i]);
                System.out.printf("Book Author : %s%n", authors[i]);
                System.out.printf("Book Rating : %.2f%n", ratings[i]);
                bookFound = true;
                System.out.println();
            }
        }
        return bookFound;
    }

    /**
     * Searching for an author
     *
     * @param bookName
     * @param authors
     * @param ratings
     * @return
     */
    public static boolean searchAuthor(String[] bookName, String[] authors, double[] ratings) {
        boolean authorFound = false;
        String ans;
        System.out.print("SEARCH AUTHOR NAME : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < bookName.length; i++) {
            if (authors[i].toLowerCase().contains(search)) {
                System.out.printf("Book Number : %d%n", i + 1);
                System.out.printf("Book Name   : %s%n", bookName[i]);
                System.out.printf("Book Author : %s%n", authors[i]);
                System.out.printf("Book Rating : %.2f%n", ratings[i]);
                authorFound = true;
                System.out.println();
            }
        }
        return authorFound;
    }

    /**
     * Rating a book
     *
     * @param bookName
     * @param ratings
     * @param authors
     */
    public static void rate(String[] bookName, String[] authors, double[] ratings) {
        System.out.println("\nDISPLAYING ALL THE BOOKS IN THE LIBRARY");
        for (int i = 0; i < bookName.length; i++) {
            System.out.printf("%d. %s%n", i + 1, bookName[i]);
        }
        System.out.print("\nEnter book number to rate : ");
        int bookNum = scanner.nextInt() - 1;
        if (bookNum >= 0 && bookNum <= 8) {
            System.out.print("Enter your rate (1 lowest - 5 highest) : ");
            double rate = scanner.nextDouble();
            if (rate >= 1 && rate <= 5) {
                ratings[bookNum] = (ratings[bookNum] + rate) / 2;
                System.out.printf("Successfully rated book %s%n", bookName[bookNum]);
                System.out.printf("Book Number : %d%n", bookNum + 1);
                System.out.printf("Book Name   : %s%n", bookName[bookNum]);
                System.out.printf("Book Author : %s%n", authors[bookNum]);
                System.out.printf("Book Rating : %.2f%n", ratings[bookNum]);
            } else {
                System.out.println("Invalid Rate. Please choose from 1-5 only.");
            }
        } else {
            System.out.println("As of the moment we only have 8 books in our collection.");
        }

    }

    /**
     * Asking the user if they want to perform another action
     *
     * @param bookName
     * @param authors
     * @param ratings
     */
    public static void anotherAction(String[] bookName, String[] authors, double[] ratings) {
        System.out.print("\nDo you want to do another action (Y/N)? ");
        String ans = scanner.next().toLowerCase();
        if (ans.charAt(0) == 'y') {
            options(bookName, authors, ratings);
        } else {
            System.out.println("Thank you for visiting Bookworm Library!");
        }
    }
}
