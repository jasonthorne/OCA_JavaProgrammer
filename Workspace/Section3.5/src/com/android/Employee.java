package com.android;

public class Employee {
	
	int age=42;
	String name;
	static int companyId;
	
	/*
	 * INITIALISER: A block of code that ALWAYS runs before any constructor.
	 * If you have more than 1 initializer, they run in the ORDER they are in the file. 
	 */

	{
		System.out.println("First initialiser block");
	}
	
	/*
	 * STATIC INITIALISER - for giving an initial value to statics.  +++++++++++++++++++++++++++++
	 *  always RUN FIRST (in the ORDER they are in the file).
	 *  ONLY even run ONCE!! (as they don't need to be again, due to each subsequent object sharing their values).
	 */
	
	
	static {
		companyId = 333;
		System.out.println("\nStatic initialiser block"); 
	}
	
	Employee(){
		System.out.println("Employee constructor called");
	}
	
	
	{
		System.out.println("Second initialiser block");
	}

}
