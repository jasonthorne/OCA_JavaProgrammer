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
		System.out.println("protected Dog constructor called");
	}
	
	public Dog(String name) {
		this.name=name;
		System.out.println("public Dog constructor called");
	}
	
	private Dog(String name, double weight) {
		this.name=name;
		this.weight = weight;
		System.out.println("private Dog constructor called");
	}
	
	protected void eat() {
		System.out.println("protected Dog eat called");
	}
	
	public void drink() {
		System.out.println("public Dog drink called");
	}
	
	void run() {
		System.out.println("default (package level) Dog run called");
	}
	
	private void bark() {
		System.out.println("private Dog bark called");
	}
	
	
}
