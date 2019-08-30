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
	
	
	
	static int statCounter = 0;
	int num = 12;
	static {
		System.out.println("static initialiser2 has run.");
		statCounter++; //a static initialiser can access static variables but it CANT directly access NON static variables +++++++++++++++++++++++++
		//System.out.println(num); //doesnt work, as NON static, so unable to access.
	}
	
	
	
	{
		System.out.println("you can put any code you like inside an initialiser");
		//NON static initialisers can access bboth static and NON static vars: +++++++++++++++++++++++++++++
		System.out.println("accessing static: " + statCounter);
		System.out.println("accessing NON static: " + num);
	}
	
	
	static void callStatic() {
		System.out.println("'callStatic' method called");
	}
	
	
	void myMethod() {
		System.out.println("myMethod called");
	}
	
	
	//Constructors are run AFTER all initialisers:
	Methods(){
		System.out.println("constructor");
	}

	
}
