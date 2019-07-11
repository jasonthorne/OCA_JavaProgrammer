package com.noel;

public class Animal {
	void drink(){
		System.out.println("Animal Drink");
	}
	/*
	 At compile time the compiler 
	 has to check to see does Animal
	 have a eat() method, it does, but it also
	 see's that the method signature throws an
	 expecption, and its only at runtime that
	 the eat() method for the dog class is called.
	 So that is why this has to be enclosed in 
	 try catch block
	 */
	void eat()throws Exception{
		System.out.println("Animal eat");
	}
}

class Dog extends Animal{
	@Override
	void eat(){
		System.out.println("Dog eat");
	}
	void run(){
		System.out.println("Dog run");
	}
}
