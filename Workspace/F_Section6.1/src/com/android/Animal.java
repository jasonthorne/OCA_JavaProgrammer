package com.android;

public class Animal {
	int age;
	String name;
	
	void eat() {
		System.out.println("eating");
	}
	/*
	 * this method can ONLY TAKE a Animal object, it CANNOT TAKE a
	 * Dog object as there is no relationship between the classes.
	 * So  if no inheritance relationshiop, instead of a takeAnimal()
	 * method that can take any any Animal (animal or dog), we have
	 * to create two methods in each class. One that takes a 
	 * Animal and one that takes a Dog. So we end up with 4 overloaded
	 * methods, insteand of one if we have a inheritance relationship
	 * between Animal and Dog
	 */
	void takeAnimal(Animal myAnimal) {
		
	}
	
	void takeAnimal(Dog myDog) {
		
	}

}

 class Dog{
	int age;
	String name;
	
	void eat() {
		System.out.println("eating");
	}
	
	void takeAnimal(Animal myAnimal) {
		
	}
	
	void takeAnimal(Dog myDog) {
		
	}
}
