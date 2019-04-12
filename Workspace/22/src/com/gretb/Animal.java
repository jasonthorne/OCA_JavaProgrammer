package com.gretb;

/**
 * Inheritance.
 * This is one of the central themes of all OOP languages
 * Animal is the base class or it is referred to in Java as the Superclass.
 * All other classes in this file will inherit from the animal class
 * You can only have one public class per file, and the class has to be the same name as the file. However a file can have as many classes as you want. 
 *
 */

public class Animal {
	
	/*
	 * We will put in the animal class only attributes and methods that are common to all Animals. 
	 */
	
	double weight;
	int age = 10;
	
	/*
	 * All of these are Super class (also called base class methods)
	 * All animals that inherit from this class will also have all these methods.
	 * They will INHERIT these methods from the Animal super class
	 * Any class that inherits from Animal can use the methods from the Animal class or they can chose to OVERRIDE the method from the base class
	 */
	
	void eat() {
		System.out.println("eating");
	}
	
	void move() {
		System.out.println("animal moving");
	}
	
	void reproduce() {
		System.out.println("animal reproducing");
	}
	
	int breath(String name, double bp){
		System.out.println("animal breathing");
		return 12;
	}
	
}//Animal


class Cow extends Animal{
	
	int age = 1000;
	
	
	/*
	 *Void eat() method in the cow class is overriding the eat() method in the Animal class. 
	 *When you are overriding, the return type DOES matter. The return type HAS to match. 
	 */
	
	void eat(){
		System.out.println("cow eating");
		System.out.println("inside eat method of cow, age of cow is: " + age);
		System.out.println("inside eat method of cow, age of animal is " + super.age);
		
		super.eat(); //this is calling the eat method in the Super Class, which is the class cow inherits from (which is 'Animal')
		
	}
	
	
	//this is only avaliable to the cow class, and any child classes
	void drink() {
		System.out.println("cow drinking ");
	}
	
}//cow class


class Zebra extends Animal{
	/*
	 * Zebra class has access to all 9 object class methods.
	 *  The object class is a hidden super class which ALL objects ultimately inherit from
	 *  Alos, Zebra also has access to he five methods of animal class. 
	 *  So zebra has access to 14 methods, even though its appears empty.
	 *  ALSO, zebra has access to two attributes (weight and age)
	 */
}

class Shark extends Animal{
	//overriding the eat() method in the animal class:
	void eat() {
		System.out.println("A shark eating");
	}
	
	//overriding the breath() method in the animal class
	int breath(String var1, double var2) {
		System.out.println("A shark breathing");
		return 1;
	}
	
	//this attack method is only avaliable to the shark, and no other animal:
	void attack() {
		System.out.println("shark attacking");
	}
	
}


class Fly extends Animal {
	
	//overriden eat method:
	void eat() {
		System.out.println("Fly eating");
	}
}


























