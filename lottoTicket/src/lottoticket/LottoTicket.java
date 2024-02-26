/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lottoticket;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class LottoTicket {

    static Scanner scanner = new Scanner(System.in);
    static int[] winningLottoNumbers;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        buyLottoTicket();
    }
    
    public static int[] generateLottoNumbers() {
        //declaration of array
        int[] lottoNumbers = new int[4];
        
        for (int i = 0; i < lottoNumbers.length; i++) {
            //Generate random numbers from 1-55
            lottoNumbers[i] = validLottoNumber(lottoNumbers, i);
        }
        
        //Print an array using Array class
        return lottoNumbers;
    }
    
    public static void buyLottoTicket() {
        int[] lottoTicket = new int[4];
        System.out.println("Welcome to lotto 4/16! (4-digit number from 1-16)");
        System.out.println("Enter 4 numbers you want to bet on: (1-16 only)");
        for (int i = 0; i < 4; i++) {
            lottoTicket[i] = validNumber();
        }
        
        System.out.println("Successfully Drafted your lotto numbers.");
        
        winningLottoNumbers = generateLottoNumbers();
        
        System.out.println("Your lotto numbers are       : " + Arrays.toString(lottoTicket));
        System.out.println("The winning lotto numbers are: " + Arrays.toString(winningLottoNumbers));
        
        String result = (checkNumbers(winningLottoNumbers, lottoTicket)) ? 
                "Congratulations! You win lotto 4/16" : "Better luck next time";
        
        System.out.println(result);
                
    }
    
    public static int validLottoNumber(int[] lottoNumbers, int i) {
        int lottoNum;
        int index;
        do {
            //make sure the lotto number generated is unique
            lottoNum = (int) (Math.random() * 16 + 1);
            index = Arrays.binarySearch(lottoNumbers, lottoNum);
        }while (index >= 0);
        
        return lottoNum;
    }
    
    public static int validNumber() {
        while (true) {
            System.out.print("> ");
            int input = scanner.nextInt();
            if (input > 0 && input <= 20) {
                return input;
            }
            System.out.println("Void. Please try again.");
        }
    }
    
    public static boolean checkNumbers(int[] winningLottoNumbers, int[] lottoTicket) {
        for (int i = 0; i < lottoTicket.length; i++) {
            if (winningLottoNumbers[i] != lottoTicket[i]) {
                return false;
            }
        }
        return true;
    }
}
