package com.android;

public class Examples {
	
	
	/**
	 * Section 2.1: Declare and initialise variables including casting of primitive data types. 
	 */
	static void ex1() {
		
		//DATA TYPES:
		
		byte bNum = 3; //byte is the smallest variable data type -128 + 127
		
		short sNum = 35; // +- 32000 approx is allowed
		
		int iNum = 333; // +- 2.1 billion approx. (By default ALL whole numbers in java, unless specified, are ints. eg: bNum*sNum = int result)
		
		//produces an error because 20 billion is greater than 2.1 billion, and by default this number is an int, so we need to tell java that this is a long.
		//Same works for EVERY data type OVER 2.1 billion (eg a d for double)
		//long lNum1 = 20_000_000_000; //gives error
		long lNum2 = 20_000_000_000l; //right answer
		
		double dNum = 33.3; //doubles and floats are decimal points. 
		
		float fNum = 45.67f; //f is ALWAYS needed for floats
		
		char myChar1 = 'A';
		char myChar2 = 67; //keycode number (C)
		System.out.println("keycode is: " + myChar2);
		
		boolean myBool = true;
		
		//A string is NOT a primitive data type. A string is an array object of chars.++++++++++++++++++++++++
		
		//=====================================
		//re-allocation:
		
		byte myByte = 45;
		short myShort = 557;
		int myInt = 999;
		long myLong = 678;
		double myDouble = 56.78;
		float myFloat = 67.89f;
		char myChar = 'C';
		myBool = true;
		
		
		myInt = myByte; //this is allowed as a byte is smaller than an int
		myInt = myShort; //this is allowed as a short is smaller than an int
		
		//myInt = myLong; //doesn't work as a long is bigger than an int.
		myLong = myInt; //an int is smaller than a long, so you can assign an int to a long. 
				
		myDouble = myInt; //You can assign an int to a double, as an int is smaller than a double (whole numbers are by default ints).
		
		//Casting a double to a float: 
		myFloat = (float)7.89;
		
		//Casting a float to a double: 
		myDouble = (double)myFloat;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
