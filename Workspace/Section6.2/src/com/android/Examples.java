package com.android;

public class Examples {
	
	static void ex1() {
		
		Dog spot = new Dog();
		Cat tibbles = new Cat();
		
		spot.pant(); //concrete, dog class
		spot.drink(); //abstract, abstractanimal class
		spot.sad(); //abstract, behaviour interface
		spot.happy(); //abstract, behavoiur interface
		spot.breed(); //concrete, animal class
		spot.eat(); //concrete, animal class
		spot.mad();  //default, behavoiur interface
		
		//-------
		
		tibbles.drink();
		tibbles.sad();
		tibbles.happy();
		tibbles.breed();
		tibbles.eat(); //concrete in Animal, chosen to override
		tibbles.mad(); //default in behaviour interface, hosen to override. 
		
		//-------
		
		//you CAN have a behaviour reference. You CANT have a behaviour object, because this is an interface, & an interface is an abstract class.
		Behaviour behaveDog; 
		behaveDog = new Dog(); //a superclass interface reference to a subclass object. this ONLY has access to the behaviours inherited from the interface. 
		
	}

}
