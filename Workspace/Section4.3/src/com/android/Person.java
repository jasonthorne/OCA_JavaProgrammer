package com.android;

/*
 * This class implements the behaviour interface, which has 3 abstract methods: mad, happy & sad.
 * This means that the person class has to provide implementation for each of these methods.
 * A class HAS TO HAVE a mad, sad, and happy method.
 * It also has 2 of its own methods, eat & drink, which have NO RELATIONSHIP with the interface "behaviour".
 */

public class Person implements Behaviour {
	int age = 45;
	String name = "eddie";

	@Override
	public void mad() {
		System.out.println("Person mad");
		
	}

	@Override
	public void happy() {
		System.out.println("Person happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Person sad");
		
	}
	
	void eat() {
		System.out.println("Person eating");
	}
	
	void drink() {
		System.out.println("Person drinking");
	}
	
	
	

}
