package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
		int[]numArray = {45, 83, 990, 78};
		
		for(int i=0;i<numArray.length;i++) {
			System.out.println("Number is: " + numArray[i]);
		}
		
		
		/*enhanced for loop:
		 * In the background the loops knows the length of the array.
		 * Also, in the background it has a counter that increments by one automatically each time you loop.
		 * It assigns the var 'a' to each int in the array.
		 * First time in the loop: a=numArray[0] which is 45.
		 * 2nd time in the loop: a=numArray[1] which is 83.
		 * 3rd time in the loop: a=numArray[2] which is 990.
		 * 4th time in the loop; a=numArray[3] which is 78.
		 * This is always the format of an enhanced for loop.
		 * The variables on the left of the colon HAS TO BE THE SAME type as the data type in the array. 
		 * IE an array of ints needs an int, an arrray of doubles needs a double, an arrtay of strings needs a string. 
		*/
		
		for(int j: numArray) {
			System.out.println("number in enhanced for is: " + j);
		}
		
		
		double []dArray = {45.6, 67.9, 34.2, 78.5};
		for(double d: dArray) {
			System.out.println("Double number in enhanced for is: " + d);
		}
		
		
		/*
		 * You CANT use an enhanced for loop to change the values in an array. They're ONLY for displaying values!
		 */
		for(int i=0;i<numArray.length;i++) {
			numArray[i]=numArray[i]*2;
		}
		
	}

}
