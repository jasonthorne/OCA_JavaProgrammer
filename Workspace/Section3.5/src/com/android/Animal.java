package com.android;

public class Animal {
	
	Animal(){
		super(); //creates an object
		System.out.println("Animal constructor called");
	}
}

class Cow extends Animal{
	
	Cow(){
		super(); //creates an animal
		System.out.println("Cow constructor called");
	}
}

class Fresian extends Cow{
	
	Fresian(){
		super(); //creates a cow
		System.out.println("Fresian constructor called");
	}
}


