package com.android;
/*
 * the order of the position in the class DOES NOT matter
 */
public class Human {
	int age;
	String name;
	double weight;
	boolean sex;
	String gender;
	
	//Constructor 1
	public Human(int age,String name, double weight,boolean sex){
		this(age,name);//calling constructor 2
		System.out.println("constructor 1 called");
		this.weight=weight;
		this.sex=sex;
		if(sex) {
			gender="Female";
		}
		else
			gender="Male";
	}
	
	//Constructor 2
	private Human(int age,String name){
		this(name);//calling constructor 3
		System.out.println("constructor 2 called");
		this.age=age;
	}
	
	//constructor 3
	private Human(String name){
		this();//calling constructor 4
		System.out.println("Constructor 3 called");
		this.name=name;
	}
	//Constructor 4
	private Human(){
		super();//calling Object class constructor with no arguments
		System.out.println("constructor 4 called");
	}

}
