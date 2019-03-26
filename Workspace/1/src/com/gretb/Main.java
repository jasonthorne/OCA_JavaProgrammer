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
		
		
		//Variable: made of a 'data type' and a 'name':
		int num = 2345; //int is from -4 billion to +4 billion (range of 8 billion)
		
		System.out.println(num);
		num = 12;
		System.out.println(num);
				
	}

}
