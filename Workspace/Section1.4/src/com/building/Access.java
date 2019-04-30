package com.building;

public class Access {

	
	Animal animal = new Animal();
	
	void printMe() {
		//age is private to the animal class so where we create the Animal dictates our accesss to it. 
		//Our animal here cant see it for example:
			
		//System.out.println(animal.age); //doesnt work
		
		
		System.out.println(animal.height); //protected
		System.out.println(animal.weight); //default
		System.out.println(animal.name); //public
		animal.eat(); //default
		animal.run(); //public
		animal.sleep(); //protected
		
	}
}
