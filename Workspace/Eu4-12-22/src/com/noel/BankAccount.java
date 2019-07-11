package com.noel;

interface Account{
	public default String getId(){
		return "0000";
		} 
	}  
interface PremiumAccount extends Account{
	public String getId(); 
	} 
/*
 * a class has to provide implemenation for 
 * any abstract methods in any interface it
 * implements. the PremiumAccount interface
 * has a getId() abstract method which 
 * has to be implemented by the BankAccount
 * class
 */
public class BankAccount implements PremiumAccount{

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
/*	public String getSuperId(){
	//	return PremiumAccount.super.getId();
	}*/
		  
}
