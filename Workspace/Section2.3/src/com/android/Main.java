package com.android;

/**
 * 
 * Exam objective 2.1. - Declare and initialize variables (including casting of primitive data types)
 * 
 * Exam objective 2.2. - Differentiate between object
 *
 */

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Every-time we create a dog, we are implementing the static counter var by 1.
		 * This counter var is assigned to be the dogId of each Dog. 
		 * That means every new Dog we create will have a unique id.
		*/
		
		Dog spot = new Dog(); //dogId is 1
		Dog rex = new Dog(); //dogId is 2
		Dog lassie = new Dog(); //dogId is 3
		
		//3 dogs are created at this point, so counter is sitting at 4.
		
		System.out.println("Id of spot " + spot.dogId);
		System.out.println("Id of rex " + rex.dogId); 
		System.out.println("Id of lassie " + lassie.dogId);
		
		
		//creating MORE references to the same Dog object (rex) //++++++++++++++++++++++++++++++++++++++++
		//You can have as many references as you want to the same object.
		Dog benji = spot;
		Dog ruby = spot;
		
		System.out.println("\nId of spot " + spot.dogId);
		System.out.println("Id of benji " + benji.dogId); 
		System.out.println("Id of ruby " + ruby.dogId);
		
		Collie hunter = new Collie();
		System.out.println("\nId of hunter " + hunter.dogId);
		
		
		//===========================================================================
		//superclass reference to a subclass object:
		Dog dogCollie=hunter; //Now ONLY has access to stuff created in the Dog class. (nothing in Collie) +++++++++++++++++++
		
		//a behaviour reference to an object, that belongs to a class that implements that interface.
		Behaviour behaveDog=hunter; //This now ONLY has access to the methods of the Behaviour class.
		
		//All of these dog references now refer to new dogs. The original dogs with ids of 1,2,3 & 4 can no longer be referenced, and are liable for garbage collection.
		
		spot = new Dog(); //id now 5
		rex = new Dog(); //id now 6
		lassie = new Dog(); //id now 7
		benji = new Dog(); //id now 8
		ruby = new Dog(); //id now 9
		

	}

}
