package com.android;

public class Cat {
	int age;
	String name;
	
	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	//override the ToString method:
	@Override
	public String toString() {
		return "cat age is: "+age+ ". name is: " + name;
	}

}
