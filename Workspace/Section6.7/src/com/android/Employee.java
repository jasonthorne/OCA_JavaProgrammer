package com.android;

public class Employee {
	
	/*
	 * Employee doesnt have to implement Behaviour to access a Behaviour referenced object.
	 */
	
	private int age;
	private String name;
	private int rating;
	
	Behaviour myBehave; //reference to Behave interface
	
	public Employee(int age, String name, int rating, Behaviour myBehave) {
		super();
		this.age = age;
		this.name = name;
		this.rating = rating;
		this.myBehave = myBehave; //when Dog is passed in, this reads: Behaviour myBehave = new Dog();
	}
	
	//This method gains access to the private int "rating"
	int getRating() {
		return rating;
	}

}
