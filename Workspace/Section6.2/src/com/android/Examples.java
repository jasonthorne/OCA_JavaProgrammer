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
		//SUPERCLASS REFERENCES TO SUBCLASS OBJECTS ++++++++++++++++++++++++++++++++++++
		
		
		//you CAN have a behaviour reference. You CANT have a behaviour object, because this is an interface, & an interface is an abstract class.
		Behaviour behaveDog; 
		behaveDog = new Dog(); //a superclass interface reference to a subclass object. this ONLY has access to the behaviours inherited from the interface. 
		
		
		Animal aCat = new Cat(); //a superclass reference to a subclass object
		//ONLY has acccess to behaviours from the superclass
		aCat.breed();
		aCat.drink();
		aCat.eat();
		
		//-------
		
		 //superclass reference to a subclass object:
		Employee empFire = new Fireman();
		
		//subclass reference to a superclass object:
		//Fireman fireEmp = new Employee(); //WONT compile. This gives a "ClassCastException"
		
		
	}
	
	static void ex2() {
		
		//Go to duck class to see multiple implementation of interfaces.+++++++++
		
		Duck daffy = new Duck();
		daffy.findWater();
		daffy.paddle();
		daffy.launch();
		daffy.glide();
		daffy.land();
		
		
		Swim swimDaffy = daffy; //an interace superclass reference to a subclass object.
		
		swimDaffy.findWater(); //only gives access to THAT superclass refrence behaviour.
		
	}

}
