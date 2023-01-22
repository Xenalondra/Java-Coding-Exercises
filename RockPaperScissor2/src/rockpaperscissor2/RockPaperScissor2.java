/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissor2;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class RockPaperScissor2 {

    static Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rockPaperScissor();
    }
    public static void rockPaperScissor(){
        String pName; int round = 1; int pScore = 0, score = 2,eScore = 0;
        System.out.println("ROCK, PAPER AND SCISSOR (A JAVA TEXT GAME)");
        System.out.println("This is a 5 round game. The one with the highest score wins.");
        System.out.print("Set player name: ");
        pName = scanner.nextLine();
        do {
        System.out.println("ROUND "+ round);
        System.out.println("Type R for ROCK, P for PAPER, and S for Scissor");
        System.out.print(pName+": ");
        String pl = scanner.next().toLowerCase();
        int rd = (int) (Math.random() * 3 + 1);
        //int rd = random.nextInt(3) + 1;
        String enemy = "";
        String player = "";
        
        if(pl.charAt(0) == 'r' || pl.charAt(0) == 'p' || pl.charAt(0) == 's'){
        switch (rd) {
            case 1: enemy = "Rock"; break;
            case 2: enemy = "Paper"; break;
            case 3: enemy = "Scissor"; 
        }
        switch (pl) {
            case "r": player = "Rock"; break;
            case "p": player = "Paper"; break;
            case "s": player = "Scissor"; 
        }
        System.out.println();
        System.out.println("SHOWING THE RESULT OF ROUND " +round);
        System.out.println(pName+": Plays "+player);
        System.out.println("Computer: Plays "+enemy);
        if (enemy.equals(player)) {
            System.out.println("It's a Tie. Both players play "+player);
            eScore ++; pScore ++;
        }else if (enemy.equals("Rock") && player.equals("Scissor")){
            System.out.println("The computer wins! Rock breaks Scissor");
            eScore += score;
        }else if (player.equals("Rock") && enemy.equals("Scissor")){
            System.out.println("Congratulations you win! Rock breaks Scissor");
            pScore += score;
        }else if (enemy.equals("Paper") && player.equals("Rock")){
            System.out.println("The computer wins! Paper covers Rock");
            eScore += score;
        }else if (player.equals("Paper") && enemy.equals("Rock")){
            System.out.println("Congratulations you win! Paper covers Rock");
            pScore += score;
        }else if (enemy.equals("Scissor") && player.equals("Paper")){
            System.out.println("The computer wins! Scissor cuts Paper");
            eScore += score;
        }else if (player.equals("Scissor") && enemy.equals("Paper")){
            System.out.println("Congratulations you win! Scissor cuts Paper");
            pScore += score;
        }
        
        System.out.println();
        //Displaying the Scores
        System.out.println("DISPLAYING THE SCORES:");
        System.out.println(pName+": scores "+pScore);
        System.out.println("Computer: scores "+eScore);
        //Inside the if so we will not increment if the user type a wrong letter
        round++;
        System.out.println();
        } else {
            System.out.println("Invalid Input");
        }
        
        } while (round <= 5 );
        System.out.println("SHOWING THE FINAL RESULT OF THE GAME");
        System.out.println(pName+": scores "+pScore);
        System.out.println("Computer: scores "+eScore);
        
        if (pScore > eScore) {
            System.out.println("CONGRATULATIONS, YOU WIN!");
        } else if (pScore < eScore){
            System.out.println("The COMPUTER wins. Better luck next time.");
        } else {
            System.out.println("TIE! What a fantastic game.");
        }
    }
}
