package com.android;

import java.io.File;
import java.io.FileWriter;

public class Examples {
	static void ex1()/* throws Exception*/{
		try {
			System.out.println("no exception generated");
			System.out.println(" when a try block generates an exception, the"
					+ " the try block throws out that exception, which can be"
					+ " caught by the catch block ");
		}
		catch(Exception e) {
			System.out.println("this will catch any exception generated in the "
					+ " try block");	
		}
		/*
		 * when a finally throws an exception, there are two ways of dealing with
		 * it. first way is to put in a try/catch block in your finally
		 * second way is to have a "throws exception" in the method signature
		 */
		finally {
			try {
				File myFile=new File("c:/myFile.txt");
				FileWriter fw=new FileWriter(myFile);
				fw.close();
			}
			catch(Exception e) {
				System.out.println(e+" is caught");
				System.out.println("we are inside the finally block");
			}
			
		}
	}
	
	static String ex2() {
		/*
		 * if our code generates no exception, then will return the string
		 * "try block"
		 * if our code generates an exception, then will return the string
		 * "catch block"
		 * it cannot reach the code that says "return null"
		 */
		try {
			System.out.println("inside try block");
			int num[]= {56};
			System.out.println("num is "+num[2]);
			return "try block";
		}
		catch(Exception e) {
			System.out.println(e);
			return "catch block";
		}/*
		if you have a return statement in a finally, this will always be 
		teh value that is returned
		*/
		/*
		finally {
			return "finally block";
		}*/
		//this is unreachable code and will not compile
	//	return null;
	}
	
	static void ex3() {
		try {
			File myFile=new File("c:/myFile.txt");
			myFile.createNewFile();
		}
		catch(Exception e) {
			System.out.println(e);
			try {
				File myFile=new File("test.txt");
				myFile.createNewFile();
			}
			catch(Exception i) {
				System.out.println(i);			}
		}
		finally {
			System.out.println("file sucessfully created");
		}
	}

}
