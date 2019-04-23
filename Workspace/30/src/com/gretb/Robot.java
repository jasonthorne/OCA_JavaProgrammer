package com.gretb;

//You can only inherit from one class, but you can have multiple implementation of interfaces
public class Robot implements Movement, Behaviour{

	//from Movement interface: 
	
	@Override
	public void walk() {
		System.out.println("Robot walking");
		
	}

	@Override
	public void run() {
		System.out.println("Robot running");
		
	}

	@Override
	public void fly() {
		System.out.println("Robot flying");
		
	}

	@Override
	public void swim() {
		System.out.println("Robot swimming");
		
	}

	@Override
	public void jump() {
		System.out.println("Robot jumping");
		
	}

	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//from Behavior interface: 
	
	@Override
	public void happy() {
		System.out.println("Robot happy");
		
	}

	@Override
	public void sad() {
		System.out.println("Robot sad");
		
	}

	@Override
	public void mad() {
		System.out.println("Robot mad");
		
	}

	@Override
	public void angry() {
		System.out.println("Robot angry");
		
	}

}
