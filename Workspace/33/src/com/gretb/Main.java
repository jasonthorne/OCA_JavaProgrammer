package com.gretb;

public class Main {
	
	public static void main (String [] args) {
		int[]numArray = {45, 67, 88, 99};
		
		for(int i:numArray) {
			System.out.println(i);
		}
		
		//this generates an index out of bounds exception as array length goes from 0 to 3, so this is out of bounds:
		//System.out.println("NumArray[4] is: " + numArray[4]);
		
		try {
			System.out.println("NumArray[4] is: " + numArray[4]);
			
		}catch(Exception e) {
			
			System.out.println("No dice, punk!");
			e.printStackTrace();
		}
		
		System.out.println("The road goes ever on...");
	} 

}
