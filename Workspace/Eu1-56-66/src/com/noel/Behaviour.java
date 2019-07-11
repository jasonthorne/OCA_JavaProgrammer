package com.noel;

public interface Behaviour {
	/*
	 * a default method HAS to have a body
	 * and can't have the static keyword
	 */
	default void eat(){
		System.out.println("Behaviour eat");
	}
	/*
	 * a static method HAS to have a body
	 * you can't override this, so if you
	 * create a static method with the
	 * same signature in the implementing class
	 * it will be a DIFFERENT method
	 */
	static void statMethod(){
		System.out.println("statMethod called");
	}
	/*
	 * a abstact method in a interface does not
	 * need to have the abstract keyword as it 
	 * is implicitly public abstract
	 */
	void drink();
			

}
