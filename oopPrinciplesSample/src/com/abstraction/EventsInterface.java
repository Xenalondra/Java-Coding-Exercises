/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.abstraction;

/**
 *
 * @author Alondra Bio
 */
public interface EventsInterface {
    //before java 8
    //methods w/ implementation - static, default
    default void hello(){
        System.out.println("Hello from an interface!");
    }
    public static void newMethod() {
    }
    
    void getTimeStamp();
    void process();
}
