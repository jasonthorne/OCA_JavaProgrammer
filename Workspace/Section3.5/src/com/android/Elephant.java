package com.android;

public class Elephant {
	
	private int age;
	private String name;
	private double weight;
	
	//You can apply access modifiers to a constructor (private, public, protected (default has no keyword0) 
	/*
	Elephant(){
		System.out.println("default level, no argument Elephant constructor");
	}*/
	
	
	/*
	 * If ALL of the constructors in a class are private, you can't create an object of that class using the 'new' keyword.
	 */
	private Elephant() {
		
	}

	private Elephant(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	//static method that returns an elephant object
	public static Elephant makeElephant() {
		return new Elephant();
	}

}
