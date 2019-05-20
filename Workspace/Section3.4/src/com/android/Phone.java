package com.android;

public class Phone {
	
	/*
	 * this method can take ANY object, which means it can also take any subclass of object. The object class is the superclass of EVERY other class that will ever be created. 
	 */
	void talk(Object obj) {
		
	}
	
	//A method that takes an array of ints
	void dial(int[]numbers) {
		System.out.println("dial method that takes an array of ints");
	}
	
	//this WONT work as ...nums puts all your numbers into an array. So this method signiature is exactly the same as the one above.
	/*
	 void dial(int...nums) {
		
	}
	*/
	
	//a method that can take a double or any SMALLER numeric data type. 
	void dial(double dNum){
		System.out.println("dial method that takes a double");
	}
	
	//====
	void call(int num, double dNum){
		System.out.println("call method that takes an int & double");
	}
	
	void call(double dNum, int num){
		System.out.println("call method that takes a double & int");
	}
	//====
	
	
	
	
	
	
	
	
	
	
	

}
