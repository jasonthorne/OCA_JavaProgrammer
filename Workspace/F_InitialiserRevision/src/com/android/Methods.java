package com.android;

public class Methods {
	/*
	 * static initialisers only run ONCE and run before non static initialiser
	 * if you do ANY action to a class, the static initialisers will run, if the 
	 * the class has not been run before
	 */
	static {
		System.out.println("static initialisers one has run");
	}
	/*
	 * non static initialiser run every time a Object of the Methods class is 
	 * created, so if we create two Methods Objects, this initialiser will run
	 * twice
	 */
	{
		System.out.println("non static initialiser one has run");
	}
	/*
	 * a static initialiser can access static variables, but it cannot directly
	 * access non static variables
	 */
	static int statCounter=0;
	int num;
	static {
		System.out.println("static initialiser two has run");
		statCounter++;
		//unable to access this variale
		//System.out.println(num);
	
	}
	/*
	 * a non static initailser can access both statics and non statics 
	 */
	{
		System.out.println("you can put any code you like inside an initialiser");
		System.out.println("access non statics "+ num++);
		System.out.println("access statics "+statCounter++);
	}
	
	Methods(){
		System.out.println("Methods object created");
	}
	
	static void callStatic() {
		System.out.println("call Static method called");
	}
	
	void myMethod() {
		System.out.println("mymethod called");
	}
	


}
