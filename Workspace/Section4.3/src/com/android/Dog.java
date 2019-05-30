package com.android;

public class Dog {
	
	int age;
	String name;
	static int counter=0;
	final int id; //final MUST be given a value (as in constructor)
	
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		counter++;
		id=counter;
	}
	

}
