package com.android;

public class Zebra {
	
	int age;
	String name;
	
	//This is now the only way to create a Zebra as we have a user defined consructor that takes an int. So we no longer have access to the default constructor.
	Zebra(int age){
		this.age=age;
		System.out.println("Zebra constructor with int is called");
	}
	
	

}
