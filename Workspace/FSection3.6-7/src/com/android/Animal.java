package com.android;
/*
 * The relationship that Cow has to Animal is an example of what is
 * called a tightly coupled class
 */
public class Animal {
	int age;
	String  name;
	
	Animal(int age,String name){
		this.age=age;
		this.name=name;
	}
	void eat() {
		System.out.println("Animal eating");
	}
	void drink() {
		System.out.println("Animal drinking");
	}
}

class Cow extends Animal{
	
	Cow(int age,String name){
		super(age,name);
	}
	
	@Override
	void drink() {
		System.out.println("Cow drinking");
	}
}
