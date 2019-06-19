package com.android;


public class Animal {

	int age;
	String name;
	
	void eat() {
		System.out.println("Animal eating");
	}
	
	
	/*
	 * This method can only take an Animal object. It cannot take a Dog object, as there is no relationship between the classes.
	 * So we have to create two methods in each class. here is no inheritence relationship, instead of takeAnimal() method that can take any Animal (animal or Dog)
	 * 
	 */
	void takeAnimal(Animal myAnimal) {
		
	}
	
	void takeAnimal(Dog myDog) {
		
	}
}


class Dog {
	int age;
	String name;
	
	void eat() {
		System.out.println("Dog eating");
	}
	
	void takeAnimal(Animal myAnimal) {
		
	}
	
	void takeAnimal(Dog myDog) {
		
	}
	
}
