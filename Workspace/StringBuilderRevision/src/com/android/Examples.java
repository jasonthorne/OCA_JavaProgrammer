package com.android;

public class Examples {
	
	public static void ex1() {
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder(50);
		
		//You cant assign a string to a StringBuilder or Vice versa:
		//String myStr=sb1; 
		//sb1 = "hello";
		
		String myStr = sb1.toString(); 
		sb1 = new StringBuilder(sb2); //You can create a StringBuilder from another StringBuilder 
		
		sb1 = new StringBuilder('a'); 
		Integer myInt = 44;
		sb1= new StringBuilder(myInt.toString());
		
		//--------------
		
		String nursery = "Mary had a little lamb"; 
		
		StringBuilder nurserySb = new StringBuilder(nursery); //sb holding same string as nursery
		
		System.out.println(nursery);
		nursery.substring(4, 15); 
		System.out.println(nursery);
		
		
		System.out.println(nurserySb.append(" so she had")); //wouldnt work with a normal string, as normal strings are IMMUTABLE
		System.out.println(nurserySb);
		
		//------------------
		
		sb1 = sb2;
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		String str1 = "orange";
		String str2 = "orange";
		
		System.out.println(sb1==sb2); //same reference due yo string pool
		System.out.println(sb1.equals(sb2)); //same values
		
		
		sb1 = new StringBuilder("apple");
		sb2 = new StringBuilder("apple");
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++
		/*
		 * StringBuilders are ALWAYS different. The equals method will always return false, so if we want to chek that two string
		 * contain the same "text" we have to use the toString() method of the StringBuilder class and call the equals method on that.
		 */
		
		//+++++++++++++++++++++++++++++++++++++++++++++++
		
	}

}
