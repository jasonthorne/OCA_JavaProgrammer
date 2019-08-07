package com.android;

public class Examples {
	/**
	 * section 2.1 Declare and initialise variables including casting of 
	 * primitive data type
	 */
	static void ex1() {
		//byte is the smallest primitive data type -128 +127
		byte bnum=3;
		//+- 32000 approx is allowed
		short snum=45;
		//+-2.1 billion approx
		//by default all whole numbers, unless specified, are ints
		int num=345000;
		//bnum*snum is going to be int
		System.out.println(bnum*snum);
		/*
		 * this will produce an error, because 21 billion is greater than
		 * 2.1 billion, and by default this number is an int, so we have
		 * to tell java that this number is actually a long.
		 * we do this by placing a upper or lowercase L at the end of the
		 * number
		 */
		//long lnum=20_000_000_000;
		/*
		 * if your whole number is greater than 2.1 billion, you have to
		 * make your number a long
		 */
		long lnum=200_000_000_000L;
		System.out.println("your long number is "+lnum);
		//goes to 16 decimal points
		//doubles and floats are decimal points
		double dnum=34.56;
		/*
		 * by default all numbers with a decimal point are doubles.
		 * so if you want to use the float data type, you have to place
		 * an f at the end of your number
		 */
		float fnum=45.67F;
		/*
		 * char is a character, you can assign a specific character to 
		 * a char by using the single quotes ', surrounding your 
		 * character. As each character, we type, corresponds to a ASCII
		 * key code (basicaly a each character corresponds to a number), you
		 * can also assign numbers to a char data type, which will produce
		 * the corresponding character
		 */
		char myChar='A';
		char myChar2=67;//Capital C
		System.out.println("character with ASCII code 67 is "+myChar2);
		/*
		 * boolean only allows true or false, and it is case sensitive so
		 * no upper case allowed
		 */
		boolean myBool=true;
		myBool=false;
		/*
		 * A String is NOT A PRIMITIVE DATA TYPE, a String is an array of
		 * chars and is an Object
		 */
		System.out.println("**things you can't do**");
		byte myByte=45;
		short myShort=557;
		int myInt=999;
		long myLong=678L;
		double myDouble=56.78;
		float myFloat=67.89F;
		myChar='C';
		myBool=true;
		//this is allowed as a byte is smaller than an int, and similar for 
		//shorts
		myInt=myByte;
		myInt=myShort;
		/*
		 * a long is bigger than an int, so you can't assign a long to an
		 * int
		 */
		//myInt=myLong;
		/*
		 * an int is smaller than a long, so you CAN assign an int to a 
		 * long reference
		 */
		myLong=myInt;
		/*
		 * you can assign an int to a double, as an int is smaller than
		 * a double (whole numbers in this case are by default ints)
		 */
		myDouble=45;
		myDouble=myInt;
		/*
		 * you cannot do this, as 34.5 by default is a double and a double
		 * is bigger than an int
		 */
		//myInt=34.5;
		/*
		 * by default all decimal points numbers are doubles, so we have to
		 * tell java that this number is a float
		 */
		myFloat=45.67F;
		/*
		 * alternatively we can can CAST
		 * casting is changing from one compatible data type to another
		 * compatible data type
		 * you cast by placing the data type you wish to change too in
		 * brackets before the data you want to cast
		 */
		myFloat=(float)7.89;
		/*
		 * you can assign a float to a double
		 */
		myDouble=myFloat;
		/*
		 * but you can't assign a double to a float
		 */
	//	myFloat=myDouble;
		//however they are both decimals so you can cast it
		myFloat=(float)myDouble;
		/*
		 * this is casting the number 45 to a be a long
		 */
		myLong=(long)45;
		//this does not work, does not compile
		//myLong=(long)200_000_000_000;
		//this does compile
		myLong=200_000_000_000L;
		
		myDouble=45.99;
		/*
		 * if you cast an double to a be an int, it simply chops off the
		 * decimal places, so 45.99 becomes 45
		 */
		myInt=(int)myDouble;
		//this will print 45
		System.out.println(myInt);
		/*
		 * you can cast a long to be of type int, however the results
		 * can be unpredictable, this happens if the long number is greater
		 * than the maximum or minimum allowable value for an int
		 * approx +-2.1 billion
		 */
		myLong=2_000_000_000L;
		myInt=(int)myLong;
		System.out.println("myInt is now "+myInt);
		myLong=200_000_000_000L;
		/*
		 * this number is unpredictable
		 */
		myInt=(int)myLong;
		/*
		 * this looks nothing like the original number
		 * this produces -1863462912
		 */
		System.out.println("myInt changed is "+myInt);
		/*
		 * can't cast to or from a boolean to any other primitive data type
		 * either of these will not compile
		 */
		//myBool=(boolean)myInt;
		//myInt=(int)myBool;
		/*
		 * make sure to use SINGLE QUOTATION MARKS with char
		 */
		myChar='a';
		/*
		 * we are assigning the number myInt to the myChar, which we need
		 * to cast to be of type char.
		 * an int wil not fit inside a char, so we have to cast it
		 */
		myChar=(char)myInt;
		/*
		 * this will work as a char only stores up to the number 64000 
		 * approx. So a char will fit inside an int
		 */
		myInt=myChar;
		/*
		 * characters can only be assigned a postive number, positive
		 * numbers in computer programming are referred to as unsigned ints
		 * so you can't assign a minus number (referred to as signed)
		 * to a character
		 */
		//myChar=-56;
		/*
		 * however you can force it to accept a minus number, you have
		 * to cast it to be of type char
		 * ASCII key codes are never a negative number
		 */
		myChar=(char)-120;
		System.out.println("wierd symbol is "+myChar);
			
	}
	
	static void ex2() {
		/*
		 * binary numbers
		 * binary nummbers are numbers that only use the symbols '1' and
		 * '0' to represent every number
		 * you can create binary numbers in java.
		 * binary numbers begin with a 0b, they are displayed by default
		 * in Decimal (100 in binary will display as 4)
		 * if you attempt to use any other numbers besides 1 or 0 in a binary
		 * you will get an error
		 */
		int biNum=0b100;//0b identifes this number as a binary
		//by default it displays in decimal
		System.out.println("0b100 in decimal is "+biNum);//will print 4
		int biNum2=0b1_000_110_011;
		System.out.println("biNum2 is now "+biNum2);
		System.out.println("two binaries addied is "+(biNum+biNum2));
		/*
		 * this results in an error as you can only have a 0 and 1
		 * in a binary
		 */
		//biNum2=0b1_000_110_012;
		//this is okay as biNum2 is a int, it's only the 0b that indentifes
		//a number as binary
		biNum2=89;
		
		System.out.println("***octal**");
		/*
		 * Octal numbers 
		 * octal numbers are base 8, go from 0 to 7 again displayed by
		 * default in decimal (base 10)
		 * 100 will be the number 64
		 * Octal numbers begin with a 0 zero
		 */
		int octNum=0100;//this is the number 64
		System.out.println("octNum is "+octNum);
		octNum=076775430;
		System.out.println("octNum is now "+octNum);
		/*
		 * Hexadecimal numbers begin with 0x, again displayed by default
		 * in Decimal, 10 will appear as 16, 100 (16*16) will appear
		 * 256, numbers go from 1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
		 * f is 15. Hex numbers begin with a 0 and an x
		 */
		int hexNum=0x10;
		System.out.println("0x10 is "+hexNum);
		hexNum=0xabcdef9;
		System.out.println("hexNum is now "+hexNum);
		/*
		 * this answer is going to be in decimal
		 */
		System.out.println(octNum+hexNum+biNum);
		
		int sum=octNum+hexNum+biNum;
		System.out.println("the string is "+sum);
		/*
		 * we will be displaying this number in binary format, 
		 * in octal format and in hex format
		 */
		System.out.println("in Binary");
		/*
		 * this overloaded toString method of the Integer, takes the 
		 * number and the base you want to display that number in
		 * i.e our  number is 20, want to display binary we would go
		 * Integer.toString(20,2)
		 */
		System.out.println(Integer.toString(sum, 2));
		System.out.println("in Octal");
		System.out.println(Integer.toString(sum,8));
		System.out.println("in hexadecimal");
		System.out.println(Integer.toString(sum,16));
		
		double dNum=4567890.3456;
		System.out.println("double printed out in hex");
		System.out.println(Double.toHexString(dNum));
		/*
		 * base can go as high as 36
		 */
		System.out.println(Integer.toString(sum,36));
		
		/*
		 * you can put underscores in variable number values to aid
		 * with reading of the numbers
		 */
		long bigNum=1_000_000_000_000L;
		/*
		 * can't put an underscore in the following positions
		 */
		//int wrongNum=_123;
		//int wrongNum=123_;
		//you can put an underscore in a double
		double wrongNum=1.234_456_789;
		//can't put an uderscore in the following positions in a double
		//wrongNum=1._45
		//wrongNum=1_.45
		/*
		 * you can put underscores in any type of number
		 * with octal you CAN place a underscore after the 0
		 */
		octNum=0_4_56;
		biNum=0b1_000_000_111;
		hexNum=0xa_fff_fff;
		/*
		 * you can't place the underscore after a suffix
		 * 0x_
		 * 0_
		 * 0b_
		 * this will not compile
		 */
		//hexNum=0x_567;
	//	bigNum=10000000000000_L;
		//float fnum=45.67_F;
		/*
		 * rules for underscores and numbers
		 * you can't start or end a number with an underscore
		 * you can't place an underscore right before prefixes
		 * for hex and binary and octal
		 * you can't place place an underscore right after for hex
		 * and binary, but YOU CAN FOR OCTAL, PREFIX FOR OCTAL IS 0
		 *you can't place an underscore before the L, the F and D suffix
		 *you can't place a underscore before or after a decimal point
		 */
		System.out.println("***Parsers****");
		/*
		 * these are words that contain numbers, THEY ARE NOT numbers
		 */
		String strNum="345";
		String strNum2="100";
		System.out.println(strNum+strNum2);
		
		int i=Integer.parseInt(strNum);
		i=Integer.parseInt("999");
		/*
		 * these are called parserts and they convert text to numbers
		 * or booleans. each numeric type and boolean has it's own 
		 * parser
		 * i.e int has pareseInt, double has parseDouble, etc
		 * there methods are static methods from the wrapper classes
		 * i.e Integer, Double
		 * the Character class does NOT have a parser
		 */
		double dNumber=Double.parseDouble("2.456");
		long lNumber=Long.parseLong("12000000");
		//the parser for boolean can only take true or false, not case sensitive
		boolean myBool=Boolean.parseBoolean("TrUe");
		//i and dNumber are now a int and a double, so we can add them
		System.out.println(i+dNumber);
		//you can't user underscores with parsers, or commas 
		//you will get a NumberFormatException
		/*
		 * parsers are used in GUI's, because the input by the user is in 
		 * Strings (put anything in a text box, it is, by default a string)
		 * so if we want to do any calculations with numbers, we have to convert
		 * the strings to numbers
		 */	
	}
	
	static void ex3(){
		System.out.println("this is section 2.2");
		System.out.println("Variable names");
		/*
		 * no limit to the size of the name of the variable
		 */
		int jlolikjolijkilojlkjlkjkljklj;
		//underscores can be used anywhere in a variable name
		int _myNu_mber_;
		/*
		 * the only non alpha numeric symbols you can use in a variable
		 * are currency symbols and  underscores
		 */
		int $£€num;
		/*
		 * you cannot use dashes
		 */
		//int dash-num;
		/*
		 * you can use numbers in a variable name, exceptt at the beginning
		 * of the name and a variable name can't be made up of just numbers
		 */
		int num1;
		//will not compile
		//int 1num;
		//String 456;
		//double special@;//will not compile only currency symbols allowed
		//double more#//will not compile only currencty symbols allowed
		/*
		 * you can't use java keywords for variables name
		 * see page 106 of mala gupta book for keywords
		 */
	//	String for;
	//	int while;
	//	String String;
		//you can have many underscores one after the other
		//int num=1__0011_1;
		
		/*
		 * you can define and intialise as many variables as you like of
		 * the same type on the same line
		 */
		int number=9,number2=12,number3=number;
		double dnum,dnum2,dnum3;
	}

}
