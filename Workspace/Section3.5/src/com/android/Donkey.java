package com.android;

public class Donkey {
	
	int age;
	String name;
	double weight;
	
	public Donkey(){
		//calling a private constructor from a public constructor
		this(12, "neddy", 120.2); //this looks in the same class for a constructor that takes these args.CALL MUST BE THE FIRST THING IN CONSTRUCTOR +++++++++++++++++++++++
		System.out.println("Donkey constructor that takes no arguements");
	}
	
	private Donkey(int age, String name, double weight) {
		super();
		//this(); //calling the donkey constructor that takes no args (not allowed as it creates a loop!)
		System.out.println("\nDonkey constructor that takes an int, string and double");
		this.age = age;
		this.name = name;
		this.weight = weight;
		
	}
	
	

}
