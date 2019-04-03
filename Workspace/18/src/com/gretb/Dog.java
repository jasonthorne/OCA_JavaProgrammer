package com.gretb;


/*
 * Constructors
 */

public class Dog {
	
	int age;
	String name;
	double weight;
	
	/*A constructor is  special method that creates objects. In this case its a special method that creates a dog. EVERY class has a constructor.
	 * If you cant see a constructor in your class that means it is using a default constructor, which is s hidden no argument constructor.
	 * As soon as we create a constructor, this is the only way we can create objects, so this becomes the defacto default constructor.
	 */
	
	//constructor
	public Dog() {
		//this shows when this constructor called for every dog created
		System.out.println("Dog constructor");
	}
	
	/*
	 * A constructor has to be the same name as the class inside. 
	 * DOES NOT have any return values, not even void. (void turns it from a constructor to a method!)
	 * After the name, it follows the same layout as a method. Namely parenthesis() followed by curly {}.
	 * What is inside the curly brackets is the code that runs WHEN A DOG IS CREATED
	 * 
	 * The above constructor for the Dog class, takes no arguments and will print out "Dog constructor" every time a dog is constructed using this constructor.
	 * A class can have many constructors, but in this case there is only one constructor, so you can ONLY create a Dog with this constructor!  
	 */
	
	

}
