package com.android;

public interface Behaviour {
	//all variables in a interface are public static and final
	int finalInt=34;
	/*
	 * a class implmenting this interface can decide to override this 
	 * method or not, IT DOES NOT HAVE TOO
	 */
	default public void happy() {
		System.out.println("I am happy");
	}
	//These are abstract, implementing class HAS TO OVERRIDE THESE
	void sad();
	void angry();
	/*
	 * You can only call a static method in a Interface by
	 * the name of interface followed by the name of the static method
	 * i.e
	 * in this case we can only call this method by
	 * Behaviour.statMethod()
	 */
	static void statMethod() {
		System.out.println("statMethod called");
		/*
		 * you can't use the "this" keyword insdie a static method
		 * so you can't call a non static method from inside a static
		 * method
		 */
	//	sad();
	//	this.sad();
	}
	/*
	 * you can use the "this" keyword in an interface, but you CAN
	 * ONLY USE IT inside a default method
	 */
	default void callThis() {
		System.out.println(this.finalInt);
		System.out.println(finalInt);
		//both exact same
		this.happy();
		happy();
		//can call other abstract method
		/*
		 * Accountant will implement Behaviour, which means it will
		 * then have to implement sad() and angry() and then it will
		 * be the Accountants's sad() and angry() method that will be 
		 * called here
		 */
		sad();
		this.angry();
		//"this" refers to the object calling this method, which
		//will be andy the Accountant
		System.out.println(this);
		//can also call static methods inside ordinary
		statMethod();
		
	}
	
	
	
	

}
