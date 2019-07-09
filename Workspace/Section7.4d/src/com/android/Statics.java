package com.android;

public class Statics {
	
	static{
		//static initialiser - only runs ONCE
		System.out.println("static initialiser - only runs ONCE and FIRST");
		
		//if an exception is created here, unless its handled in here (in a try catch), there's no way it can be dealt with.
		//CANT be thrown elsewhere.
		
		int[]myArray= {12,34,56};
		System.out.println(myArray[4]); //causes an indexOutOfBound exception, which causes a ExceptionInitializerError. 
		
		//+++++++++++ExceptionInitializerError is ONLY PRODUCED in a STATIC initializer by a RunTimeException.
		
	}
	
	static{
		//anything that can throw an exception in a static initialiser HAS to be put in a try/catch. Because you cant have a throws in a static initialiser ++++++++++++++++++++
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	{
		//initialiser
		System.out.println("initialiser always runs before constructor, but AFTER static initializers. Runs each time a statics object is created");
	}
	
	

	Statics(){
		System.out.println("Statics constructor called");
	}
}
