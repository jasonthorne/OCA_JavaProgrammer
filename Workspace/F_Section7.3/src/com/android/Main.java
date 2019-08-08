package com.android;

import java.io.FileNotFoundException;

/**
 * Exam Objective 8.4 Create and invoke a method that throws an exception
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		Throws throwMe=new Throws();
		try {
			/*
			 * this method call generates a FileNotFoundException which
			 * is a checked exception and is a sub class of Exception
			 * so it HAS to be dealt with either in a try/catch block
			 * or having a "throws Exception" in the main method signature
			 */
			throwMe.readFile("myFile.txt");
		}
		/*
		 * this can catch ANY exception that may be generated in the 
		 * try block
		 */
		catch(Exception e) {
			System.out.println("Exception for readFile in main is "+e);
		}
		/*
		 * this will compile, but this generates a ArrayIndexOutOfBounds
		 * exception which is a RuntimeException which if not dealt with
		 * automatically is thrown out of whatever method is calling it.
		 * in this case main() is throwing the exception out to the
		 * compiler which causes our program to crash
		 */
		//throwMe.throwRuntime();
		
		try {
			throwMe.throwRuntime();
		}
		catch(Exception e) {
			System.out.println("exception is "+e);
		}
		
		throwMe.method1();//no error produced here
		throwMe.method2();//no runtimeException produced here
		try {
			/*
			 * this has a method signaute of void method3()throws Exception
			 * which means it has to be in a try/catch block or method
			 * calling calling it has to throws it
			 * this does NOT generate an exception so the catch block
			 * will not execute
			 */
			throwMe.method3();
			/*
			 * a Throwable object is a CHECKED EXCEPTION. this method 
			 * has the following method signature
			 * void method4()throws Throwable
			 * that means that whatever calls this method has to be either
			 * a try/catch block or the method calling it has to have a
			 * "throws Throwable"
			 */
			throwMe.method4();
			//this has "throws IOException" in method signature
			throwMe.method6();
			//this has "throws FileNotFoundException" in method signature
			throwMe.method7();
		}
		/*
		 * this can take care of Throwable and all sub classes of Throwable
		 * objects. this is the highest you can go, you can't go
		 * catch(Object t)
		 */
		catch(Throwable t) {
			System.out.println("catches throwable "+t);
		}
		//throwMe.method4();
		
		try {
			throwMe.method8();
		}
		catch(Exception e) {
			System.out.println("exception is "+e.toString());
			System.out.println("exception message is "+e.getMessage());
		}
		
		Throws2 throwy=new Throws2();
		throwy.trys();
		

	}

}
