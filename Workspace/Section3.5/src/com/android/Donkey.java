package com.android;

public class Donkey {
	
	int age;
	String name;
	double weight;
	
	Donkey(){
		this(12, "neddy", 120.2); //this looks in the same class for a constructor that takes these args +++++++++++++++++++++++
	}
	
	public Donkey(int age, String name, double weight) {
		super();
		System.out.println("Donkey constructor that takes an int, string and double");
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	

}
