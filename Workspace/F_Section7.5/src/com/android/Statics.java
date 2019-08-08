package com.android;

public class Statics {
	/*
	 * this runs only once and first
	 * if a static initialiser produces an ExceptionInitializerError you
	 * will not be able to create a object of the statics class
	 */
	static
	{
		/*
		 * this produces an ArrayIndexOutOfBoundsException, but it is in
		 * a static initialiser so it will produce a 
		 * ExceptionInitializerError
		 * this Error is ONLY PRODUCED IN A static initializer by a 
		 * RuntimeException
		 */
	//	int[]myArray= {12,34,56};
	//	System.out.println(myArray[4]);
		System.out.println("statics run just once");
	}
	/*
	 * if you have code that COULD produce a checked exception in a static
	 * initializer then you HAVE to put this code inside a try/catch or
	 * it will not compile
	 */
	static{
		//this try catch block takes care of the exception
		try {
			throw new Exception();
		}
		catch(Exception e) {
			
		}
		
	}
	/*
	 * this runs each time a statics object is created and runs AFTER 
	 * any static initialser, but before any constructor
	 */
	{
		System.out.println("inialiser always runs before constructor");
		System.out.println("runs each time a statics objects is created");
	}
	/*
	 * the constructor is run last
	 */
	Statics(){
		System.out.println("statics constructor called");
	}

}
