package com.android;

public class Cat {

	/*
	 * We are applying encapsulation principles to the Cat class. 
	 * This is making all of our attributes private and using public methods to access the values (getters)
	 * and public methods to change the values (setters).
	 */
	
	private int age; 
	private String name;
	
	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	
	//------------------------------------
	//getters:
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	
	
	
}
