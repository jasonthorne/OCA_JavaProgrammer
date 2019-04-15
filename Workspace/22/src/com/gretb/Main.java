package com.gretb;

public class Main {
	
	public static void main(String [] args) {
		
		String name="hello";
		Animal andy = new Animal();
		
		andy.move();
		andy.eat();
		andy.reproduce();
		andy.breath("frank", 4);
		
		Cow bessie = new Cow();
		
		//All these methods are taken from the Animal implementation as well. 
		bessie.move(); //takes implementation for move() from Animal
		bessie.reproduce(); //takes implementation for reproduce() from Animal
		bessie.breath("Bob", 14); //takes implementation from Animal
		
		
		/*
		 * This is overriden, as the void eat() method exists in the Animal class
		 * and we are overriding the eat() method in the Cow class. So this method takes its implementation from the Cow class.
		 */
		bessie.eat(); 
		bessie.drink(); 
		bessie.drink(4); 
		System.out.println("age of bessie is: " + bessie.age);
		
		Zebra zeb = new Zebra();
		
		//all of these methods are from Animal superclass: 
		zeb.eat();
		zeb.move();
		zeb.reproduce();
		zeb.breath("p", 6);
		
		Shark bruce = new Shark();
	
		bruce.attack(); //only available to sharks as this method resides there
		
		
		
	Fly bob = new Fly();
	Zebra charlie = new Zebra();
		
		//You can have a Superclass reference to a subclass object.
		//A cow IS an animal, a shark is an animal.
		
	Animal[]zoo = {bruce, bob, charlie}; //for different object types in the same array.
	
		for(Animal a: zoo) {
			a.eat();
		}
		
		//An animal reference to a shark obj
		Animal aShark = new Shark(); 
		
		//An animal ref to a cow obj:
		Animal aCow = new Cow();
		
		//when you have a superclass reference to a subclass obj, you can only call methods that were first defined in the superclass. 
		//The reference is checked for existence first, and if so, then is run. If method only exists in the object, then it wont compile.
		aShark.eat(); //works as exists in Aniaml
		//aCow.drink(); //wont work ,as isnt in Animal
		
	}

}
