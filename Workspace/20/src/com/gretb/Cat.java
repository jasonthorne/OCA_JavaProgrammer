package com.gretb;

public class Cat {
	
	int age;
	double weight;
	String name;
	
	//cat constructor
	/*
	 * This uses the 'this' keyword, which refers to THIS cat. so this.age, means the age of the cat we just created
	 */
	Cat(int age, double weight, String name){
		this.age = age;
		this.weight = weight;
		this.name = name;
		System.out.println("Cat constructor called");
	}
	
	void eat() {
		//the 'this' keyword is implicitly there in every place you use an attribute name inside the cat class.
		System.out.println(this.name + " is eating");
	}

}
