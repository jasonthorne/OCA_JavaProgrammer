package com.gretb;

public class Dog {

	private int age;
	private String name;
	
	
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	
	

}
