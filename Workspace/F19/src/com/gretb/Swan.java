package com.gretb;

public class Swan {
	int age;//age of swan
	double weight;//weight of swan
	double height;//height of swan
	String name;//name of swan

	//constructor for swan that takes a int, double,double and String
	Swan(int sAge,double sWeight,double sHeight,String sName){
		age=sAge;
		weight=sWeight;
		height=sHeight;
		name=sName;
		//will print out each time a swan is created
		System.out.println("swan constructor called");
	}
	//method to print out all atributes of a swan
	void printSwan() {
		System.out.println("******************");
		System.out.println("age is "+age);
		System.out.println("weight is "+weight);
		System.out.println("height is "+height);
		System.out.println("name is "+name);
	}
}
