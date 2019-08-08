package com.android;

import java.io.FileInputStream;

public class Runtime {
	/*
	 * this will generate ArrayIndexOutOfBoundsException which is a 
	 * RuntimeException, so WE DO NOT have to deal with it and the compiler
	 * does not pick it up, however if you leave as is and call this method
	 * it will crash your program.
	 */
	void run1() {
		int[]numList= {56,78,99};
		System.out.println(numList[5]);
	}
	
	void run2() {
		try {
			int[]numList= {56,78,99};
			System.out.println(numList[5]);
		}
		catch(Exception e) {
			System.out.println("exception is caught");
			System.out.println("exception is "+e);
		}
	}
	/*
	 * the throws RuntimeException is optional, if its a checked exception
	 * then YOU HAVE TO PUT IN A THROWS in order for it compile or a 
	 * try/catch block
	 */
	void run3()throws RuntimeException{
		int[]numList= {56,78,99};
		System.out.println(numList[5]);
		/*
		 * if we put in this line of code, this will not compile, as 
		 * run3() throws RuntimeException, which means it can only deal
		 * with RuntimeException or subclasses of RuntimeExceptions 
		 * (ArrayIndexOutOfBounds, ClasscastException, etc)
		 * this is a checked exception, which is NOT A subclass of 
		 * RuntimeException
		 */
	//	FileInputStream fis=new FileInputStream("myFile.txt");
	}

}
