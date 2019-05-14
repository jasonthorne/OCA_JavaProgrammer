package com.android;

public class Examples {
	
	/*
	 * Why use wrappers?
	 * 
	 * A wrapper is an object version of a primitive variable. 
	 * This means that as it's an object, it has many methods it can use.
	 * A primitive variable has NO methods. ONLY objects have methods.
	 */
	
	static void createWrappers(){
		
		Integer myInt1 = 45;  //Integer object with lots of predefined methods. Every numeric wrapper is a subclass of Number, which is a subclass of Object.
		int num1=45; //a primitive var with NO methods (cant go num.).
		
		System.out.println(myInt1.intValue());
		 //invoking a method from the Int class. 
		
		//There are 4 ways of creating a wrapper object:
		
		//Method1:
		//Use the 'new' keyword and pass a number to the wrapper classe's constructor
		Integer myInt2 = new Integer(333);
		
		//Method2:
		//Use the 'new' keyword and pass a string (or var that contains a string) to the wrapper classe's constructor
		Integer myInt3a = new Integer("333");
		//OR:
		String myString = "333";
		Integer myInt3b = new Integer(myString);
		
		//Method3:
		//assign a literal value to a wrapper:
		Integer myInt4 = 33;
		
		//Method 4:
		//Using the static method 'valueOf' of the integer class
		//One method takes an int one takes a string. 
		Integer myInt5 = Integer.valueOf(3); 
		myInt5 =Integer.valueOf("3");
		
		
		
	}

}
