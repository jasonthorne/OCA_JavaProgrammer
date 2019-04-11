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
	}

}
