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
	
	
	/*
	 * You can use the THIS keyword in an interface. But you can only use it inside a default method
	 */
	
	default void callThis() {
		System.out.println(this.finalInt);
		//OR:
		System.out.println(finalInt);
		
		this.happy();
		//OR:
		happy();
		
		this.angry();
		//OR:
		angry();
		
		
		this.angry();
		
		//this refers to the object calling this method, which will be eddie the employee:
		System.out.println(this);
		
		
		statMethod(); //you can call a static method inside an ordinary method.
	}
	
	
	

}
