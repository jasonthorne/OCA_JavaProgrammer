package com.android;

public class Employee {
	int age=42;
	String name;
	static int companyId;
	/*
	 * an initiialiser is a block of code that always runs BEFORE
	 * a constructor.
	 * if you have more than one initialiser then they run the order
	 * they are in the file
	 */
	{
		System.out.println("first initialiser block");
	}
	/*
	 * static initialisers always come first in a file, but
	 * only come once per programming session
	 * you can only access statics inside a static initialiser
	 */
	static {
		companyId=3459;
		System.out.println("static initialiser called");
	}
	
	Employee(){
		System.out.println("Employee constructor called");
	}
	
	{
		System.out.println("second initialiser block");
	}

}
