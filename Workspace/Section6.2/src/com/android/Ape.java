package com.android;

public class Ape {
	
	/*
	 * When overriding a method, you cant make it LESS avaliable but you can make it MORE avaliable.
	 */
	
	public void eat() {
		System.out.println("Ape eating");
	}
	
	protected void drink() {
		System.out.println("Ape drinking");
	}
	
	void breed() {
		System.out.println("Ape breeding");
	}
	
	private void sleep() { //CANT BE INHERITED as it's private +++++++++++
		System.out.println("Ape sleeping");
	}
	

}

class Human extends Ape {
	
	public void eat() {
		System.out.println("Human eating");
	}
	
	public void drink() { //made more available 
		System.out.println("Human drinking");
	}
	
	protected void breed() { //made more available 
		System.out.println("Human breeding");
	}
	
	
	
}
