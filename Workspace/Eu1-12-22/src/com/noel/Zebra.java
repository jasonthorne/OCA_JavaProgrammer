package com.noel;

public class Zebra {
	int age;
	String name;
	
	Zebra(int age){
		/*
		 * this is a call to a blank
		 * constructor in the same class
		 */
		this();
		//super();
		this.age=age;
		System.out.println("constructor that "
				+ "takes an int called");
	}
	
	Zebra(String name){
	//	this(int);
		this.name=name;
		System.out.println("constructor that takes"
				+ " a string called");
	}
	
	Zebra(){
		//calling the constructor that takes a string
		this("Zee");
		System.out.println("Blank zebra "
				+ " constructor called");
	}

}
