package com.gretb;

public class Maths {
	/*
	 * this class just contains methods that print out different sorts of 
	 * arrays
	 */
	//this is a method that takes an array of ints and prints them out
	void printMe(int[]myArray) {
		for(int a:myArray) {
			System.out.println("int number is "+a);
		}
	}
	/*
	 * Overloaded printeMe method that that takes an array of doubles and
	 * prints them out
	 */
	void printMe(double[]myArray) {
		for(double d:myArray) {
			System.out.println("double number is "+d);
		}
	}
	/*
	 * overloaded printMe method that takes an array of Strings and prints 
	 * them out
	 */
	void printMe(String[]myArray) {
		for(String s:myArray) {
			System.out.println("String is "+s);
		}
	}

}
