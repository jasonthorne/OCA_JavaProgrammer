package com.gretb;

public class Dog {
	int age;//age of dog
	String name;//name of Dog
	//constructor to create a dog that takes an int and String
	public Dog(int age,String name) {
		this.age=age;
		this.name=name;
		//this is for the programmer, so we can see a dog is created
		System.out.println("Dog created");
	}

}
