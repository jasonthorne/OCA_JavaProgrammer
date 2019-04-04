package com.gretb;
/**
 * Constructors
 * @author noelf
 *
 */
public class Dog {
	int age;//age of the dog
	String name;//name of the dog
	double weight;//weight of the dog
	/*
	 * A constructor is a special method that creates objects. In this 
	 * case its a special method that creates a Dog. EVERY class has 
	 * a constructor, if you can't see a constructor in your class, that 
	 * means it is using something called the DEFAULT CONSTRUCTOR, which
	 * is a hidden no arguement constructor.
	 * As soon as we create a constructor, this then becomes the only 
	 * way we can create objects, so this becomes the de facto default
	 * constructor
	 */
	/*
	 * A constructor has to be the SAME name as the class it's inside.
	 * DOES NOT have any return values, not even void
	 * After the name, it follows the same layout as a method. namely
	 * parenthesis() followed b y curly {}. What is inside the curly 
	 * brackets is the code that runs WHEN A DOG IS CREATED
	 * This constructor for the Dog class takes no arguments and will
	 * print out "Dog constructor called" every time a dog is created using
	 * this constructor. A class can have many constructors but in this
	 * case there is only this constructor, so you can ONLY create a Dog
	 * with this constructor, there is not other way
	 */
	Dog(){
		//this shows when this constructor is called to create a dog
		System.out.println("Dog Constructor called");
	}

}
