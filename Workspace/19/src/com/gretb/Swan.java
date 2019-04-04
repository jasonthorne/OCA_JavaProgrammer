package com.gretb;

public class Swan {

	int age;
	String name;
	double weight;
	double height;
	
	Swan(int sAge, double sWeight, double sHeight, String sName){
		this.age = sAge;
		this.weight = sWeight;
		this.height = sHeight;
		this.name = sName;
	}
	
	void printSwan() {
		System.out.println("\n**************");
		System.out.println("age is: " + age);
		System.out.println("weight is: " + weight);
		System.out.println("height is: " + height);
		System.out.println("name is: " + name);
	}
}
