package com.gretb;

public class Dog {
	
	int age;
	double weight;
	String name;
	
	//dog constructor
	/*
	 * This uses the 'this' keyword, which refers to THIS dog. so this.age, means the age of the dog we just created
	 */
	Dog(int age, double weight, String name){
		this.age = age;
		this.weight = weight;
		this.name = name;
		System.out.println("Dog constructor called");
	}
	
	void eat() {
		//the 'this' keyword is implicitly there in every place you use an attribute name inside the dog class.
		System.out.println(this.name + " is eating");
	}
	
	
	/**
	 * POLYMORPHISM
	 */

	void eat() {
		System.out.println("");
	}
	
	
	
}
