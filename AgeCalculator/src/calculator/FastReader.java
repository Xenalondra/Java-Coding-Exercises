/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Alondra Bio
 */
public class FastReader {
    StringTokenizer tokenizer;
    BufferedReader buffer;
    
    public FastReader(){
        buffer = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }
    
    public String next(){
        while (!tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(buffer.readLine());
            } catch (IOException e) {
            }
        }
        return tokenizer.nextToken();
    }
    
    public String nextLine(){
        String str = "";
        try {
            str = buffer.readLine();
        } catch (IOException ex) {
        }
        return str;
    }
    
    public int nextInt(){
        return Integer.parseInt(next());
    }
    
    public double nextDouble(){
        return Double.parseDouble(next());
    }
}
