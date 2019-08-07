package com.android;

public class Dog {
	/*
	 * you can't directly create a Dog outside of the Dog class
	 * as the only constructor in the Dog class is private
	 */
	private Dog() {
		System.out.println("Dog constructor called");
	}
	/*
	 * here we have a static method that calls the private 
	 * Dog constructor and returns a new Dog. so this enables
	 * a Dog to accessed outside of the Dog class
	 */
	static Dog createDog() {
		return new Dog();
	}

}
