/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Alondra Bio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call your method here
    }
    
    public static void methodthatCatch() {
        try {
            fileReader3();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found or is corrupted.");
        } catch (IOException ex) {
            System.out.println("The file is empty.");
        } catch (InterruptedException ex) {
            
        }
    }
    
    //Buffered Reader
    public static void bufferReader() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.println("Good morning "+ name);
        } catch (IOException ex) {
        }
    }
    
    
    public static void fileReader1() {
        try {
            File file = new File("songLyrics");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
        }
    }
    
    public static void fileReader2() {
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
        }
    }
    
    public static void fileReader3() throws FileNotFoundException, IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new FileReader("songLyrics"));
        String line = br.readLine();
        while (line != null) {
            Thread.sleep(5000);
            System.out.println(line);
            line = br.readLine();
        }
    }
    
    public static void fileReader4() {
        try ( FileReader fileReader = new FileReader("songLyrics");){
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = fileReader.read();
            }
        } catch (IOException e) {
            System.out.println("File not found or is corrupted");
        }
    }
}
