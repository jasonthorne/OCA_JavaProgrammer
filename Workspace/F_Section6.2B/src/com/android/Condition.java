package com.android;
/*
 * as already said a class can implement multiple interfaces, all the
 * interfaces on this page, have a abstract method void hungry(). A class
 * can implement ALL of the interfaces on this page, and this will NOT
 * cause any conflict as hungry() is a abstract method and any class
 * implementing any of these interfaces HAS TO OVERRIDE the hungry()
 * method
 */
public interface Condition {
	void hungry();
	void heat();
	default void pickMe() {
		System.out.println("condition pickMe");
	}

}

interface Condition2{
	void thirsty();
	void hungry();
	default void pickMe() {
		System.out.println("condition 2 pickMe");
	}
}
/*
 * An interface can extend multiple interfaces, unlike a class where
 * multiple extends are not allowed (multiple inheritance is not allowed
 */
interface Condition3 extends Condition,Condition2{
	/*
	 * this interface extends both Condition and Condition2 and these
	 * interfaces both have a default void pickMe()
	 * Condition and Condition2 are not related to each other, however this
	 * interface extends both Condition and Condition2, so it does not
	 * know which default void pickMe() to choose, so we HAVE TO override
	 * default void pickMe(){}
	 */
	void hungry();
	void sleep();
	void heat();

	@Override
	default void pickMe() {
		System.out.println("PickMe method in the Condition3 interface");
		// TODO Auto-generated method stub
	//	Condition.super.pickMe();
	}
	
}
