package com.apple;

public class Dog {
	int age;
	
	protected String name;
	
	public double height;
	
	private double weight;
	
	Dog(int age){
		this.age=age;
	}
	
	protected Dog() {
		System.out.println("protected Dog constuctor called");
	}
	
	public Dog(String name) {
		this.name=name;
		System.out.println("public Dog constructor called");
	}
	
	private Dog(String name,double weight) {
		this.name=name;
		this.weight=weight;
		System.out.println("private Dog Constructor called");
	}
	
	protected void eat() {
		System.out.println("protected Dog eating");
	}
	public void drink() {
		System.out.println("public Dog drinking");
	}
	void run() {
		System.out.println("package dog runinning");
	}
	private void bark() {
		System.out.println("private dog barking");
	}

}
