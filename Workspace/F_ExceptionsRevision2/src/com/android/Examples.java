package com.android;

import java.io.File;

public class Examples {
	/*
	 * this method does not deal with the Exception that may or may not
	 * be created in the throwExeption method. it throws it back to to hwere 
	 * the method ex1() is called, which will be in main. without "throws 
	 * Exception" in method signatures, our code WILL NOT COMPILE
	 */
	static void ex1() throws Exception{
		throwException();	
	}
	
	static void throwException() throws Exception{	
		System.out.println("throwException method");
		File myFile=new File("c:/Test4.txt");
		/*
		 * this code may or may produced a checked exception, so you  have to put
		 * it in a try/catch block or have a "throws Exception" in the method
		 * signature. It does not matter if a checked exception is produced or
		 * not you still have to use a try/catch or "throws exception"
		 * this does produce a checked exception as we can't create a file in
		 * the base C:\ drive
		 */
		myFile.createNewFile();
	}
	
	static void ex2()throws Exception {
		throwNoException();
	}
	/*
	 * it does  not matter that this method does not produced an exception, 
	 * anything that CAN produce an exception, has to be put in a try catch/
	 * block or has to have a "throws Exception" in the method signature
	 */
	static void throwNoException()throws Exception{
		System.out.println("throwNoException method");
		System.out.println("no Exception generated in this method");
	}

}
