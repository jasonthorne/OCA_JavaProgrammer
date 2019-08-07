package com.android;

public class Elephant {
	private int age;
	private String name;
	private double weight;
	/*
	 * you can apply access modifiers to a constructor 
	 * (private, public, protected) default/package level
	 * has no keyword
	 */
	//this constructor has default level access
	/*Elephant(){
		System.out.println("default level no argument Elephant constructor called");
	}*/
	/*
	 * if all of the constructors in class are private, YOU CANNOT
	 * create a Elephant outside of the Elephant class using the 
	 * new Keyword
	 */
	private Elephant() {
		System.out.println("Elephant constructor with no arguements");
	}
	private Elephant(int age,String  name, double weight) {
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	/*
	 * this method can be called, without creating an Elephant
	 * we can call it by 
	 * Elephant.makeElephant()
	 */
	public static Elephant makeElephant() {
		return new Elephant();
	}

}
