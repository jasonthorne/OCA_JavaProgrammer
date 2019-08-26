package com.android;

import java.io.File;

public class Examples {
	
	static void ex1() throws Exception { //this method doesn't deal with the exception, it just throws it back to 
		
		throwException(); //must be in a try/catch if ex1 doesnt have a throws signature, as this method signature has a throws Exception
		
	}
	
	
	static void throwException() throws Exception{
		System.out.println("throw exception method:");
		
		File myFile = new File("c:/Test4.txt"); 
		myFile.createNewFile(); //this code MAY produce a checked exception, so must be in a try/catch OR have a THROWS exception in the method signature. (this does as you CANT create a file in the c drive).
		
	}
	
	
	static void ex2() throws Exception{
		
		throwNOException(); 
	}
	
	
	static void throwNOException() throws Exception{ //this needs to be handled in a try/catch as it's signature has a "throws Exception"
		System.out.println("throw NO exception method:");
		
		System.out.println("No exception is generated in this method");
	}

	
	
}
