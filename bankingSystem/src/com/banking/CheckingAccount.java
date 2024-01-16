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
public class CheckingAccount extends BankAccount {

	/**
	 * variable for overdraft limit that allows an account holder to
	 * withdraw more money than what is currently available in their account balance
	 */
	protected double overdraftLimit;

	CheckingAccount(String accountNumber,double balance) {
		super(accountNumber,balance);
		this.overdraftLimit = 5000;
	}
	
	@Override
	public void withdraw(double amount){
		String newBalance = String.format("PHP%,.02f", getBalance());
		if (amount <= getBalance() + overdraftLimit) {
			setBalance(getBalance() - amount);
			newBalance = String.format("PHP%,.02f", getBalance());
			JOptionPane.showMessageDialog(null, "Withdraw Successful! Your current balance is " + newBalance);
		} else {
			JOptionPane.showMessageDialog(null, "Insufficient Funds! Your current balance is " + newBalance);
		}
	}
}
