package com.android;

public class Animal {
	
	Animal(){
		/*when we create a fresian object with
		 * new Fresian()
		 * the Fresian no argument constructor calls the 
		 * Cow no argument constructor
		 * the Cow no argument constructor calls the Animal
		 * no argument constructor
		 * The Animal no argument constructer calls the Object 
		 * no argument constructor
		 * the Object is created, then control passes down to Animal
		 * and "Animal Constructor called" is printed
		 * control passes down to Cow and "Cow constuctor called" is
		 * printed
		 * Control passes down to Fresian and "fresian constructor called"
		 * is printed
		
		 */
		super();
		//prints first
		System.out.println("Animal Constructor called");
	}
}
class Cow extends Animal{
	Cow(){
		super();
		//prints second
		System.out.println("Cow constuctor called");
	}
}
class Fresian extends Cow{
	
	Fresian(){
		super();
		//prints 3rd
		System.out.println("fresian constructor called");
	}
}
