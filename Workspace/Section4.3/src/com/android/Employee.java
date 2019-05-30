package com.android;

public class Employee implements Behaviour{
	
	int age=100;
	String name="etna";

	@Override
	public void mad() {
		System.out.println("Employee mad");
		
	}

	@Override
	public void happy() {
		System.out.println("Employee happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Employee sad");
		
	}
	
	void doWork() {
		System.out.println("Employee working");
	}


}

class Fireman extends Employee{
	
	//This class inherits ALL of the methods from the Employee class.
	
	@Override
	public void sad() {
		System.out.println("Fireman sad");
		
	}
	
	//================
	//When overriding a method, you cant make it any LESS available. (is public in superclass, so can't be less than public here) 
	/*@Override
	void mad() {
		System.out.println("Employee mad");
		
	}*/
	
	
	@Override
	public void mad() {
		System.out.println("Employee mad");
		
	}
	
	//this is fine as above is default (package level), its making it MORE available here.
	protected void doWork() {
		
	}
	
	
	
	
	
	//================
	
}


