package com.android;


//Every class that implements Behaviour2 interface HAS TO override void joy() from the Behaviour interface, & the void scared() from Behaviour 2.

/*
 * If a class implements Behaviour, the joy method is overriden, and we can CHOOSe to override the aggressive method in the Behaviour interface.
 * If a class implements the Behaviour2 interface, the joy method is overriden, the scared method is overriden 
 * & it will take it's implementation for it's aggressive method from the Behaviour2 interface.
 * 
 * 
 * If ypou have a class that implements both Behaviour and Behaviour2, it will take it's default void aggressive method from the Behaviour 2 interface.
 */
public interface Behaviour {
	void joy(); //abstract method
	
	default void agressive() {
		System.out.println("aggressive in Behaviour interface");
	}
}

interface Behaviour2 extends Behaviour{
	void scared(); //abstract method
	
	default void agressive() {
		System.out.println("aggressive in Behaviour2 interface");
	}
}

