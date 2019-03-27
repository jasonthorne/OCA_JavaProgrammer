package com.gretb;

public class Main {

	public static void main(String[] args) {
	
		//I'm a comment
		
		/*
		 * I'm
		 * a 
		 * multiple line
		 * comment
		 */
		
		/**
		 * javadoc comment 
		 * can be used to produce documents automatically (javadocs)
		 */
		
		/*
		 * Ctrl + f11 to run
		 */
		
		System.out.println("Sup world!");
		System.out.println("I'm a second line of code");
		
		//when you dont use quotation marks around numbers, it treats them as numbers. 
		//Java knows the precedence of operators (multiple & division before addition and subtraction):
		
		System.out.println(3+2); //5
		System.out.println(2*12); //24
		System.out.println(2+30/2); //17 
		
		
		//this is a string:
		System.out.println("2*12");
		
		
		
		int num = 45;
		
		System.out.println(num);
		num = 12;
		System.out.println(num);
		
		
		//+++++++++++++++++++++++++++++++++++++++++++
		int x = 3;
		int a = 5;
		
		System.out.println("our number is: " + 45); //will print 45
		System.out.println("our number is: " + 12 + num); //will print 1212
		System.out.println("our number is: " + x + num + a); //will print 3125
		
		System.out.println("our numbers added in brackets: " + (num + x)); //will print 15
		
		
		//Variable: made of a 'data type' and a 'name':
		
		//Data types:
		
		int num1 = 2345; //int is from -2.4 billion to +2.4 billion (range of 8 billion)
		
		double dNum = 3.45; // plus or minus 256 WHOLE numbers
		double dNum2 = 5; //this is 5.0000 
		
		byte bNum = 23; // plus or minus 256 whole numbers
		
		short sNum = 4567; // plus or minus 64000 whole numbers
		
		float fNum2 = 3.45f; //'f' is needed as a cast, as the compiler recognises it as a double, so needs the cast at assignment as well as declaration. 
		
		long lNum = 5650; //plus or minus 9.2 0's and 17 0's
		
		char myChar = 'a';
		
		myChar=333;
		
		System.out.println(myChar);
		
		boolean myBool = true;
				
		//+++++++++++++++++++++++++++++++++++++++++++
		
		
		
		
		
		
		
				
	}

}
