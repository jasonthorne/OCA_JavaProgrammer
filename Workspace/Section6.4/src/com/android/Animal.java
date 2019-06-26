package com.android;

public class Animal {
	
	int age =2;
	String name;
	
	void eat() {
		System.out.println("Animal eating");
	}
	
	void run() {
		System.out.println("Animal running");
	}

}

class Cow extends Animal{
	int age = 200;
	
	String name = "Bessie";
	
	void drink() {
		System.out.println("Cow drinking");
	}
	
	//overriding eat
	void eat() {
		System.out.println("Cow eating");
	}

	
}

class Fresian extends Cow{
	
}


class Sheep extends Animal{
	
	void sleep() {
		System.out.println("Sheep sleeping");
	}
	
}


class Pig extends Animal{
	
}

class Chicken extends Animal{
	
}
