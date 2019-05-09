package com.android;

import java.lang.reflect.Method;

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
		
		
		//===========================================================================
		//TESTING FOR EQUIVELLANCE
		System.out.println("\nTESTING FOR EQUIVELLANCE");
				
		Zebra zed = new Zebra(); //an id of 1
		Zebra zelda = new Zebra(); //an id of 2
		Zebra zoe = zed; //creating a new REFERENCE to zed object called zoe (has id of 1).
		
		int num1 =45;
		int num2 =45;
		
		System.out.println("Testing if two numbers are the same: " + (num1 == num2));
		System.out.println("Testing for equivellance: "); 
		System.out.println(zoe == zed); //true as both reference the same object
		System.out.println(zoe == zelda); //false as both reference a different object
		zed.age=3;
		zelda.age=3;
		zed.weight=2.3;
		zelda.weight=2.3;
		//If we dont OVERRIDE this equals method then all it will do is to check if zed and zelda are the same zebra (point to the same object). +++++++++++++++++++++++
		//WE want to check if they have the same age and weight so we override the equals method.
		System.out.println("Are zed and zelda's age and weight the same: " + zed.equals(zelda)); 
				
		
		Animal andy = new Animal();
		Cow bessie = new Cow();
		Fresian fred = new Fresian();
		Sheep flossie = new Sheep();
		Pig babe = new Pig();
		
		//When a method can take a superclass object, that means it can also take a subclass of the superclass. ++++++++++++++++
		System.out.println("\n");
		takeAnimal(andy);
		takeAnimal(bessie);
		takeAnimal(fred);
		takeAnimal(flossie);
		takeAnimal(babe);
		
		
		lassie.age=2;
		lassie.weight = 4.5;
		int changeNum=200;
		System.out.println("\nbefore method call, age of lassie is: " + lassie.age);
		System.out.println("before method call, weight of lassie is: " + lassie.weight);
		System.out.println("before method call, id of lassie is: " + lassie.dogId);
		System.out.println("before method call, changeNum is: " + changeNum + "\n");
		
		/*An Object reference does NOT store the object itself. All it stores is the address of the object.
		When you pass an object into a method it is passed by reference. This means that when you change the attributes of an object in a method
		the attributes are also changed outside the Method.class 
		In this case we change the age and weight of the dog inside the method, the age and eight are then changed outaide the of the method.
		 
		*/
		changeValues(lassie, changeNum);
		
		System.out.println("\nafter method call, age of lassie is: " + lassie.age);
		System.out.println("after method call, weight of lassie is: " + lassie.weight);
		System.out.println("after method call, id of lassie is: " + lassie.dogId);
		System.out.println("after method call, changeNum is: " + changeNum + "\n"); //was passed by value. ie a copy of the PRIMITIVE var is what is passed.
		
		
	}
	
	
	static void takeAnimal(Animal myAnimal) {
		System.out.println("Type of animal is: " + myAnimal.getClass().getSimpleName()); //getClass gets entire class path. getSimpleName simplifies it to just class name.
	}
	
	static void changeValues(Dog lassie, int myNum) {
		lassie.age=9000;
		System.out.println("inside method, age of lassie is: " + lassie.age);
		lassie.weight=100.33;
		System.out.println("inside method, weight of lassie is: " + lassie.weight);
		myNum=7800;
		System.out.println("inside method, num is: " + myNum);
		System.out.println("inside method, id of the dog is: " + lassie.dogId);
		
		lassie = new Dog(); //make lassie a new dog.
		System.out.println("inside method, id of the NEW dog is: " + lassie.dogId);
		
	}
	
	
	
	
	

}
