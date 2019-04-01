package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		
		int[]numArray = {45, 83, 990, 78};
		
		for(int i=0;i<numArray.length;i++) {
			System.out.println("Number is: " + numArray[i]);
		}
		
		
		for(int j: numArray) {
			System.out.println("number in enhanced for is: " + j);
		}

	}

}
