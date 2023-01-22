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
public class foodCollection {

    static Scanner scanner = new Scanner(System.in);

    public static void foods() {
        String[] foodName = {
            "Yangchow rice",
            "Canton guisado",
            "Cordon bleu",
            "Lechon kawali",
            "Beef caldereta",
            "Momo dumplings",
            "Pajeon",
            "Meat pies",
            "Senbei rice crackers",
            "Red velvet cake",
            "Parfait",
            "Cream Pie"
        };
        String[] origins = {
            "China",
            "Philippines",
            "Switzerland",
            "Philippines",
            "Spain",
            "Nepal",
            "South Korea",
            "Australia",
            "Japan",
            "USA",
            "France",
            "USA"
        };
        String[] categories = {
            "Main dish",
            "Snack",
            "Main dish",
            "Main dish",
            "Main dish",
            "Appetizer",
            "Appetizer",
            "Snack",
            "Snack",
            "Dessert",
            "Dessert",
            "Dessert"
        };
        options(foodName, origins, categories);
    }

    public static void options(String[] foodName, String[] origins, String[] categories) {
        System.out.println("WELCOME TO FOOD-HUB COLLECTION!");
        System.out.println("What would you like to do?");
        String choices = "1. View All FOODS\n"
                + "2. Search Food by Name\n"
                + "3. Search Food by Origin\n"
                + "4. Filter By Category";
        System.out.println(choices);
        System.out.print("Enter number : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                viewAll(foodName, origins, categories);
                break;
            case 2:
                if (!searchFood(foodName, origins, categories)) {
                    System.out.println("Sorry, we don't have the food you are looking for.");
                }
                break;
            case 3:
                if (!searchOrigin(foodName, origins, categories)) {
                    System.out.println("Sorry, we don't have food from that country.");
                }
                break;
            case 4:
                if (!filter(foodName, origins, categories)) {
                    System.out.println("Sorry, we don't have that category.");
                }
                break;
            default:
                System.out.println("Invalid number. Pick only from 1-4");
        }
        anotherAction(foodName, origins, categories);
    }

    public static void viewAll(String[] foodName, String[] origins, String[] categories) {
        System.out.println("\nDISPLAYING ALL THE FOODS IN THE COLLECTION");
        for (int i = 0; i < 12; i++) {
            System.out.printf("Food name   : %s%n", foodName[i]);
            System.out.printf("Food Origin : %s%n", origins[i]);
            System.out.printf("Category    : %s%n", categories[i]);
            System.out.println();
        }
    }

    public static boolean searchFood(String[] foodName, String[] origins, String[] categories) {
        boolean foodFound = false;
        String ans;
        System.out.print("SEARCH FOOD BY NAME : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < foodName.length; i++) {
            if (foodName[i].toLowerCase().contains(search)) {
                System.out.printf("Food name   : %s%n", foodName[i]);
                System.out.printf("Food Origin : %s%n", origins[i]);
                System.out.printf("Category    : %s%n", categories[i]);
                System.out.println();
                foodFound = true;
            }
        }
        return foodFound;
    }
    /**
     * Filtering the food by category
     * @param foodName
     * @param origins
     * @param categories
     * @return 
     */
    public static boolean filter(String[] foodName, String[] origins, String[] categories) {
        boolean categoryExist = false;
        String ans; 
        System.out.print("FILTER BY CATEGORY : ");
        String search = scanner.nextLine().toLowerCase();
        System.out.printf("Category    : %s%n", search);
        for (int i = 0; i < foodName.length; i++) {
            if (categories[i].equalsIgnoreCase(search)) {
                System.out.printf("\t      %s%n", foodName[i]);
                categoryExist = true;
            }
            
        }
        return categoryExist;
    }
    /**
     * Searching from the food origin
     * @param foodName
     * @param origins
     * @param categories
     * @return 
     */
    public static boolean searchOrigin(String[] foodName, String[] origins, String[] categories) {
       boolean originFound = false;
        String ans;
        System.out.print("SEARCH FOOD BY ORIGIN : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < foodName.length; i++) {
            if (origins[i].toLowerCase().contains(search)) {
                System.out.printf("Food Origin : %s%n", origins[i]);
                System.out.printf("Food name   : %s%n", foodName[i]);
                System.out.printf("Category    : %s%n", categories[i]);
                System.out.println();
                originFound = true;
            }
        }
        return originFound;
    }

    /**
     * Doing another transaction
     * @param foodName
     * @param origins
     * @param categories 
     */
    public static void anotherAction(String[] foodName, String[] origins, String[] categories) {
        System.out.print("Do you want to do another action (Y/N)? ");
        String ans = scanner.next().toLowerCase();
        if (ans.charAt(0) == 'y') options(foodName, origins, categories);
        else System.out.println("Thank you for visiting Food-Hub Collection!");
    }

    private foodCollection() {
    }
}
