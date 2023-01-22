/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billscounter;

import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class BillsCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        digits();
    }
    
    public static void moneyCounter(){
    Scanner input = new Scanner(System.in);
    int thousands, five_hundreds, two_hundreds, hundreds, fifty,
        twenty, ten, five, peso, newBal, initial;
        System.out.print("ENTER THE MONEY YOU HAVE (PESO): ");
        initial = input.nextInt();
        System.out.println("The number of paper bills and coins are listed below:");
        thousands = initial / 1000; 
        newBal =  initial % 1000;
        System.out.println("One thousand paper bills: "+ thousands);
        five_hundreds = newBal / 500;
        newBal %= 500; 
        System.out.println("Five hundred paper bills: "+ five_hundreds);
        two_hundreds = newBal / 200; 
        newBal %= 200; 
        System.out.println("Two hundred paper bills: "+ two_hundreds);
        hundreds = newBal / 100;
        newBal %= 100;
        System.out.println("One hundred paper bills: "+ hundreds);
        fifty = newBal / 50;
        newBal %= 50;
        System.out.println("Fifty paper bills: "+ fifty);
        twenty = newBal / 20;
        newBal %= 20;
        System.out.println("Twenty paper bills: "+ twenty);
        ten = newBal / 10;
        newBal %= 10;
        System.out.println("Ten Peso coins: "+ ten);
        five = newBal / 5;
        newBal %= 5;
        System.out.println("Five Peso coins: "+ five);
        peso = newBal;
        System.out.println("One Peso coins: "+ peso);
    }
    
    //Another Solution
    public static void moneyCounter1(){
    Scanner input = new Scanner(System.in);
    int thousands, five_hundreds, two_hundreds, hundreds, fifty,
        twenty, ten, five, peso, money;
        System.out.print("ENTER THE MONEY YOU HAVE (PESO): ");
        //money is the user input
        money = input.nextInt();
        System.out.println("The number of paper bills and coins are listed below:");
        //computes
        thousands =      money / 1000; 
        five_hundreds =  money % 1000 / 500;
        two_hundreds =   money % 1000 % 500 / 200; 
        hundreds =       money % 1000 % 500 % 200 / 100;
        fifty =          money % 1000 % 500 % 200 % 100 / 50;
        twenty =         money % 1000 % 500 % 200 % 100 % 50 / 20;
        ten =            money % 1000 % 500 % 200 % 100 % 50 % 20 / 10;
        five =           money % 1000 % 500 % 200 % 100 % 50 % 20 % 10 / 5;
        peso =           money % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5;
        //print
        System.out.println("One thousand paper bills: "+ thousands);
        System.out.println("Five hundred paper bills: "+ five_hundreds);
        System.out.println("Two hundred paper bills: "+ two_hundreds);
        System.out.println("One hundred paper bills: "+ hundreds);
        System.out.println("Fifty paper bills: "+ fifty);
        System.out.println("Twenty paper bills: "+ twenty);
        System.out.println("Ten Peso coins: "+ ten);
        System.out.println("Five Peso coins: "+ five);
        System.out.println("One Peso coins: "+ peso);
    }
    
    //another way of printing
    public static void moneyCounter2(){
    Scanner input = new Scanner(System.in);
    int thousands, five_hundreds, two_hundreds, hundreds, fifty,
        twenty, ten, five, peso, money;
        System.out.print("ENTER THE MONEY YOU HAVE (PESO): ");
        //money is the user input
        money = input.nextInt();
        System.out.println("The number of paper bills and coins are listed below:");
        //computes
        thousands =     money / 1000; 
        five_hundreds = money % 1000 / 500;
        two_hundreds =  money % 1000 % 500 / 200; 
        hundreds =      money % 1000 % 500 % 200 / 100;
        fifty =         money % 1000 % 500 % 200 % 100 / 50;
        twenty =        money % 1000 % 500 % 200 % 100 % 50 / 20;
        ten =           money % 1000 % 500 % 200 % 100 % 50 % 20 / 10;
        five =          money % 1000 % 500 % 200 % 100 % 50 % 20 % 10 / 5;
        peso =          money % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5;
        //print
        String result = "One thousand paper bills: "+ thousands +
                        "\nFive hundred paper bills: "+ five_hundreds +
                        "\nTwo hundred paper bills: "+ two_hundreds +
                        "\nOne hundred paper bills: "+ hundreds +
                        "\nFifty paper bills: "+ fifty +
                        "\nTwenty paper bills: "+ twenty +
                        "\nTen Peso coins: "+ ten +
                        "\nFive Peso coins: "+ five +
                        "\nOne Peso coins: "+ peso;
        System.out.println(result);
    }
    
    //Manual solution
    public static void billsCounter(){
    Scanner input = new Scanner(System.in);
    int thousands, five_hundreds, two_hundreds, hundreds, fifty,
        twenty, ten, five, peso, money;
        System.out.print("ENTER THE AMOUNT OF MONEY YOU HAVE: ");
        money = input.nextInt();
        System.out.println("The number of paper bill/s and coins are:");
        thousands = money / 1000;
        money -= (thousands*1000);
        System.out.println("One Thousand Bill/s: "+ thousands);
        five_hundreds = money / 500;
        money -= (five_hundreds*500);
        System.out.println("Five Hundred Bill/s: "+ five_hundreds);
        two_hundreds = money / 200; 
        money -= (two_hundreds*200); 
        System.out.println("Two Hundred Bill/s: "+ two_hundreds);
        hundreds = money / 100;
        money -= (hundreds*100);
        System.out.println("One Hundred Bill/s: "+ hundreds);
        fifty = money / 50;
        money -= (fifty*50);
        System.out.println("Fifty Bill/s: "+ fifty);
        twenty = money / 20;
        money -= (twenty*20);
        System.out.println("Twenty Bill/s: "+ twenty);
        ten = money / 10;
        money -= (ten*10);
        System.out.println("Ten coin/s: "+ ten);
        five = money / 5;
        money -= (five*5);
        System.out.println("Five coin/s: "+ five);
        peso = money;
        System.out.println("One Peso coin/s: "+ peso);
    }
    
    public static void digits(){
    Scanner in = new Scanner(System.in);
    int pers, sec, thrd, frth, last, digits;
    System.out.println("ENTER A FIVE DIGIT NUMBER:");
    digits = in.nextInt();
    pers  =  digits / 10000;
    sec   =  digits % 10000 / 1000;
    thrd  =  digits % 10000 % 1000 / 100;
    frth  =  digits % 10000 % 1000 % 100 / 10;
    last  =  digits % 10000 % 1000 % 100 % 10;
    
    String result = "The numbers you have entered are " +pers
                    + ", "+sec+", "+thrd+", "+frth+", "+last;
        System.out.println(result);
    }
}
