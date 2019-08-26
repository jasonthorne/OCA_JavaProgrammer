package com.android;

import java.io.File;
import java.io.FileWriter;

public class Examples {
	
	static void ex1() {
		
		
		try {
			System.out.println("no exception generated");
			System.out.println("when a try block generates an exception, the try block throws out that exception"
					+ "which can be caught by the catch block");
		}
		catch(Exception e) {
			System.out.println("this will catch any exception generated in the try block");
		}
		finally{
			File myFile = new File("c:/MyFile.txt");
			
			try {
				FileWriter fw = new FileWriter(myFile); //exception thrown in the finally +++++++++++
				
			}catch(Exception e) {
				System.out.println("catch in finally block");
			}
			
			/*
			 * when a finally throws an exception there are 2 ways of dealing wih it:
			 * 1st is to put a try/catch in the finally, 
			 * 2nd way is to have a throws in the method signature.
			 */
		}
		
		
	}
	
	
	//-----------------------------------------
	
	static String ex2() {
		
		try {
			System.out.println("inside try block");
			return "try block";
		}
		catch(Exception e) {
			System.out.println(e);
			return "catch block";
		}
		finally {
			return "finally block";
		}
		
		
		//return null; //unreachable code ++++++++++++++++
		
		
		/* WITH NO FINALLY BLOCK:
		 * If our code generates no exception, then this will return the string "try block",
		 *  If our code generates AN exception, then this will return the string "catch block".
		 *  The "return null" is therefore unreachable.
		 *  
		 *  WITH THE FINALLY BLOCK INCLUDED:
		 *   it will ALWAYS return "finally block".
		 */
		
	}
	
	
	//------------------------------
	
	static void ex3() {
		
		try {
			
			File myFile = new File("c:/MyFile.txt");
			myFile.createNewFile();
		}
		catch(Exception e) {
			System.out.println("exception is:" + e);
			try {
				File myFile = new File("MyFile.txt");
				myFile.createNewFile();
			}
			catch(Exception i) {
				System.out.println("exception is:" + i);
			}
			
		}
		finally {
			System.out.println("file successfully created");
		}
		
		
	}
	

}
