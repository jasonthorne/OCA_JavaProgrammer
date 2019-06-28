package com.android;

public class Athelete implements Behaviour {

	final int finalInt = 1000;
	
	@Override
	public void sad() {
		System.out.println("Athelete sad");
		System.out.println("finalInt: " + finalInt); //takes this from THIS class. Masking the one declared in Behaviour.
		System.out.println("finalInt in Behaviour interface: " + Behaviour.finalInt); //takes this from THIS class. Masking the one in Behaviour.
		
	}

	@Override
	public void angry() {
		System.out.println("Athelete angry");
		
	}
	
	public void happy() {
		System.out.println("Athelete happy");
	}
	
	//this is NOT overridden from the Behaviour interface as you CANT. +++++++++++++++++++++++++++++++++++++
	//This is just a DIFFERENT static method that has the same signature.
	static void statMethod() {
		
	}

}
