package com.android;

public interface InterfaceTypes {
	/*
	 * an abstract method that takes an Ape object
	 * As Human extends Ape, this can also take a Human object
	 */
	void takeApe(Ape magilla);
	/*
	 * an abstract mehthod that can take an Ape object or a subclass of 
	 * the Ape class
	 * it can also return An Ape or a sub class of the Ape class
	 */
	Ape returnApe(Ape magilla);
	/*
	 * YOU CANNOT OVERRIDE A STATIC METHOD
	 */
	static void statMethod() {
		System.out.println("static method in InterfacesTypes interface");
	}

}
