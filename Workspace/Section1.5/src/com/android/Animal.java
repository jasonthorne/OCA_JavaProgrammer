package com.android;

/**
 * 
 * An abstract class cannot be instantiated.
 * An abstract method can only exist in an abstract class. If ONE method in a class is abstract the nthe whole class has to be declared abstract.
 * An abstract class CAN HAVE concrete methods (methods with a body)
 * You DONT HAVE TO HAVE abstract methods inside an abstract class.
 */

public abstract class Animal {
	
	//Variables cannot be abstract: 
	//abstract double weight; //computer say's no
	int age;
	
	//methods CAN be abstract. An abstract method has no body.
	//An abstract method has to be definted with the keyword "Abstract" and it has no body:
	abstract void happy(); //no body or braces! 
	
	//Any concrete class that extends Animal HAS TO provide a body for void happy().
	//It does this by OVERRIDING the method.
	
	
	//An abstract class CAN HAVE concrete methods, which a subclass can CHOOSE to override or not.
	void mad() {
		System.out.println("I am a mad Animal");
	}
	
	//You cant have a concrete method WITHOUT a body;
	//void angry();
	
	//You cant use abstract with a method with a body:
	/*abstract void angry() {
		
	}*/
	
	void sad() {
		System.out.println("I am a sad Animal");
	}
	

}

/*
Every inherited abstract method HAS to be implemented in this class. 
That means you HAVE TO override the abstract happy method and provide it with a body in the Dog class. 
 */

class Dog extends Animal{

	//overriding the happy method. Which it HAS TO DO.
	void happy() {
		System.out.println("I am a happy Dog");
	}
	
}













