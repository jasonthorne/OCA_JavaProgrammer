package com.android;

public class Dog {
	
	public int age; 
	public String name;
	
	//constructor for a dog, that gives value to age & name:
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	//------------------------------------
	//getters and setters:
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	
	
}
