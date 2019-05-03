package com.android;

public class Ape implements Behaviour {
/*
 * these are all the abstract methods in the Behaviour 
 * interface
 * i choose NOT TO override the default void Nervous() method
 * which means it will takes it's implementation for the method
 * directly from the Behaviour interface
 */
	@Override//abstract method in Behaviour 
	public void jealous() {
		System.out.println("Ape Jealous");
		
	}

	@Override//abstract method in Behaviour interface
	public int anger(double dnum, char myChar) {
		System.out.println("ape anger");
		return 0;
	}

	@Override//abstract method in Behaviour interface
	public void joy() {
		System.out.println("Ape Joy");
		
	}

	@Override//abstract method in Behaviour interface
	public void euphoria() {
		System.out.println("Ape Euphoric");
		
	}
	

}
