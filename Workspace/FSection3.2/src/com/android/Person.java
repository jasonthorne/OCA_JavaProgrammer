package com.android;

public class Person {
	//this will keep a count of how many people are created
	static int counter=0;
	int age;
	/*
	 * this is a constructor that takes no arguments and keeps
	 * count of how many people are created so far
	 */
	Person(){
		System.out.println("person created");
		counter++;
		System.out.println(counter+" people created");
	}
	/*
	 * this is a constructor that takes an int, assigns to age
	 * and keeps a count of how many peopple created so far
	 */
	Person(int age){
		this.age=age;
		System.out.println("person created");
		counter++;
		System.out.println(counter+" people created");
	}

}
