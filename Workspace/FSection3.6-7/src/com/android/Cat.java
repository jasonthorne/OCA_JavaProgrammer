package com.android;

public class Cat {
	/*
	 * we are applying encapsulation principles to the Cat class. 
	 * this is making all of our atributes private and using
	 * public methods to access the values(getters) and using
	 * public methods to change the values (setters)
	 */
	private int age;
	private String name;
	//Cat Constructor
	Cat(int age, String name){
		this.age=age;
		this.name=name;
	}
	/*
	 * if we want to be able to access a private variable, we need
	 * to create a public getter method for that variable.
	 * this public method will return the age of the cat, but will
	 * NOT allow you to change the age of the Cat
	 */
	public int getAge() {
		return age;
	}
	/*
	 * public getter for the private String name atribute
	 */
	public String getName() {
		return name;
	}
	
}
