package com.gretb;
/*
 * A concrete class implements an interface. every abstract method in an
 * interface HAS to be overriden in the class that implments the interface
 */
public class Insect implements Movement{
	
	public void walk() {
		System.out.println("insect walking");
	}

	@Override
	public void run() {
		System.out.println("insect running");
		
	}

	@Override
	public void fly() {
		System.out.println("insect flying");
		
	}

	@Override
	public void swim() {
		System.out.println("insect swimming");
		
	}

	@Override
	public void jump() {
		System.out.println("insect jumping");
		
	}

	@Override
	public void hop() {
		// TODO Auto-generated method stub
		
	}

}
