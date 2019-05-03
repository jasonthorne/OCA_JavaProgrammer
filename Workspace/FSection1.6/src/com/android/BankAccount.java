package com.android;

public class BankAccount {
	//unquely identifies each account
	private String iban;
	/*
	 * bankcode applies to many accounts
	 */
	private String bankCode;
	//balance in the account
	private double balance;
	
	BankAccount(double balance){
		this.balance=balance;
	}
	
	private void withdraw(double amount) {
		balance=balance-amount;
	}
	
	public void lodge(double amount) {
		balance=balance+amount;
	}
	
	public double getBalance() {
		return balance;
	}

}
