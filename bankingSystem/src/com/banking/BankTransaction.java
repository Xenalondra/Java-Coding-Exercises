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
public class BankTransaction {
	String[] options = {"BALANCE", "WITHDRAW", "DEPOSIT", "QUIT"};
	String[] accountType = {"Checking", "Savings"};
	
	public void createAccount(){
		int acc = JOptionPane.showOptionDialog(null, "Choose your account type:", 
			"ACCOUNT TYPE", 0, JOptionPane.QUESTION_MESSAGE, null, accountType, accountType[0]);
		String accountNum = JOptionPane.showInputDialog(null, "Account Number:");
		double initialBal = Double.parseDouble(JOptionPane.showInputDialog(null, "Initial Balance:"));
		//create object depending on the accountType
		if (acc == 0) {
			CheckingAccount checkingAccount = new CheckingAccount(accountNum, initialBal);
			transaction(checkingAccount);
		} else {
			SavingsAccount savingsAccount = new SavingsAccount(accountNum, initialBal);
			transaction(savingsAccount);
		}
	}

	private void transaction(BankAccount account) {
	String transaction = (String) JOptionPane.showInputDialog(null, "What would you like to do?", 
			"Title", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		switch (transaction) {
			case "BALANCE":
				String balance = String.format("PHP%,.02f", account.getBalance());
				JOptionPane.showMessageDialog(null, "Your current balance is "+ balance);
				break;
			case "WITHDRAW":
				double withdrawAmt = Double.parseDouble(JOptionPane.showInputDialog(null, "Amount to withdraw:"));
				account.withdraw(withdrawAmt);
				break;
		        case "DEPOSIT":
				double depositAmt = Double.parseDouble(JOptionPane.showInputDialog(null, "Amount to deposit:"));
				account.deposit(depositAmt);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Thank you for using our service");
		}
		
	int anotherTrans = JOptionPane.showConfirmDialog(null, "Do you want to do another transaction?", 
		"TRANSACTION", JOptionPane.YES_NO_OPTION);
		if (anotherTrans == 0) {
			transaction(account);
		} 
	}
}
