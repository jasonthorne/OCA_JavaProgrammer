package com.gretb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numArray= {45,83,990,78};
		//.length is the length of the array which is 4
		for(int i=0;i<numArray.length;i++) {
			System.out.println("number is "+numArray[i]);
		}
		
		/*
		 * Enhanced for loop
		 * in the background the loop knows the length of the array
		 * Also in the background it has a counter that increments by one
		 * automatically each time you loop.
		 * it assigns the variable 'a' to each int in the array
		 * first time in the loop a=numArray[0] which is 45
		 * second time in the loop a=numArray[1] which is 83
		 * Third time in the loop a=numArray[2] which is 990
		 * fourth time in the loop a=numArray[3] which is 78
		 * This is always the format of an enhanced for loop
		 * the variables on the left of the colon HAS TO BE THE SAME type
		 * as the data type in the array i.e an array of ints, needs an
		 * int, an array of doubles needs a double, an array of Strings
		 * needs a string
		 */
		for(int a:numArray) {
			System.out.println("number in enhance for is "+a);
		}
		/*
		 * an enhanced for loop is ONLY for displaying values, you can't
		 * change the values in an array with an enhanced for loop
		 */
		double[]dArray= {45.6,78.9,99.56,234.567,23.4};
		for(double d:dArray) {
			System.out.println("double number in ehance is "+d);
		}
		/*
		 * you can't use an enhanced for loop to change the values in
		 * an array 
		 */
		for(int i=0;i<numArray.length;i++) {
			numArray[i]=numArray[i]*2;
			System.out.println("numarray is now "+numArray[i]);
		}

	}

}
