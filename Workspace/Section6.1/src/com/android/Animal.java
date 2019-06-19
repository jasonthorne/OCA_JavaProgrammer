package com.android;


public class Animal {

	int age;
	String name;
	
	void eat() {
		System.out.println("Animal eating");
	}
	
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
