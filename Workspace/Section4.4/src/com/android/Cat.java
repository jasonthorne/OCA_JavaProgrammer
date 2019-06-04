package com.android;

public class Cat {
	
	String name;
	int age;
	final int id;
	static int counter = 0;
	
	
	public Cat(int age, String name) {
		super();
		this.name = name;
		this.age = age;
		counter++;
		id = counter;
	}
	
	Cat(){
		counter++;
		id=counter;
	}

	//OVERRIDING THE toSTring method (to print the age, id & name of Cat)
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	void eat() {
		System.out.println(name + " is eating!");
	}
	
	
}
