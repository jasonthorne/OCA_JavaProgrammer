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
		
		//LEARN CONVERSIONS!!! //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		/*+ binary to dec
		 *+ hex to dec
		 *+ oct to dec
		 */
		
	
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
		
		
		//DISPLAYING NUMBERS IN BINARY, HEX AND OCTAL
		
		System.out.println("\nDISPLAYING NUMBERS IN BINARY, HEX AND OCTAL:");
		//this answer is still in decimal:
		System.out.println("octNum + hexNum + biNum (in decimal): " + (octNum + hexNum + biNum));
		
		int sum = octNum+hexNum+biNum;
		
		//display in binary:
		System.out.println("In binary: " + Integer.toString(sum, 2)); //2 for base 2.
		System.out.println("In octal: " + Integer.toString(sum, 8)); //8 for base 8.
		System.out.println("In hex: " + Integer.toString(sum, 32)); //32 for base 32.
		
		//base can go as high as 36.
		
		//You CAN put underscores in variable number values to aid with reading:
		long bigNum=1_000_000_000_000l;
		//var wrongNum1=_123; //can't have underscore at start of number
		//var wrongNum2 = 123_; //can't have underscore at end of number
		double rightDouble=1.234_456_789;
		//wrongNum3=1._45 //can't have underscore directly after point
		//wrongNum4=1_.45 //can't have underscore directly before point
		
		//can put underscores in other number formats:
		octNum=04_56;
		biNum=1000_00_111;
		hexNum=0xa_fff_fff;
		
		//cant place underscores here:
		//hexNum=0x_a568; //cant place the underscore after the suffix (0x)
		//bigNum=100000000000_L;  //cant place the underscore before the L
		
		
		//RULES FOR UNDERSCORES AND NUMBERS
		/*
		+ You can't start or end a number with an underscore
		+ You can't place an underscore right before the prefixes for hex, octal or binary (0b, 0x, 0).
		+ You can't place an underscore right AFTER the prefixes for hex or binary (0b, 0x) but CAN for octal (0) +++++++++++++++++++++++++++
		+ you can't place an underscore before the L, F and D suffix.
		+ You can't place an underscore before or after a decimal point.
		+ You can have as many underscores beside each other, where valid.
		*/
		
		//REMEMBER: 
		//With octal you CAN place an underscore AFTER the 0 in an octal:
		octNum=0_456;
		
		
		//============================
		
		
		//PARSERS
		
		//used in GUIs because input by the user in text boxes are in strings
		
		System.out.println("\nPARSERS:");
		
		String strNum1 = "345";
		String strNum2 = "100";
		
		int i = Integer.parseInt(strNum1);
		
		System.out.println(i);
		
		double dNum = Double.parseDouble("3.33");
		long lNum = Long.parseLong("3333333333333333333");
		boolean bNum = Boolean.parseBoolean("trUe"); //NOT case sensitive
		System.out.println(bNum);
		
		System.out.println(i+ dNum); //these are now int and double, so can be added.
		
	}
	
	
	
	static void ex3() {
		System.out.println("This is Section 2.2 (Variable names)");
		
		//There's no limit to the size of the variable: 
		int fdfdfdfsdfdfdfdfdfqqqaaxxxssssddxcccccczzaaaqqeiihhhtyyyy;
		
		//underscores can be used anywhere in a variable name:
		int _myNu_mber;
		
		//The only NON aplphanumeric symbols you can use in a variable name are currency symbols and underscores:
		int $£num; 
		
		//int-num //cant be used
		
		//You can use numbers in a variable name EXCEPT at the beginning of the name, and the variable name can't be made up of JUST numbers: 
		int num1;
		//int 1num; //can't be used
		//int 123; //can't be used
		
		
		//double speacial@; //can't be used
		
		//You CANT use java keywords for variable names (see page 106 of mala gupta book for keywords):
		
		//String for; //can't be used
		//Int double; //can't be used
		
		
	} 

	
}
