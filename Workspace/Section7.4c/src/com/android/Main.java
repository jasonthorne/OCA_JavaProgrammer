package com.android;

public class Main {
	
	/**
	 * 
	 * Open in this order: 
	 * 
	 * Main
	 * Animal
	 * Person
	 * Vehicle
	 * 
	 * This lesson is about when overriding methods and construtors THROWS an exception.
	 * 
	 * A class DOES NOT have a "throws Exception", a class EXTENDS exception.
	 * Overloaded methods that throw an exception, there is no relationship between overloaded mwethods
	 * ie: void eat(int num) throws Exception
	 *  void eat(string name) throws Throwable
	 *  both of the above methods are different methods that just happen to have the same name.
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("see Animal class for overriding methods with a throws exception clause");
		
		
		
		try {
			Midwife mary = new Midwife();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
