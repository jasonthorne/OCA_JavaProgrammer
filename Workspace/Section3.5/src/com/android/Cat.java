package com.android;

public class Cat {
	
	int age;
	String name;
	double weight; 
	
	//constructor 1, that takes no arguments
	Cat(){
		System.out.println("cat constructor that takes no arguements.");
		age=21;
		name="tiddles";
		weight=12.3;
	}
	
	//overloaded constructor 2:
	Cat(int age){
		this.age=age;
	}
	
	//overloaded constructor 3:
	Cat(int age, String name, double weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	
	//overloaded constructor 4: (like above, but with different param order, making it overloaded).
	Cat(String name, double weight, int age){
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	
	//overloaded constructor 5: *can be ambiguous with constructor 4 if you pass an int arg to the double param). ++++++++++++++++++++++++++++
	Cat(String name, int age, double weight){
		
	}


}
