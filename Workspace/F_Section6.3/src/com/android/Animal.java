package com.android;

public abstract class Animal {
	
	abstract void eat();
	void drink() {
		System.out.println("Animal drinking");
	}
	
	abstract void sleep();

}

class Ape extends Animal{
	
	void eat() {
		System.out.println("Ape eating");
	}
	
	void sleep() {
		System.out.println("Ape sleeping");
	}
	
	void swing() {
		System.out.println("Ape swinging");
	}
}

class Human extends Ape{
	void sleep() {
		System.out.println("human sleeping");
	}
	void talk() {
		System.out.println("human talking");
	}
}
