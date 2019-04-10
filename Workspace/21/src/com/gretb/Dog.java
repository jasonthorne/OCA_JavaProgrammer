package com.gretb;

public class Dog {
	int age;
	String name;
	double weight;
	Dog partner; //dogs partner
	Dog[]litter;
	//1st constructor (that takes no arguements)
	Dog(){
		System.out.println("Blank dog constructor called");
	}
	
	
	/*
	 * A constructor is still a method (albeit a method with no return type) so you can overload it,
	 * and the same rules apply to other overloaded methods also apply to overloaded constructors.
	 */
	
	public Dog(int age, String name, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
		System.out.println("Dog constructor that takes an int, String and double");
	}
	
	
	public Dog(String name, int age, double weight){ //Different from above constructor due to order of parameters ++++++++++++++++++
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println("Dog constructor that takes a String, int and double");
	}
	

	public Dog(int age) {
		this.age = age;
		System.out.println("Dog constructor that takes just an int");
	}
	

}
