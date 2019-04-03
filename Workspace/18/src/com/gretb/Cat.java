package com.gretb;

public class Cat {
	
	int age;
	String name;
	double weight;
	
	/*
	 * This is a Cat constructor that takes an int, a String and a double.
	 * If you are creating a cat, you have to pass in arguements in that order i.e: new Cat(12, "tibbles", 2)
	 */
	Cat(int myAge, String myName, double myWeight){
		age = myAge;
		name = myName;
		weight = myWeight;
	}
	
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
}
