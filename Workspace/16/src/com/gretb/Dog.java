package com.gretb;

public class Dog {
	
	String name; //name of dog
	double weight; //weight of dog
	int age; //age of dog
	double runningSpeed; //speed of dog
	
	/*
	 * Something an object can do is called a method.
	 * So in our case a Dog can run, lick and eat.
	 * Every method has to have a return type, return type is the first thing you have in method declaration.
	 * We will do a method called run() and it has a return type of void (which means it's returning nothing).
	 * Your method has to have a name, in this case 'run'. Methods are usually just like variables in that they have lower case letters.
	 * 
	 * A method ALWAYS has to have parenthisis (), these can contain 'METHOD PARAMETERS', this method has no parameters so they are empty. 
	 * THe method body (which is the code that is run when the method is called) is in curly brackets.
	 */
	
	
	void run() {
		//int num=4; // num is a local variable and is only available inside the run() method
		
		System.out.println(name + " is running");
	}
	
	void lick() {
		System.out.println(name + " is licking");
	}
	
	void eat() {
		System.out.println("before "+ name + " eats, they weight: " + weight);
		weight = weight+1;
		System.out.println("now "+ name + " weights: " + weight);
	}
	
	
	

}
