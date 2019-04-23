package com.gretb;

//A concrete class implements an Interface. Every abstract method in an interface HAS TO BE overridden in the class that implements the interface.
public class Insect implements Movement{

	@Override
	public void walk() {
		System.out.println("Insect walking");
		
	}

	@Override
	public void run() {
		System.out.println("Insect running");
		
	}

	@Override
	public void fly() {
		System.out.println("Insect flying");
		
	}

	@Override
	public void swim() {
		System.out.println("Insect swimming");
		
	}

	@Override
	public void jump() {
		System.out.println("Insect jumping");
		
	}

}
