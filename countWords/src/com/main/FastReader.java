/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Alondra Bio
 */
public final class FastReader implements Closeable {

    StringTokenizer tokenizer;
    BufferedReader bufferReader;
    
    public FastReader() {
        bufferReader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = null;
    }
 
    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public String next(){
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(bufferReader.readLine());
            }
        } catch (Exception e) {
        }
        return tokenizer.nextToken();
    }
    
    public String nextLine(){
        String str = null;
        try {
            str = bufferReader.readLine();
        } catch (IOException e) {}
        return str;
    }
    
    public int nextInt(){
        return Integer.parseInt(next());
    }
    
    public double nextDouble(){
        return Double.parseDouble(next());
    }
}
