package com.android;

public class Ape implements Behaviour {
	
	/*
	 * These are all the abstract methods in the Behaviour Interface.
	 * Were NOT overriding the default nervous() method
	 * which means it will take its implementation for the method directly from the Behaviour interface.
	  */

	@Override //abstract method from Behaviour Interface
	public void jealous() {
		System.out.println("Ape jealous");
		
	}

	@Override //abstract method from Behaviour Interface
	public int anger(double aDouble, char myChar) {
		System.out.println("Ape anger");
		return 0;
	}

	@Override //abstract method from Behaviour Interface
	public void joy() {
		System.out.println("Ape joy");
		
	}

	@Override //abstract method from Behaviour Interface
	public void euphoria() {
		System.out.println("Ape euphoric");
		
	}

	
}
