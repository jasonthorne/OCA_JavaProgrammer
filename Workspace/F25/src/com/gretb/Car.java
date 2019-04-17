package com.gretb;

public class Car {
	String model;//model of car .ie. volkswagon
	String make;//make i.e passat
	int reg;//registration i.e 123456
	//blank car constructor
	Car(){
		System.out.println("blank car constructor called");
	}
	//constructor that takes a string, string and int
	Car(String model, String make, int reg){
		this.model=model;
		this.make=make;
		this.reg=reg;
		System.out.println("constructor that takes two strings and an int called");
	}

}
