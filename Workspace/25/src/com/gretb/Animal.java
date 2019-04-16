package com.gretb;

public class Animal {
	int age;
	String name;
	double weight;
	
	//blank constructor
	Animal(){
		System.out.println("Blank Animal constructor");
		Animal andy = new Animal(); //???
	}

	Animal(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		System.out.println("Animal constructor (int, String, double)");
	}
	
	//Here we are overriding the ToString() method of the object class. Its default implimention just prints out the address of the object.
	//were overriding it so it prints the objects instance vars instead.
	//It HAS TO be public, it returns a String, takes no arguments, and is called 'toString()'
	
	public String toString() {
		
		String myStr = "age is: " + age + ". name is: " + name + ". weight is: " + weight;
		return myStr;
	}

}
