package com.gretb;

public class Animal {
	int age;
	String name;
	static int count;
	/*
	 * Initialisers
	 */
	/*
	 * statics first
	 * then non statics 
	 * then constructors
	 */
	//instance initialiser, which runs BEFORE THE CONSTRUCTOR
		/*
		 * instance initialiser can access static and non static members and again run in
		 * the order they are in the file. this initialser run each time you create
		 * a new Animal object
		 */
	{//this is a non static initialiser
		age=23;
		name="Andy";
		System.out.println("Animal Initialser called");
	}
	/*
	 * static initialisers run first and only ONCE PER CLASS
	 * if you have more than one static intialiser then it runs the static initialisers
	 * in the order they are in the file
	 */
	static {
		System.out.println("this only runs once");
	}
	Animal(){
		System.out.println("Animal constructor called");
	}
	
	{
			System.out.println("second initialiser called");
	}
		
}
