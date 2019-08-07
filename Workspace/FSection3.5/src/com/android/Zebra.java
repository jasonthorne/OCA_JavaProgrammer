package com.android;

public class Zebra {
	int age;
	String name;
	/*
	 * this is now THE ONLY WAY to create a Zebra, as we have a 
	 * user defined constructor in the class that takes an int.
	 * So we no longer have access to the default no arguement
	 * constructor
	 */
	Zebra(int age){
		this.age=age;
		System.out.println("zebra constructor with int called");
	}

}
