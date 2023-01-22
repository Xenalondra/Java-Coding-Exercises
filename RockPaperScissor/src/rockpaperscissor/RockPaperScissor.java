/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class RockPaperScissor {

    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        instruction();
    }

    //Using String
    public static void instruction() {
        String pName; char pl;
        System.out.println("ROCK, PAPER AND SCISSOR (A JAVA TEXT GAME)");
        System.out.println("This is a 5 round game. The one with the highest score wins.");
        System.out.print("Set player name: ");
        pName = scanner.nextLine();
        String instruction = """
                             HOW TO PLAY:
                             Type rock (R) to play ROCK
                             Type paper (P) to play PAPER
                             Type scissor (S) to play SCISSOR
                             """;
        System.out.println(instruction);
        System.out.println(game(pName));
        
    }
    public static String game(String pName) {
        int rd, round = 1, pScore = 0, score = 2, eScore = 0;
        String enemy, player;
        do {
            enemy = computerPlays();
            player = playerPlays(pName);
            System.out.println("SHOWING THE RESULT OF ROUND " + round);
            System.out.printf("%s : Plays %s%n", pName, player);
            System.out.printf("Computer : Plays %s%n", enemy);
                if (enemy.equals(player)) {
                    System.out.println("It's a Tie. Both players play " + player);
                    eScore++;
                    pScore++;
                } else if (enemy.equals("Rock") && player.equals("Scissor")) {
                    System.out.println("The computer wins! Rock breaks Scissor");
                    eScore += score;
                } else if (player.equals("Rock") && enemy.equals("Scissor")) {
                    System.out.println("Congratulations you win! Rock breaks Scissor");
                    pScore += score;
                } else if (enemy.equals("Paper") && player.equals("Rock")) {
                    System.out.println("The computer wins! Paper covers Rock");
                    eScore += score;
                } else if (player.equals("Paper") && enemy.equals("Rock")) {
                    System.out.println("Congratulations you win! Paper covers Rock");
                    pScore += score;
                } else if (enemy.equals("Scissor") && player.equals("Paper")) {
                    System.out.println("The computer wins! Scissor cuts Paper");
                    eScore += score;
                } else if (player.equals("Scissor") && enemy.equals("Paper")) {
                    System.out.println("Congratulations you win! Scissor cuts Paper");
                    pScore += score;
                }
                //Displaying the Scores
                System.out.println("\nDISPLAYING THE SCORES:");
                System.out.println(pName + " : scores " + pScore);
                System.out.println("Computer : scores " + eScore);
                //Inside the if so we will not increment if the user type a wrong letter
                round++;
                System.out.println();
        } while (round <= 5);
        
        return showResult(pScore, eScore);
    }
    
    public static String showResult(int pScore, int eScore) {
        String result;
        return result = (pScore > eScore) ? "CONGRATULATIONS, YOU WIN!" 
               : (pScore < eScore) ? "The COMPUTER wins. Better luck next time."
               : "TIE! What a fantastic game.";
    }
    
    public static String playerPlays(String pName) {
        String player = ""; char pPlay;
        boolean invalid;
        do {
            System.out.printf("%s : ", pName);
            pPlay = Character.toLowerCase(scanner.next().charAt(0));
            if (pPlay == 'r' || pPlay == 'p' || pPlay == 's') {
                switch (pPlay) {
                    case 'r' -> player = "Rock";
                    case 'p' -> player = "Paper";
                    case 's' -> player = "Scissor";
                } invalid = false;
            } else {
                invalid = true;
                System.out.println("Invalid Input. Try again.");
            }
        } while (invalid);
        return player;
    }
    
    public static String computerPlays() {
        String enemy = "";
        int comPlay = (int) (Math.random() * 2);
        switch (comPlay) {
            case 0 -> enemy = "Rock";
            case 1 -> enemy = "Paper";
            case 2 -> enemy = "Scissor";
        }
        return enemy;
    }
}
