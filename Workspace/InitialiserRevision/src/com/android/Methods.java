package com.android;

public class Methods {
	
	//initialisers:
	
	/*static initialisers:
	 * only run ONCE & run before non static initialisers.
	 * if you do ANY action to a class, the static initialiser will run IF the class has not been run before.
	 */
	static {
		System.out.println("static initialiser1 has run.");
		
	}
	
	
	
	/*
	 * NON static initialiser:
	 * run everytime an Object is created. So if we create 2 objects for example, then this will run twice.
	 */
	{
		System.out.println("NON static initialiser1 has run.");
	}
	
	
	static {
		System.out.println("static initialiser2 has run.");
	}
	
	
	static void callStatic() {
		System.out.println("'callStatic' method called");
	}
	
	
	void myMethod() {
		System.out.println("myMethod called");
	}

	
}
