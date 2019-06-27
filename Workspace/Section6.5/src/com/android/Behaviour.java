package com.android;

public interface Behaviour {
	//can only access this by "Behaviour.finalInt" ++++++++++++++++++++++++++++
	int finalInt = 34;
	
	default void happy() {
		System.out.println("I am happy");
	}
	
	void sad();
	void angry();
	
	
	//can only be accessed by "Behaviour.statMethod" ++++++++++++++++++++++++++++
	static void statMethod() {
		System.out.println("statMethod called");
	}
	
	

}
