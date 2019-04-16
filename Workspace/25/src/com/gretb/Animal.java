package com.gretb;

public class Animal {
	int age;
	String name;
	double weight;
	
	//blank constructor
	Animal(){
		System.out.println("Blank Animal constructor");
	}

	public Animal(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	

}
