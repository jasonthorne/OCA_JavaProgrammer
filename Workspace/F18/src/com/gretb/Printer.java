package com.gretb;

public class Printer {
	/*
	 * a method can take ANY datatype, be they objects or primitive 
	 * type variables
	 */
	//this method takes an array of ints and prints them out
	void printAll(int[]myArray) {
		for(int i=0;i<myArray.length;i++) {
			System.out.println("number is "+myArray[i]);
		}
	}//end of printAll() method
	
	void eat() {
		
	}
	
	int sumAll(int[]myArray) {
		//this will be the sum of all numbers in the array
		int sum=0;
		
		for(int i=0;i<myArray.length;i++) {
			sum=sum+myArray[i];
			//this is exactly the same as above
			//sum+=myArray[i];
		}//end of loop
		
		return sum;
	}//end of sumAll()method
	//this method does not return anything
	void noReturn() {
		System.out.println("this method returns nothing");
	}
	
	
	

}
