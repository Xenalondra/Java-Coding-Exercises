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
        RPS();
        //rockPaperScissor();
    }

    //Using String
    public static void rockPaperScissor() {
        String pName, enemy = "", player=""; char pl;
        int rd, round = 1, pScore = 0, score = 2, eScore = 0;
        System.out.println("ROCK, PAPER AND SCISSOR (A JAVA TEXT GAME)");
        System.out.println("This is a 5 round game. The one with the highest score wins.");
        System.out.print("Set player name: ");
        pName = scanner.nextLine();
        do {
            System.out.println("ROUND " + round);
            System.out.println("Type R for ROCK, P for PAPER, and S for Scissor");
            System.out.print(pName + ": ");
            pl = Character.toLowerCase(scanner.next().charAt(0));
            rd = (int) (Math.random() * 2);
            //int rd = random.nextInt(3) + 1;
            if (pl == 'r' || pl == 'p' || pl == 's') {
                switch (rd) {
                    case 0 -> enemy = "Rock";
                    case 1 -> enemy = "Paper";
                    case 2 -> enemy = "Scissor";
                }
                switch (pl) {
                    case 'r' -> player = "Rock";
                    case 'p' -> player = "Paper";
                    case 's' -> player = "Scissor";
                }
                System.out.println();
                System.out.println("SHOWING THE RESULT OF ROUND " + round);
                System.out.println(pName + " : Plays " + player);
                System.out.println("Computer : Plays " + enemy);
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
            } else {
                System.out.println("Invalid Input. Try again.");
            }
        } while (round <= 5);
        System.out.println("SHOWING THE FINAL RESULT OF THE GAME");
        System.out.println(pName + " : scores a total of " + pScore);
        System.out.println("Computer : scores a total of " + eScore);

        if (pScore > eScore) {
            System.out.println("CONGRATULATIONS, YOU WIN!");
        } else if (pScore < eScore) {
            System.out.println("The COMPUTER wins. Better luck next time.");
        } else {
            System.out.println("TIE! What a fantastic game.");
        }
    }

    
    //Using array
    public static void RPS() {
        String pName; char pl;
        int round = 1, pScore = 0, score = 2, eScore = 0;
        int playerPlay = 0, enemyPlay;
        String[] plays = {"Rock", "Paper", "Scissor"};
        System.out.println("ROCK, PAPER AND SCISSOR (A JAVA TEXT GAME)");
        System.out.println("This is a 5 round game. The one with the highest score wins.");
        System.out.print("Set player name : ");
        pName = scanner.nextLine();
        do {
            System.out.println("ROUND " + round);
            System.out.println("Type R for ROCK, P for PAPER, and S for SCISSOR");
            System.out.print(pName + " : ");
            pl = Character.toLowerCase(scanner.next().charAt(0));
            if (pl == 'r' || pl == 'p' || pl == 's') {
               switch (pl) {
                    case 'r' -> playerPlay = 0;
                    case 'p' -> playerPlay = 1;
                    case 's' -> playerPlay = 2;
                }
                enemyPlay  = (int) (Math.random() * 2);
                System.out.println("\nSHOWING THE RESULT OF ROUND " + round);
                System.out.println(pName + " : Plays " + plays[playerPlay]);
                System.out.println("Computer : Plays " + plays[enemyPlay]);
                if (enemyPlay == 0 && playerPlay == 2) {
                    System.out.println("The computer wins! Rock breaks Scissor");
                    eScore += score;
                } else if (playerPlay == 0 && enemyPlay == 2) {
                    System.out.println("Congratulations you win! Rock breaks Scissor");
                    pScore += score;
                } else if (enemyPlay == 1 && playerPlay == 0) {
                    System.out.println("The computer wins! Paper covers Rock");
                    eScore += score;
                } else if (playerPlay == 1 && enemyPlay == 0) {
                    System.out.println("Congratulations you win! Paper covers Rock");
                    pScore += score;
                } else if (enemyPlay == 2 && playerPlay == 1) {
                    System.out.println("The computer wins! Scissor cuts Paper");
                    eScore += score;
                } else if (playerPlay == 2 && enemyPlay == 1) {
                    System.out.println("Congratulations you win! Scissor cuts Paper");
                    pScore += score;
                } else {
                    System.out.println("It's a Tie. Both players play " + plays[playerPlay]);
                    eScore++;
                    pScore++;
                }
                //Displaying the Scores
                System.out.println("\nDISPLAYING THE SCORES:");
                System.out.println(pName + " : scores " + pScore);
                System.out.println("Computer : scores " + eScore);
                //Inside the if so we will not increment if the user type a wrong letter
                round++;
                System.out.println();
            } else {
                System.out.println("Invalid Input. Try again.");
            }
        } while (round <= 5);
        System.out.println("SHOWING THE FINAL RESULT OF THE GAME");
        System.out.println(pName + " : scores a total of " + pScore);
        System.out.println("Computer : scores a total of " + eScore);

        if (pScore > eScore) {
            System.out.println("CONGRATULATIONS, YOU WIN!");
        } else if (pScore < eScore) {
            System.out.println("The COMPUTER wins. Better luck next time.");
        } else {
            System.out.println("TIE! What a fantastic game.");
        }
    }
}
