package com.noel;

public class AX {
	/*
	 * this is an array of size 0
	 * so you CANNOT put any
	 * elements into this array
	 */
	static int[] x = new int[0];
	/*
	 * when an exception occurs in a
	 * static block it is wrapped in
	 * a ExceptionInInitializer Error.
	 * so an ArrayIndexOutOfBounds 
	 * exception is generated, but 
	 * it is inside a static block
	 * so an ExceptionInitialiser 
	 * error is thrown
	 */
	static{
		/*
		 * when we try to create a AX
		 * object it will exit the AX
		 * class at this point
		 */
		//x[0] = 10;
		}
	
	{
		/*
		 * this will throw a ArrayIndexOutOfBoundsException
		 */
		x[0]=10;
	}
	
	AX(){
		System.out.println("AX constructor called");
	}

}
