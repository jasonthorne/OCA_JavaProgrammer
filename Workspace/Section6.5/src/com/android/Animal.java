package com.android;

public class Animal {
	
	int age=23;
	String name="Andy";
	
	void eat(){
		System.out.println("Animal eating");
	}

}


class Dog extends Animal{
	
	int age=100;
	String name="Spot";
	
	void eat(){
		System.out.println("Dog eating");
	}
	
}

class Terrier extends Dog{
	int age=1000;
	String name="Terry";
	
	void eat(){
		System.out.println("Terrier eating");
	}
	
}

