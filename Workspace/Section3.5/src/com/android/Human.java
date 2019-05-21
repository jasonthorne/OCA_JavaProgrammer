package com.android;

public class Human {
	
	int age;
	String name;
	double weight;
	boolean sex;
	String gender;
	
	//constructor 4
	private Human(){
		super(); //calling object class constructor, with no args.
		System.out.println("\nconstructor 4 called");
	}
	
	//constructor 3
	private Human(String name){
		this(); //calling constructor 4
		System.out.println("constructor 3 called");
		this.name=name;
	}
	
	//constructor 2
	private Human(int age, String name){
		this(name); //calling constructor 3
		System.out.println("constructor 2 called");
		this.age=age;
	}
	
	//constructor 1
	public Human(int age, String name, double weight, boolean sex){
		this(age, name); //calling constructor 2
		System.out.println("constructor 1 called");
		this.weight=weight;
		this.sex=sex;
		if(sex) {
			gender="female"; 
		}else gender="male";
	}
	
	
	

}
