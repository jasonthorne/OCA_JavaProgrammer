package com.android;

public class Animal {

}


class Dog extends Animal{
	void eat() {
		System.out.println("Dog eating");
	}
}

class Cat extends Animal implements Behaviour{
	

	@Override
	public void mad() {
		System.out.println("Cat mad");
	}
}