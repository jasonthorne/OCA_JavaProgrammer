package com.android;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Throws2 {
	
	static void trys() {
		
		try {
			System.out.println("first try");
		}
		catch(Exception e) {
			System.out.println("first catch");
		}
		
		try {
			System.out.println("try catch no error");
		}
		catch(Error e) {
			System.out.println("second catch");
		}
		
		try {
			System.out.println("try block on runtime");
		}
		catch(RuntimeException r) {
			System.out.println("third catch");
		}
		
		try {
			System.out.println("try block on nullPointer ");
		}
		catch(NullPointerException n) {
			System.out.println("fourth catch");
		}
		
		try {
			System.out.println("try block on Throwable");
		}
		catch(Throwable t) {
			System.out.println("fifth catch");
		}
		/*
		 * a try block can define a catch block for runtime exceptions 
		 * that are not thrown or cannot be created in the try block
		 * i.e
		 * try(){
		 * }
		 * catch(RuntimeException r){
		 * catch(Exception e)
		 * catch(throwable t)
		 * catch(Error er)
		 * catch(all subclasses of RuntimeException
		 */
		try {
			System.out.println("try block with IOException");
			/*
			 * this may or may not produce a checked exception, what is
			 * important is that it MAY produce a IOException. this code
			 * will not run unless the code in the try block is capable
			 * of producing a IOException.
			 * As when we catch a particular named checked Exception, as
			 * we have done here, the code in the try block HAS to be 
			 * capeable of producing the exception type mentioned in the 
			 * catch
			 * this code here has to be capable of producing an 
			 * IOException
			 */
			FileInputStream fis=new FileInputStream("myFile.txt");
		}
		catch(IOException i) {
			System.out.println("exception is i");
		}
	}
	
	
	
/*	static void method1() {
		try{
	//	throw new FileNotFoundException();
	}
	catch(FileNotFoundException f) {
		
	}
	}*/
	
	

}
