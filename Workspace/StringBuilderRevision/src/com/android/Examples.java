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
	
	
	static void ex2() {
		
		System.out.println("methods of the StringBuilder class");
		
		//APPEND - adding onto a StringBuilder obj (permanently, unlike concat)
		
		System.out.println("Append:");
		StringBuilder fruit = new StringBuilder("Apple");
		System.out.println(fruit.append("tree"));
		
		System.out.println(fruit);
		
		Dog spot = new Dog();
		fruit.append(spot); //appending an object, appends the toString method of that class. ++++++++++++++++++++++++++
		System.out.println(fruit);
		
		fruit.append(12);
		System.out.println(fruit);
		
		//you CAN use the concat symbol with a stringbuilder and a string
		
		//concat doesnt work with 2 stringbuilders:
		//System.out.println(fruit + fruit); //doesnt work
		
		//but DOES work with 1 stringbuilder and a string:
		System.out.println(fruit + " hello"); //does work
		
		//----------------------
		
		
	}
	
	
	
	static void ex3() {
		
		//INSERT - only available to StringBuilder - DOES CHANGE the value of the StringBuiklder object
		
		/*
		 * Inserts text or any other primitive data type or object into certain locations in your StringBuilder object
		 */
		System.out.println("\nInsert:");
		
		
		StringBuilder fruit = new StringBuilder("Apple");
		
		fruit.insert(1, 12); //at pos 1 insert 12
		System.out.println(fruit);
		
		fruit.insert(2, "tree");
		System.out.println(fruit);
		
		fruit.insert(4, new Dog()); //insert a new object
		System.out.println(fruit);
		
		/* 
		fruit.insert(100, "crash");
		System.out.println(fruit); stringIndexOutofBounds
		*/
		
		//-------------------------------
		
		
		//DELETE - removes chars in a substring of the specified StringBuilder object.
		
		fruit = new StringBuilder("pineapple");
		fruit.delete(2, 5); //delete everything from 2 up to (but NOT INCLUDING) 5.
		System.out.println(fruit);
		
	}
	
	
	static void ex4() {
		
	}
	

}
