package tosscoingame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class TossCoinGame {

    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tossCoin();
    }

    public static void tossCoin() {
        Random rd = new Random();
        char playAgain;
        double init_money = 0, money, prize = 0;
        char input;
        boolean bet, toss;
        int multiplier;
        System.out.println("TOSS COIN GAME");
        do {
            System.out.print("Heads or tails (H/T)? ");
            input = Character.toLowerCase(scanner.next().charAt(0));
            if (input == 'h' || input == 't') {
                System.out.print("Enter your bet : ");
                init_money = scanner.nextDouble();
                System.out.print("Choose multiplier (1), (5), (10), (20), (50): ");
                multiplier = scanner.nextInt();
                toss = rd.nextBoolean();
                //if true HEADS if false TAILS
                System.out.println("Tossing the coin....");
                System.out.println("The coin has been tossed!\n");
                //SET THE BET
                //booelean bet, if heads set it to tails if tails set it to false
                bet = (input == 'h');
                //GENERATE TOSS  
                String result = (toss) ? "HEADS!" : "TAILS!";
                System.out.println(result);
                //CHECK RESULT
                //if bet = true and toss = true
                if (bet && toss) {
                    System.out.println("YOU WON THE BET!");
                    money = init_money * multiplier;
                    prize += money;
                    //prize = prize + money
                    System.out.printf("Your money is now: PHP %.02f%n", prize);
                } else {
                    System.out.println("YOU LOSE THE BET!");
                    prize -= init_money;
                    //prize = prize - initial_money
                    if (prize < 0) prize = 0;
                    System.out.printf("Your money is now: PHP %.02f%n", prize);
                }
                System.out.print("Do you still want to play (Y/N)? ");
                playAgain = scanner.next().charAt(0);
                System.out.println("");
            } else {
                System.out.println("Invalid input. Enter H to bet for Heads and T to bet for Tails.");
                System.out.print("Do you still want to play (Y/N)? ");
                playAgain = scanner.next().charAt(0);
                System.out.println("\n");
            }

        } while (playAgain == 'y' || playAgain == 'Y');
        //will be executed after the loop
        String end = (prize > init_money)
                ? String.format("Congratulations! You now have: PHP %.02f%n", prize)
                : String.format("You now have PHP %.02f. Better luck next time.%n", prize);
        System.out.println(end);
    }
}
