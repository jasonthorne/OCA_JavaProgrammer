package com.android;

//Cow is a tightly coupled class (as it exists within the same file as Animal). 


public class Animal {
	int age;
	String name;
	
	/*
	Animal(int age, String name){
		this.age=age;
		this.name=name;
	}*/
	
	void eat() {
		System.out.println("Animal eating");
	}
	
	void drink() {
		System.out.println("Animal drinking");
	}
	
}


class Cow extends Animal{
	
	/*
	Cow(int age, String name){
		super();
	}*/
	
	void drink() {
		System.out.println("Cow drinking");
	}
}

