package com.android;

public class Animal {

}

class Dog extends Animal{
	void eat() {
		System.out.println("dog eating");
	}
}

class Cat extends Animal implements Behaviour{

	@Override
	public void mad() {
		System.out.println("cat mad");
		
	}

	
	
}
