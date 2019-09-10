package com.android;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Examples 
{
	public static void ex1() {
		System.out.println("Accessing Files");
		/*
		 * this is merely the location of the file we are dealing with
		 * this is NOT creating a file
		 * I have not provided any additional information about where to store this file, so
		 * it will be automatically stored, when created, in the src folder, in the 
		 * ExceptionsRevions folder
		 * When you are doing anything with an external file,   you have to put it in a 
		 * try/catch block. This is not doing anything with a file, its just a name, so this
		 * does NOT have to go in a try catch block
		 */
		File myFile=new File("C:/Test.txt");
		System.out.println(myFile.exists());
		/*
		 * this code may/could produce a checked exception (as you may not have access
		 * to a particular folder .ie c:\test.txt)
		 * if something can produce a checked exception it HAS TO be put in a try/catch
		 * block OR the method has to Throws Exception
		 */
	//	System.out.println(myFile.createNewFile());
		try {
			/*
			 * you cannot create this file as windows does not allow you to directly save
			 * a file on the C: drive, so this will throw an exception
			 */
			System.out.println(myFile.createNewFile());
			System.out.println("we are in the try block");
		}
		/*
		 * the exception is caught by this catch block and we attempt to create a second
		 * file in a folder we know we have access too, which is the ExceptionsRevision
		 * folder
		 */
		catch(Exception e) {
			System.out.println(e);
			System.out.println("we are in the Catch block");
			try {
				myFile=new File("Test2.txt");
				myFile.createNewFile();
				System.out.println("second file created ");
			}
			catch(Exception i) {
				System.out.println(i);
				System.out.println("second file was not created");
			}
		}
		/*
		 * this is our object we will use to write to our file, it has to be 
		 * declared outside of the try/catch block as we will be accessing it in the
		 * finally to close the connection. finally is outside the try block, so if
		 * we declared it inside the try block we would not be able to access it in 
		 * the finally block to close it
		 */
		FileWriter fs=null;
		//this just prints out the path of the file, myFile is "Test2.txt"
		//myFile is the location
		System.out.println(myFile.toString());
		try {
			/*
			 * A fileWriter is a object we use to write to a file, it takes a File object
			 * or the path of the file(which is the same thing)
			 */
			fs=new FileWriter(myFile);
			for(int i=0;i<=10;i++) {
				/*
				 * will overwrite whatever already is in the file
				 */
				fs.write("numbers is "+i);
			}		
		}
		catch(Exception e) {
			System.out.println("exception caught is "+e);
		}
		finally {
			/*
			 * if the fs FileWriter object was not give a value there is no need
			 * to close the connection to the file. The closing of the connection itself
			 * has to be put in a try catch block
			 */
			if(fs!=null) {
				try {
					System.out.println("written to file");
					System.out.println("file flushed");
					fs.flush();
					System.out.println("file closed");
					fs.close();
				}
				catch(Exception e) {
					System.out.println(e);
				}				
			}		
		}		
	}
	
	static void ex2()/*throws Exception*/ {
		/*
		 * a catch block HAS TO belong to a try
		 * a finally block HAS TO belong to a try
		 */
		try{
			int num=89;
		}
		catch(Exception e) {
			/*
			 * any variable created inside any of the block, is only accessibel inside
			 * of those blocks. the only thing that is shared between the try and the
			 * catch is an exception, if one is generated
			 */
			//System.out.println(num);
		}
		/*
		 * you can only have a try and a finally, however if the try block can throw
		 * a checked exception, then the method this is contained in, has to have a 
		 * "throws Exception" in the method, as we can see above
		 */
		try {
			//File myFile=new File("c:\test.txt");
			//myFile.createNewFile();
		}
		finally {
			
		}
	}
	
	static void ex3() {
		//File myFile=new File("Test3.txt");
		File myFile=new File("c:/Test4.txt");
		//myFile.createNewFile();
		try {
			/*
			 * if this line of code generates an exception, then any code after it in 
			 * the try block will not runt
			 */
			myFile.createNewFile();
			System.out.println("no exception generated in try block");
		}
		/*
		 * just having catch RuntimeException will not compile, because the try block
		 * COULD produced a checked exception, and if somethign COULD produce a checked
		 * exception you have deal with it. either by "catch(Exception e)" or
		 * the methood that contains the try/catch block has to have a "throws Exception"
		 */
		//catch(RuntimeException e) {
		catch(Exception e) {
			System.out.println("Exception "+e+" is caught");
		}
		finally {
			System.out.println("finally runs");
		}
		System.out.println("this code runs no matter what ");
		/*
		 * there are two broad types of Exception
		 * Checked and RuntimeException/unchecked
		 * Throwable is super class
		 * Error and Exception is sub class of Throwable
		 * YOU SHOULD NOT HANDLE ERROR's, always something outside coders control, i.e
		 * hardware problem
		 */
	}
	
	static void ex4() {
		System.out.println("runTimeExceptions ");
		int[]nums= {45,78,999};
		/*
		 * this code will compile as this only produces a RuntimeException, which we 
		 * do not have to put in a try catch block. in fact you should NOT deal with a
		 * runtime exception in try/catch as it is  usually something to do with an
		 * error in your, which you can fix
		 * this will generate a runtimeException and crash your application
		 */
		//System.out.println(nums[5]);
		try {
			/*
			 * arrayIndexOutOfBoundsException is generated by this 
			 */
		//	System.out.println(nums[5]);
			//indexOutOfBoundsException
		//	ArrayList<Integer>myList=new ArrayList<Integer>();
		//	System.out.println(myList.get(4));
			/*
			 * this will generate nullPointerException and be caught by the block that
			 * deals with RuntimeExceptions, all exceptions will try to find the 
			 * closest match
			 * exceptions in the wrong order will not compile
			 */
		/*	String nulStr=null;
			System.out.println(nulStr.length());*/
			File myFile=new File("c:/Test4.txt");
			myFile.createNewFile();
		}
		/*
		 * the order of the catch blocks is you have to have sub exceptions FIRST
		 */
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds catch block");
			System.out.println("exception is "+e.getClass().getSimpleName());
		}
		/*
		 * IndexOutOfBoundsException and ArithmeticException are at the same level
		 * so the order for these two does not matter, can swap positions
		 */
		catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBounds catch block");
			System.out.println("exception is "+e.getClass().getSimpleName());
		}
		catch(ArithmeticException e) {
			System.out.println();
		}
		catch(RuntimeException e) {
			System.out.println("RunTimeException catch block");
			System.out.println("exception is "+e.getClass().getSimpleName());	
		}
		catch(Exception e) {
			System.out.println("Exception catch block");
			System.out.println("exception is "+e.getClass().getSimpleName());
		}
		System.out.println("hello there");
	}
	
	
	static void ex5() {
		try {
			throwMe();
		}
		catch(Exception e) {
			System.out.println("exception is caught "+e);
		}
		try {
			throwMe2();
		}
		catch(Exception e) {
			System.out.println("second exception is caught");
		}
		//this method has to put in a try catch/block
		try {
			noThrow();
		}
		catch(Exception e) {
			System.out.println("no exception thrown");
		}
		
		throwRun();
		
	}
	
	static void throwMe()throws Exception{
		System.out.println("throwMe method");
		File myFile=new File("c:/Test4.txt");
		myFile.createNewFile();
	}
	
	static void throwMe2()throws Exception{
		System.out.println("throwme2 method");
		File myFile=new File("Test3.txt");
		myFile.createNewFile();
	}
	/*
	 * even though no exception is generated by this method, it COULD, and anything that
	 * COULD generate an checked exception, has to put in a try catch block
	 */
	static void noThrow()throws Exception{
		System.out.println("noThrow method called");
	}
	
	static void throwRun()throws RuntimeException{
		int[]numbers= {56,78};
		System.out.println(numbers[5]);
		
	}
	//try with resources
	/*
	 * this is not on java 1 but on java two, the try block has braces before the
	 * curly brackets 
	 * try(){
	 * }
	 * whatever connections we want to be closed are declared within the braces of the
	 * try block
	 */
	static void connect()throws IOException{
		File myFile=new File("Test.txt");
		//FileWriter fs=null;
		try(FileWriter fs=new FileWriter(myFile);
				FileReader fr=new FileReader(myFile)) {
			
		}
	}

}
