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
		
		//Casting the number 45 to be a long:
		myLong = (long)45;
		
		//doesnt work:
		//myLong = (long)200_000_000_000;
		
		//does work:
		myLong = 200_000_000_000l;
		
		
		
		myDouble = 45.99; 
		
		//if you cast a double to be an int, it simply chops off the decimal places:
		myInt = (int)myDouble; //chops off the .99 (DOESNT round up) ++++++++++++++++
		
		
		//You can cast a long to be of type int, however the results can be unpredictable. 
		//This happens if the long number is greater than the maximum or minimum allowable value for an int. 
		//Approx 2.1 billion.
		
		myLong = 2_000_000_000l;
		myInt = (int)myLong; //this is fine as long is within int range
		
		myLong = 200_000_000_000l;
		myInt = (int)myLong;
		
		//this looks nothing like the original number:
		System.out.println("myInt cast to number greater than 2.1 bilion: " + myInt);
		
		//Can't cast to or from a boolean to any other primitive data type.
		//myBool = (boolean)myInt; //doesn't work
		
		//assigning a number to a char:
		myChar = (char)myInt;
		
		myInt = myChar; //this works as a char fits inside an int.
		//myChar = myInt; //doesn't work as an int doesn't fit inside a char.
		
		//Characters can only be assigned a positive number. You CAN cast a minus number to it, but weird stuff happens!! 
	
		
	}
	
	
	static void ex2() {
	
		/*
		 * BINARY NUMBERS:
		 * 
		 * Binary numbers are numbers that only use the symbols 1 and 0.
		 * They begin with a '0b', they are displayed in decimal by default.
		 * If you use any number other than a 0 or 1 you'll get an error!
		 */
		
		System.out.println("BINARY:");
		int biNum = 0b100; //0b identifies it as binary
		System.out.println("0b100 in decimal is: " + biNum);
		biNum =0b1000110011;
		System.out.println("0b100 is now: " + biNum);
		
		int biNum2 = 0b1_000_110_011;
		System.out.println("2 binary numbers added are: " + (biNum+biNum2));
		
		//int errorBiNum = 0b10102; //gives error because of '2' (leading '0b' defines it as binary).
		
		
		/* OCTAL NUMBERS:
		 * 
		 * Octal numbers are base 8, go from 0-7. Displayed by default in decimal (base 10). 
		 * They begin with a '0'.
		 */
		System.out.println("\nOCTAL:");
		int octNum = 0100; //number 64
		System.out.println("octNum in decimal is: " + octNum);
		octNum = 076775430;
		System.out.println("octNum is now: " + octNum);
		
		
		/* HEXIDECIMAL NUMBERS:
		 * 
		 * Hex numbers begin wit '0x', and are also displayed in decimal by default.
		 * 10 will appear as 16, 100 (16*16) will appear as 256. 
		 * Numbers go from 1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
		 * f is 15. 
		 */
		
		
		System.out.println("\nHEXIDECIMAL:");
		int hexNum=0x10;
		System.out.println("hexNum is: " + hexNum);
		hexNum=0xabcdef9;
		System.out.println("hexNum is now: " + hexNum);
		
		
		
		

		
		
	}

}
