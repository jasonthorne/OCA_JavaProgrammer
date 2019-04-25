package com.gretb;

public class Maths {
	/*
	 * our two static methods. As these are CLASS methods you don't 
	 * have to create an object of the class to access them
	 */
	public static void add(int num,int num2) {
		int sum=num+num2;
		System.out.println("sum is "+sum);
	}
	
	public static void multiply(int num,int num2) {
		int sum=num*num2;
		System.out.println("numbers multipled is "+sum);
	}

}
