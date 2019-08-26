package com.android;

import java.io.File;
import java.io.FileWriter;

public class Examples {
	
	public static void ex1() {
		
		System.out.println("Accessing Files");
		
		
		/*
		+ this is NOT creating a file. 
		+ No additional info about WHERE to store this file is given so it will be stored in the src folder
		+ When doing anything with an external file, you have to put it in a try/catch. Below isnt doing anything with a file, its just a name, so doesn't HAVE to go into a try/catch.
		*/
		
		File myFile = new File("c:\test.txt"); 
		File myFile2 = new File("test.txt"); 
		
		try {
		
			System.out.println(myFile.exists()); //returns boolean as to whether it exists
			System.out.println("in try block - trying to create file:");
			System.out.println(myFile.createNewFile()); //this code COULD produce a checked exception so needs to be in a try catch.
		}
		catch(Exception e) {
			System.out.println("in catch block");
			System.out.println(e);
			try {
				System.out.println(myFile2.createNewFile()); 
				System.out.println(myFile2.exists()); //returns boolean as to whether it exists
			}
			catch(Exception f) {
				System.out.println(e);
			}
		}
		
		
		FileWriter fw;
		
		//print out the path of the file:
		System.out.println(myFile.toString());
		try {
			//a fileWriter is an object we use to write to a file. It takes a file object or the path of the file (which is the same thing)
			fw = new FileWriter(myFile2);
			
			for(int i=0;i<10;i++) {
				
				//this will overwrite whatever is in the file:
				fw.write("number is: " + i + ". ");
			}
			
			
			fw.flush();
			fw.close();
		}
		catch(Exception e) {
			System.out.println("exception caught is: " + e);
			
		}
		finally {
			
			
		}
		
		
	}
	
	
	
	public static void ex2() /*throws Exception*/ {
		

		try {
			
		}
		catch(Exception e) {
			System.out.println("exception caught is: " + e);
			
		}

		/*
		 * You CAN have only a try and finally, but if the try causes an exception then it MUST be thrown by the method signature with a "throws Exception"
		 */
		try {
			//File myFile = new File("c:\test.txt");
			//myFile.createNewFile();
		}
		finally {
		
			
		}
	
		
	}
	
	
	
	
	public static void ex3() /*throws Exception*/ {
		
		File myFile = new File("c:/Test2.txt");
		
		try {
			
			/*
			 * If exception is generated here, then any code in the try block wont be run (System.out.println)
			 */
			myFile.createNewFile();
			System.out.println("no exception generated");
		}
		catch(Exception e) {
			System.out.println("No dice, punk! Exception caught is: " + e);
			
		}
		finally {
			System.out.println("finally is run");
		}
		
		
		System.out.println("this code runs no mattaer what");
		
		/*
		 * There are two broad types of Exception: Checked & Runtime (unchecked)
		 * Thowable is superclass of Exception
		 * Error & Exception are subclasses of Throwable
		 * You should NOT handle errors. Always something outside of coder's control (eg a hardware problem).
		 */
	}
	
	
	public static void ex4() /*throws Exception*/ {
	
		
		System.out.println("runtime exceptions");
		
		int[]nums = {45,78,999};
		
		//System.out.println(nums[5]); //this will compile as this causes a runtime exception, which doesnt need to be in a try block, as it sohuld be fixed in code.
		
		
		try {
			///System.out.println(nums[5]);
			
			String nullStr = null;
			System.out.println(nullStr.length()); //causes a null pointer exception
		}
		
		
		//SUBCLASSES FIRST, THEN SUPERCLASSES:
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getClass().getSimpleName());
			
		}
		
		catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException: " + e.getClass().getSimpleName());
			
		}
		
		
		catch(RuntimeException e) {
			System.out.println("RuntimeException: " + e.getClass().getSimpleName());
			
		}
		

		catch(Exception e) {
			System.out.println("Exception: " + e.getClass().getSimpleName());
			
		}
		
		
		finally {
			System.out.println("finally is run");
		}
		
		System.out.println("this code runs no mattaer what");
		
		
	}
	
	
	//++++++++++++++++++++++++++++++++++THROWS: +++++++++++++++++++++++++++++++++++++++++++++
	
	
	public static void ex5(){
		
		try {
			//throwMe1();
			throwMe2();
		}
		catch(Exception e) {
			System.out.println("Exception: " + e);
			
		}
		
		
		try {
			noThrow(); //is in try because method signature has "throws Exception"
		}
		catch(Exception e) {
			System.out.println("Exception: " + e);
			
		}
	}
		
	static void throwMe1() throws Exception{
		System.out.println("throwMe1 method");
		File myFile = new File("c:/Test2.txt");
		myFile.createNewFile();
	}
	
	
	static void throwMe2() throws Exception{
		System.out.println("throwMe2 method");
		File myFile = new File("Test3.txt");
		myFile.createNewFile();
	}
	
	
	static void noThrow() throws Exception{ 
		System.out.println("noThrow called"); //DOESNT throw but still needs to be in a try block because method signature is marked to throw (so it COULD).
	}
	
	

}
