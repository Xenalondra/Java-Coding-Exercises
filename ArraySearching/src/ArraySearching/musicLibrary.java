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
public class musicLibrary {

    static Scanner scanner = new Scanner(System.in);

    /*MUSIC LIBRARY*/
    /**
     * Declaration of our collection
     */
    public static void playlist() {
        String[] songs = {
            "Kill Bill",
            "Here With Me",
            "Ditto",
            "Anti-Hero",
            "OMG",
            "Until I Found You",
            "Die for You",
            "Wet the Bed",
            "Made you Look",
            "Midnight Rain"
        };
        String[] artists = {
            "SZA",
            "d4vd",
            "NewJeans",
            "Taylor Swift",
            "NewJeans",
            "Stephen Sanchez",
            "The Weeknd",
            "Chris Brown & Ludacris",
            "Meghan Trainor",
            "Taylor Swift"
        };

        musicOptions(songs, artists);
    }

    /**
     *
     * @param songs
     * @param artists
     */
    public static void musicOptions(String[] songs, String[] artists) {
        System.out.println("WELCOME TO SPOTLIFY LIBRARY!");
        System.out.println("What would you like to do?");
        String choices = "1. View All Songs\n"
                + "2. Search Title\n"
                + "3. Search Artist\n"
                + "4. View Song in Rank Number";
        System.out.println(choices);
        System.out.print("Enter number : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                viewPlaylist(songs, artists);
                break;
            case 2:
                if (!searchSong(songs, artists)) {
                    System.out.println("Sorry, we cannot find the title you are looking for.");
                }
                break;
            case 3:
                if (!searchArtist(songs, artists)) {
                    System.out.println("Sorry, we cannot find the artist/s you are looking for.");
                }
                break;
            case 4:
                if (!ranking(songs, artists)) {
                    System.out.println("Sorry, we only have songs from rank 1-10.");
                }
                break;
            default:
                System.out.println("Invalid number. Pick only from 1-4");
        }
        again(songs, artists);
    }

    /**
     *
     * @param songs
     * @param artists
     */
    public static void viewPlaylist(String[] songs, String[] artists) {
        System.out.println("\nDISPLAYING ALL THE SONGS IN THE LIBRARY");
        System.out.printf("TOP %d SONGS - PHILIPPINES%n", 10);
        for (int i = 0; i < songs.length; i++) {
            System.out.printf("%d. %s - %s%n", (i+1), songs[i], artists[i]);
        }
        System.out.println();
    }

    /**
     *
     * @param songs
     * @param artists
     * @return
     */
    public static boolean searchSong(String[] songs, String[] artists) {
        boolean bookFound = false;
        String ans;
        System.out.print("SEARCH SONG TITLE : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].toLowerCase().contains(search)) {
                System.out.printf("Ranking : %d%n", (i + 1));
                System.out.printf("Title   : %s%n", songs[i]);
                System.out.printf("Artist  : %s%n", artists[i]);
                bookFound = true;
                System.out.println();
            }
        }
        return bookFound;
    }

    /**
     *
     * @param songs
     * @param artists
     * @return
     */
    public static boolean searchArtist(String[] songs, String[] artists) {
        boolean artistFound = false; String getArtist=""; 
        int count = 0, countme = 0;
        System.out.print("SEARCH ARTIST NAME : ");
        String search = scanner.nextLine().toLowerCase();
        for (int i = 0; i < songs.length; i++) {
            if(artists[i].equalsIgnoreCase(search)){
                getArtist = artists[i];
                count++;
                artistFound = true;
            }
            if (artists[i].toLowerCase().contains(search) && count < 1) {
                artistFound = true;
                System.out.printf("ARTIST : %s%n",   artists[i]);
                System.out.printf("SONG   : %s%n",   songs[i]);
                System.out.println();
            }
        }
        if (count >= 1) {
            System.out.println("ARTIST : " + getArtist);
            System.out.print  ("SONG/S : ");
            for (int i = 0; i < songs.length; i++) {
                if (artists[i].equalsIgnoreCase(getArtist)) {
                    countme++;
                if(countme > 1)System.out.println("\t "+songs[i]);
                else System.out.print(songs[i]+"\n");
                }
            }
        }
        return artistFound;
    }

    /**
     *
     * @param songs
     * @param artists
     */
    public static void again(String[] songs, String[] artists) {
        System.out.print("Do you want to do another action (Y/N)? ");
        String ans = scanner.next().toLowerCase();
        if (ans.charAt(0) == 'y') {
            musicOptions(songs, artists);
        } else {
            System.out.println("Thank you for visiting Spotlify Library!");
        }
    }

    public static boolean ranking(String[] songs, String[] artists) {
        boolean rankFound = false;
        System.out.print("VIEW SONG IN RANK NUMBER : ");
        int rank = scanner.nextInt();
        if (rank >= 1 && rank <= 10) {
            rankFound = true;
            System.out.printf("TOP %d - PHILIPPINES%n", rank);
            System.out.printf("Title   : %s%n", songs[rank-1]);
            System.out.printf("Artist  : %s%n", artists[rank-1]);
        }
        return rankFound;
    }

}
