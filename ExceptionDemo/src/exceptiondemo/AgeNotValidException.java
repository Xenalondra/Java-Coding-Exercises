/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptiondemo;

/**
 *
 * @author Alondra Bio
 */
public class AgeNotValidException extends Exception{
    AgeNotValidException (String message){
        super(message);
    }
    
    AgeNotValidException(){
        this("Ops! the age you entered is invalid.");
    }
    
    
}
