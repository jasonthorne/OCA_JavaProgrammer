package com.noel;

public class Dog {
	String name;
	int age;
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	

}
