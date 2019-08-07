package com.android;
/*
 * this class implements the Behaviour interface, which has three
 * abstract methods mad(), happy(), sad(). this means that the 
 * Person class HAS TO PROVIDE implementation for each of these
 * methods. The class has to have a mad(), sad() and happy() method
 * This class also has two of its own methods which are eat()
 * and drink(), which have no relationship with the interface
 * Behaviour
 */
public class Person implements Behaviour{
	int age=45;
	String name="eddie";

	@Override
	public void mad() {
		System.out.println("person mad");
		
	}

	@Override
	public void happy() {
		System.out.println("person happy");
		
	}

	@Override
	public void sad() {
		System.out.println("person sad");
		
	}
	
	void eat() {
		System.out.println("person eating");
	}
	
	void drink() {
		System.out.println("person Drinking");
	}

	

}
