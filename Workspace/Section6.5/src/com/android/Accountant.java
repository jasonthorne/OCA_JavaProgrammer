package com.android;

public class Accountant extends Employee implements Behaviour {

	//abstract method in Behaviour interface
	@Override
	public void sad() {
		System.out.println("Accountant sad");
		
	}

	//abstract method in Behaviour interface
	@Override
	public void angry() {
		System.out.println("Accountant angry");
		
	}
	
	/*
	//default constructor: 
	Accountant(){
		
	}
*/
}


