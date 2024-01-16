/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author Alondra Bio
 */
public class AgeNotValidException extends Exception{

    private static final long serialVersionUID = 1L;
    
    public AgeNotValidException(){
        this("Age is not valid!");
    }
    
    AgeNotValidException(String message){
        super(message);
    }
    
    
}
