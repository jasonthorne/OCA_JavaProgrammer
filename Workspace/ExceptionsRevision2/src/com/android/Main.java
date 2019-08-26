package com.android;

public class Main {

	public static void main(String[] args) throws Exception { //+++++++++++ The throws can be here, as ex2() DOESNT actually produce an exception. (if it did, code would crash) +++++++++++++++++
		
		try {
			
			/*
			 * This may or may not produce a checked exception so it has yo be put in a try/catch 
			 * OR the method calling it has to have a "throws Exception" in the method signiature.
			 * This method calls a method that DOES produce a checked exception.
			 */
			
			Examples.ex1();
		}
		catch(Exception e){
			System.out.println("exception is: " + e);
		}
		
		//----------------------------------------
		
		
		/*
		 * This may or may not produce a checked exception so it has yo be put in a try/catch 
		 * OR the method calling it has to have a "throws Exception" in the method signiature.
		 * This method calls a method that DOESNT produce a checked exception.
		 */
		
		Examples.ex2(); 
		

	}

}
