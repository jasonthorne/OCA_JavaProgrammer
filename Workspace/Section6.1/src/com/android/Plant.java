package com.android;

public abstract class Plant { //you cant create an instance of an abstract class (can't use the NEW keyword)

	/*
	 * An abstract class doesnt have to have abstract methods, byt as soon method in a class, the whole class becomes abstract.
	 * An abstract method can ONLY exist in an abstract class.
	 */
	
	void grow() {
		System.out.println("plant growing");
	}
	
	void shed() {
		System.out.println("plant sheds leaves");
	}
}


abstract class Shrub extends Plant{
	
	/*
	 * abstract methods have no body, and all subclasses inherit this method
	 * and also methods grow() & shed() from class Plant.
	 */
	abstract void pollinate();
}

abstract class Rose extends Shrub{
	abstract void sniff();
}

//A concrete class that extends an abstract class HAS to implement any abstract methods that were in ANY of those abstract classes it inherits from.
class EnglishRose extends Rose{

	@Override
	void sniff() {
		System.out.println("EnglishRose sniff");
		
	}

	@Override
	void pollinate() {
		System.out.println("EnglishRose pollinate");
		
	}
	
	void englishRoseMethod() {
		System.out.println("EnglishRose method");
	}
	
	
	
	
}