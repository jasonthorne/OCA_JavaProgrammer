package com.android;
/*
 * every class that implements Behaviour2 interface has to override
 * the void joy() from the Behaviour interface and the void scared()
 * from behaviour2 interface
 * if a class implements Behaviour, the joy method is overriden and 
 * we can choose to override the agressive method in the Behaviour interface
 * if a class implements Behaviour2, the joy method is overriden, the
 * scared method is overriden and it will takes it's implementation for
 * the agressive method from Behaviour2 interface.
 * if you have a class that implements both Behaviour and Behaviour2 and
 * will take it's default void agressive() method from the sub interface
 * Behaviour2
 */
public interface Behaviour {
	void joy();
	
	default void agressive() {
		System.out.println("agressive in Behaviour interface");
	}

}

interface Behaviour2 extends Behaviour{
	void scared();
	
	default void agressive() {
		System.out.println("agressive in Behaviour2 interface");
	}
}
