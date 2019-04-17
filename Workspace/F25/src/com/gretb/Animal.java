package com.gretb;

public class Animal {
	int age;//age of Animal
	String name;//name of Animal
	double weight;//weight of Animal
	//Animal constructor that takes no Arguments
	Animal(){
		System.out.println("Blank Animal constructor called");
		Animal andy=new Animal();
		
	}//end of blank animal constructor
	//Animal constructor that takes an int, string and double
	public Animal(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		System.out.println("Animal constructor that takes an int, String and double");
	}//end of constructor with int, string double sent to it
	/*
	 * here we are overriding the toString() method of the Object class. 
	 * The Object class is the ultimate base class for EVERY class we will ever
	 * create in java. Every class ultimately inherits from Object class.
	 * The toString() method tries to print out an object, the default Object 
	 * class implementation will just print out the address of the object. We are
	 * going to override it in the Animal, so that the Animals age, name and Weight
	 * will be printed out when placed in a print statement.
	 * the toString() method HAS TO public, it returns a String
	 * it takes no arguments, and it has to be called "toString" (case sensitive)
	 * we are overriding the toString() method to return the age,name and weight
	 * of an Animal as a string
	 */
	public String toString() {
		String myStr="Animal age is "+age+" name is "+name+" weight is "+weight;
		return myStr;
	}//end of toString
	
}
