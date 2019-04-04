package com.gretb;

public class Pig {
	int age;
	String name;
	
	/*
	 * Any class can contain any object as one of its attributes
	 */
	Person owner; //this is the owner of the pig
	
	Pig(int age, String name, Person owner){
		this.age=age;
		this.name=name;
		this.owner=owner;
		
	}

}
