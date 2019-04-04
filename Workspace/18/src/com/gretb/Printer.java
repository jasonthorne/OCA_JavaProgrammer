package com.gretb;

public class Printer {
	/*
	 * A method can take ANY datatype, be they objects or primitive type variables
	 */
	
	//this method takes an array of ints and prints them out
	void printAll(int[]myArray) {
		
		for(int i=0;i<myArray.length;i++) {
			System.out.println("number is: " + myArray[i]);
		}
		
	}
	
	int sumAll(int[]myArray) {
		int sum=0;
		for(int i=0;i<myArray.length;i++) {
			sum=sum+myArray[i];
		}
		
		return sum;
	}

}
