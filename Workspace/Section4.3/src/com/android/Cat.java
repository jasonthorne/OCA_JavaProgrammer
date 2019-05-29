package com.android;

public class Cat {
	
	int age;
	String name;
	
	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	void eat() {
		System.out.println(name + " is a cat eating");
	}
	
	/*
	String eat() {
		return name + " is a cat eating";
	}*/
	
	void drink() {
		System.out.println(name + " is a cat drinking");
	}

}
