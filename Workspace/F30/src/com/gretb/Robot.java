package com.gretb;


/*
 * multiple inheritance is not allowed in Java (you can only inherit from
 * one class) but  you can have multiple implementation of interfaces. here
 * our Robot class implements both Movement and Behaviour
 * So our Robot can walk(), run(), fly(), swim(),jump()
 * and can be happy(), sad(), mad(),angry()
 */
public class Robot implements Movement,Behaviour{
	//from movement() interface
	@Override
	public void walk() {
		System.out.println("Robot walking");
		
	}
	//from movement() interface
	@Override
	public void run() {
		System.out.println("robot running");
		
	}
	//from movement() interface
	@Override
	public void fly() {
		System.out.println("robot flying");
		
	}
	//from movement() interface
	@Override
	public void swim() {
		System.out.println("robot swimming");
		
	}
	//from movement() interface
	@Override
	public void jump() {
		System.out.println("robot jumpting");
		
	}
//from movement() interface
	@Override
	public void hop() {
		System.out.println("robot hopping");
		
	}
	//from Behaviour interface
	@Override
	public void happy() {
		System.out.println("robot happy");
		
	}
	//from Behaviour interface
	@Override
	public void sad() {
		System.out.println("robot sad");
		
	}
	//from Behaviour interface
	@Override
	public void mad() {
		System.out.println("robot mad");
		
	}
//from Behaviour interface
	@Override
	public void angry() {
		System.out.println("robt angry");
		
	}

}
