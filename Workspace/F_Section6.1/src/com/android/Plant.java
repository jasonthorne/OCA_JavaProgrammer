package com.android;
/*
 * you can't create an instance of an abstract class (you can't use
 * the new keyword with it, you use this as a reference)
 * you can have
 * Plant myPlant;
 * BUT YOU CAN'T HAVE
 * new Plant();
 */
public abstract class Plant {
	int height;
	String name;
	/*
	 * an abstract class does not have too have any abstract methods,but
	 * as soon as you have an abstract method in a class, the whole
	 * class becomes abstract.
	 * An abstract method CAN ONLY EXIST in an abstract class
	 * these are NOT abstract, so we do NOT HAVE TO OVERRIDE but
	 * you can
	 */
	void grow() {
		System.out.println("plant growing");
	}
	
	void shed() {
		System.out.println("plants shed seeds");
	}

}//end of plant class

abstract class Shrub extends Plant{
	/*
	 * abstract methods have no body, and all subclasses inherit
	 * this method and also the methods grow() and shed() from 
	 * class Plant
	 */
	abstract void pollinate();
}//end of Shrub class

abstract class Rose extends Shrub{
	abstract void sniff();
}

class EnglishRose extends Rose{
/*
 * A concrete class that extends an Abstract class HAS TO implement
 * any abstract methods that were in any of those abstract classes.
 * In our case the abstract method sniff from the Rose class
 * and the abstract method Pollinate from the Shrub class. we have to
 * OVERRIDE these methods, we can choose to override any non abstract
 * methods
 */
	@Override
	void sniff() {
		System.out.println("EnglishRose sniff");
		
	}

	@Override
	void pollinate() {
		System.out.println("EnglsihRose Pollinate");
		
	}
	
	void stiffUpperLip() {
		System.out.println("pip pip i say a rose old chap");
	}
	
}
