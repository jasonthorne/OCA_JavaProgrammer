package com.gretb;

public class Car {
	
	String model;
	String make;
	int reg;
	
	Car(){
		System.out.println("Blank car constructor called");
	}
	
	Car(String model, String make, int reg) {
		System.out.println("Constructor that takes two strings and an int");
		this.model = model;
		this.make = make;
		this.reg = reg;
	}

}
