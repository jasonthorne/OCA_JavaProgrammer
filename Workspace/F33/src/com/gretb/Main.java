package com.gretb;

public class Main {

	public static void main(String[] args) {
		int[]numArray= {45,67,88,99};//creating an array of size 4
		for(int i:numArray)//looping through our array
			System.out.println(i);
		/*
		 * this generates an ArrayIndexOutOfBoundsException as
		 * array numbering starts at 0, so an array of length 4 goes
		 * from 0 to 3, so this is out of bounds
		 */
		//System.out.println("numArray[4] is "+numArray[4]);
		
		try {
			/*
			 * if this line produces an exception, an exception is 
			 * generated and thrown, that will be caught by the 
			 * catch block and the code within the catch block will run
			 * . if no exception is created then the 
			 * catch block will not be run
			 */
			System.out.println("numArray[] is "+numArray[4]);
			//trying to access fifth item on the list
			/*
			 * but this list only has four items, so a ArrayIndexOutOfBoundSExcpetion
			 * will be generated
			 */
		}
		catch(Exception e) {
			/*
			 * if any exception is generated in the try block this catches
			 * that exception, and gives it a name, "e". all we do in the 
			 * catch block is print out the exception and our code will
			 * continue after the catch block
			 */
			System.out.println("the exception is "+e);
		}
		System.out.println("your program continues on as normal");

	}

}
