package com.android;

public class Person {

	static int counter = 0; //counts how many Person objects are created.
	int age;
	
	//constructor
	Person(){
		System.out.println("Person created");
		counter++;
		System.out.println(counter + " people created");
	}
	
	//overloaded constructor
	Person(int age){
		this.age=age;
		System.out.println("Person created");
		counter++;
		System.out.println(counter + " people created");
	}
}
