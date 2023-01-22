package ArraySearching;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class movieCollection {

    static Scanner scanner = new Scanner(System.in);

    public static void movies() {
        String[] movTitle = {
            "JUJUTSU KAISEN 0",
            "Hellbender",
            "Top Gun: Maverick",
            "The innocents",
            "Turning Red",
            "Glass Onion",
            "Knives Out",
            "Star Wars: The last Jedi",
            "Barbarian",
            "The Menu"
        };
        String[] directors = {
            "Seong-hu Park & Sunghoo Park",
            "John Adams & Zelda Adams",
            "Joseph Kosinski",
            "Eskil Vogt",
            "Domee Shi",
            "Rian Johnson",
            "Rian Johnson",
            "Rian Johnson",
            "Dan Trachtenberg",
            "Zach Creggger",
            "Mark Mylod"
        };
        options(movTitle, directors);
    }

    public static void options(String[] movTitle, String[] directors) {
        System.out.println("WELCOME TO RIPE-POTATOES COLLECTION!");
        System.out.println("What would you like to do?");
        String choices = "1. View All Movies\n"
                + "2. Search a Movie title\n"
                + "3. Search a Director\n";
        System.out.println(choices);
        System.out.print("Enter number : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                viewAll(movTitle, directors);
                break;
            case 2:
                if (!searchTitle(movTitle, directors)) {
                    System.out.println("Sorry, we cannot find the movie title you are looking for.");
                }
                break;
            case 3:
                if (!searchdirector(movTitle, directors)) {
                    System.out.println("Sorry, we cannot find the director you are looking for.");
                }
                break;
            default:
                System.out.println("Invalid number. Pick only from 1-3");
        }
        anotherAction(movTitle, directors);
    }

    public static void viewAll(String[] movTitle, String[] directors) {
        System.out.println("\nDISPLAYING ALL THE MOVIES IN THE COLLECTION");
        for (int i = 0; i < movTitle.length; i++) {
            System.out.printf("Movie Number   : %d%n", i + 1);
            System.out.printf("Movie Title    : %s%n", movTitle[i]);
            System.out.printf("Movie Director : %s%n", directors[i]);
            System.out.println();
        }
    }

    public static boolean searchTitle(String[] movTitle, String[] directors) {
        boolean titleFound = false;
        String ans;
        System.out.print("SEARCH MOVIE TITLE : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < movTitle.length; i++) {
            if (movTitle[i].toLowerCase().contains(search)) {
                System.out.printf("Movie Number   : %d%n", i + 1);
                System.out.printf("Movie Title    : %s%n", movTitle[i]);
                System.out.printf("Movie Director : %s%n", directors[i]);
                titleFound = true;
                System.out.println();
            }
        }
        return titleFound;
    }

    public static boolean searchdirector(String[] movTitle, String[] directors) {
        boolean directorFound = false;
        int countme = 0;
        String ans;
        int count = 0;
        String getDirector = "";
        System.out.print("SEARCH MOVIE DIRECTOR : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < movTitle.length; i++) {
            if (directors[i].equalsIgnoreCase(search)) {
                getDirector = directors[i];
                count++;
                directorFound = true;
            }
            if (directors[i].toLowerCase().contains(search) && count < 1) {
                directorFound = true;
                System.out.printf("Movie Director : %s%n", directors[i]);
                System.out.printf("Movie/s        : %s%n", movTitle[i]);
                System.out.println();
            }
        }
        if (count >= 1) {
            System.out.println("Movie Director : " + getDirector);
            System.out.print("Movie/s        : ");
            for (int i = 0; i < directors.length; i++) {
                if (directors[i].equalsIgnoreCase(getDirector)) {
                    countme++;
                    if (countme > 1) {
                        System.out.println("\t\t " + movTitle[i]);
                    } else {
                        System.out.print(movTitle[i] + "\n");
                    }
                }
            }
        }
        return directorFound;
    }

    public static void anotherAction(String[] movTitle, String[] director) {
        System.out.print("Do you want to do another action (Y/N)? ");
        String ans = scanner.next().toLowerCase();
        if (ans.charAt(0) == 'y') {
            options(movTitle, director);
        } else {
            System.out.println("Thank you for visiting Ripe-Potatoes!");
        }
    }
}
