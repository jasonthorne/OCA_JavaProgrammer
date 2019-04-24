package com.gretb;

public class Animal {
	
	//************ INITIALISERS ************
	
	int age;
	String name;
	
	static int count;
	
	/*
	 * Statics first
	 * THEN non statics (initialisers)
	 * then constructors
	 */
	
	//Initialiser Called BEFORE constructor(s):
	{
		age=23;
		name="Andy";
		System.out.println("Animal Initialiser called");
	}
	
	static {
		System.out.println("Static. This only runs ONCE (during initial class creation)");
	}
	
	
	Animal(){
		System.out.println("Animal constructor called");	
	}
	
	
	{
		System.out.println("Second Initialiser called");
	}
	
	

}
