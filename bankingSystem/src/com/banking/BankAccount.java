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
public class BankAccount {
	public String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	/**
	 * @return the Balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param Balance the Balance to set
	 */
	public void setBalance(double Balance) {
		this.balance = Balance;
	}
	
	public void deposit(double amount){
		setBalance(getBalance() +  amount);
		String newBalance = String.format("PHP%,.02f", getBalance());
		JOptionPane.showMessageDialog(null, "Deposit Successful! Your current balance is " + newBalance);
	}
	
	public void withdraw(double amount){
		String newBalance = String.format("PHP%,.02f", getBalance());
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			newBalance = String.format("PHP%,.02f", getBalance());
			JOptionPane.showMessageDialog(null, "Withdraw Successful! Your current balance is " + newBalance);
		} else {
			JOptionPane.showMessageDialog(null, "Insufficient Funds! Your current balance is " + newBalance);
		}
	}
}
