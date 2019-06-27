package com.android;

public class Employee {
	
	int age=23;
	
	String name= "eddie";
	
	//blank constructor that takes no args
	Employee(){
		super(); //this is here implicitly (a call to the superclass "object class" constructor). A superclass is aa class that you directly inherit from.
		System.out.println("blank employee constructor called");
	}
	
	Employee(int age, String name){
		//super(); //this is implicently here
		this.age = age;
		this.name = name;
		System.out.println("Employee constructor that takes an int and a string");
	}
	
	Employee(int age){
		
		//this is calling a constructor in this class that takes an int & a string. 
		//when calling another constructor from within a constructor, IT HAS TO BE THE FIRST PIECE OF CODE
		this(age, "patsy");
		System.out.println("Employee constructor that takes an int");
		
	}
	
	void earn() {
		System.out.println("Employees earn money");
	}
	
	void duties() {
		System.out.println("duties method called");
		
		/*
		 * When calling a method from insid a class, 'this' is implicently before every method call
		 */
		earn();
		//OR
		this.earn();
		
		System.out.println("age is"+age);
		System.out.println("age is"+this.age);
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	

}
