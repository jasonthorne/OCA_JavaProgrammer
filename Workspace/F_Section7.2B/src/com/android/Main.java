package com.android;

public class Main {
/*
 * in these examples we are going to placing code that generates 
 * RuntimeExceptions inside try/catch blocks. However in real life, you
 * should never do this, as if youi are producing RuntimeExceptions it means
 * you have done something wrong and you can fix it
 * i.e arrayIndexOutOfBounds you are trying to access 5 item in an array
 * of 3 items
 */
	public static void main(String[] args) {
		Runtime runner=new Runtime();
		try {
			runner.run1();
		}
		catch(Exception e) {
			System.out.println("exception "+e+" is generated");
		}
		//
		/*
		 * run()2 works fine as all the exception handling is done inside
		 * the run2() method
		 */
		runner.run2();
		/*
		 * this will compile, as run3 only produces a RuntimeException 
		 * and we don't have to deal with a RuntimeException, however this
		 * will cause our program to crash
		 */
		//runner.run3();

	}

}
