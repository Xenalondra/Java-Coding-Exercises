/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.banking;

import javax.swing.JOptionPane;

/**
 *
 * @author Alondra Bio
 */
public class SavingsAccount extends BankAccount {
	double interestRate;
	
	SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		this.interestRate = 0.05;
	}
	
	@Override
	public void deposit(double amount){
		double interest = getBalance() * interestRate;
		setBalance(getBalance() +  amount + interest);
		String newBalance = String.format("PHP%,.02f", getBalance());
		JOptionPane.showMessageDialog(null, "Deposit Successful with a "
			+interestRate+"% interest rate! Your current balance is " + newBalance);
	}
}
