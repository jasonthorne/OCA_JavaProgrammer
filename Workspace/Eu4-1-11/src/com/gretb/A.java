package com.gretb;

public class A {
	/*
	 * you cannot change a final variable
	 */
	final int fi = 10;
	
	void myMethod(){
		System.out.println("A class");
	}
}
class B extends A{
	/*
	 * B class fi "SHADOWS" the final int fi in 
	 * the A class, which you can do.
	 */
	int fi = 15;
	@Override
	void myMethod(){
		System.out.println("B class");
	}
	}
