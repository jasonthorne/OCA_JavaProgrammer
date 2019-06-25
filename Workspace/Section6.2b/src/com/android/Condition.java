package com.android;

/*
 * A class can implement multiple interfaces. All the interface on this page have an abstract void hungry(). 
 * A class can implement ALL of the interfaces on this page, & this will not cause any conflict as hungry() is an abstract method,
 * and aANY class implementing any of these interfaces HAS TO override the hungry method().
 */

public interface Condition {
	
	void hungry();
	void heat();
	
	default void pickMe() {
		System.out.println("Condition");
	}
}

interface Condition2 {
	void hungry();
	void thirsty();
	
	default void pickMe() {
		System.out.println("Condition2");
	}
}

/*
 * An interface can extend multiple interfaces unlike a class where multiple extends are not allowed.
 */

interface Condition3 extends Condition, Condition2 {
	
	void hungry();
	void heat();
	void sleep();
	
	/*This interface extends both Condition & Condition2
	 * and these interfaces both have a default void pickMe()
	 * Condition & Condition2 are not related to eachother, 
	 * however this interface extends both Condition & Condition2, so it does not know 
	 * which default void pickMe() to choose, so we HAVE TO override default void pickme().
	*/
	
	@Override
	default void pickMe() {
		// TODO Auto-generated method stub
		Condition.super.pickMe();
	}

}

