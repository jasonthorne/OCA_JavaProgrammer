package com.android;

public class Dog {
	public int age;//age of dog
	public String name;//name of dog
	//constructor for a Dog and gives value to age and name
	public Dog(int age,String name) {
		this.age=age;
		this.name=name;
	}
	/*
	 * getter for age
	 * a public method that gets the variable age
	 */
	public int getAge() {
		return age;
	}
	/*
	 * getter for name
	 * a public method that gets the variable name
	 */
	public String getName() {
		return name;
	}
	/*
	 * setAge is a public method, that returns void and is used
	 * to set the age of the dog
	 */
	public void setAge(int age) {
		this.age=age;
	}
	/*
	 * setName is a public method, that returns void and is used to
	 * set the name of the dog
	 */
	public void setName(String name) {
		this.name=name;
	}

}
