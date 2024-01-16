/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Alondra Bio
 */
public class FastReader {
    BufferedReader buffer;
    StringTokenizer tokenizer;
    
    public FastReader(){
        buffer = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = null;
    }
    
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(buffer.readLine());
            } catch (IOException ex) {
            }
        }
        return tokenizer.nextToken();
    }
    
    public String nextLine(){
        String s = null;
        try {
            s = buffer.readLine();
        } catch (Exception e) {
        }
        return s;
    }
    
    public int nextInt(){
        return Integer.parseInt(next());
    }
    
    public double nextDouble(){
        return Double.parseDouble(next());
    }
    
    public long nextLong(){
        return Long.parseLong(next());
    }
    
    public float nextFloat(){
        return Float.parseFloat(next());
    }
    
    public short nextShort(){
        return Short.parseShort(next());
    }
    
    public char nextChar(){
        return next().charAt(0);
    }
    
    public boolean nextBoolean(){
        return Boolean.parseBoolean(next());
    }
    
     public byte nextByte(){
        return Byte.parseByte(next());
    }
}
