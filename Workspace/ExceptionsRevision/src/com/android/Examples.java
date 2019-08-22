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
		
		
		/*
		 * There are two broad types of Exception: Checked & Runtime (unchecked)
		 * Thowable is superclass of Exception
		 * Error & Exception are subclasses of Throwable
		 * You should NOT handle errors. Always something outside of coder's control (eg a hardware problem).
		 */
	}

}
