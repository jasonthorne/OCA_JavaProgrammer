package com.android;

/**
 * 
 * Exam objective 6.3. create & Overload constructors
 *
 *What is a constructor: A constructor is a speacial type of method that is used to create an object. 
 *The constructor is always the same name as the class it is contained withi.
 *IT NEVER HAS A RETURN TYPE, not even void.
 *You can overload constructors, which means a single class can have many different constructors.
 *The same rule applies to overloaded constructors as overloaded methods: 
 *You have to have either a different parameter list or a different order of parameters to have overloaded constructors.

 */
public class Main {

	public static void main(String[] args) {
		
		/*'new Dog()' is calling a constructor in the Dog class that takes no arguments. 
		When you define a constructor in the class you no longer have access to the default constructor.*/
		Dog spot = new Dog();
		
		Zebra zed = new Zebra(2); //you can ONLY create a Zebra by calling the only constructor in the class (that takes an int)
		
		Cat cat1 = new Cat(); //calls constructor 1 (no params)
		Cat cat2 = new Cat(3); //calls constructor 2  (int)
		Cat cat3 = new Cat(3, "tom", 3.3); //calls constructor 3  (int, string, double)
		Cat cat4 = new Cat("tom", 3.3, 3); //calls constructor 4 (string, double, int)
		
		//error, as passing an int to the double param is too ambiguous amongst the constructors
		//Cat cat5 = new Cat("ginger", 3, 3); //calls constructor 5 (string, double, int)
		
		
		//===========
		
		Elephant nellie = Elephant.makeElephant(); //creating an Elephant statically.
		
		Donkey d = new Donkey();
		
		Human harry = new Human(43, "harry", 156, false);
		
		Employee eddie = new Employee();
		
	}
	

}
