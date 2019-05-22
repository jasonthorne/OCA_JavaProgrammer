package com.android;

public class Examples {

	static void ex1(){
		
		/*when you create a string by assigning it a value, you place the text in what's called a string pool.
		 * So the name "pat" is put into a particular location in RAM. */
		String name1 = "pat";
		
		/*Every time ANOTHER new string is created by assigning a value directly to a variable, 
		 * it first checks the string pool to see if the string value already exists (case sensitive),
		 * If so, it assigns its reference to that string value */
		String name2 = "pat"; 
		
		System.out.println(name1==name2); //checks if they're the SAME OBJECT
		System.out.println(name1.equals(name2)); //checks if they've the same value
		
		//apple is added to sting pool
		String fruit = returnString();
		
		//======
		
		/*Using the 'NEW' keyword to create a string, that string is NOT added to the pool, 
		and also that variable doesn't check the pool to see if a string is already in the pool.*/
		String str1 = new String("bob");
		String str2 = "bob"; 
		
		String str3 = new String("bob");
		
		//++++++++++++++++++++++++++++++++++++++++++
		//if you want to check if 2 strings are the same, you should NOT use this method:
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		//use THIS METHOD to check the values of strings (case sensitive): //+++++++++++++++++++++++++++++++++++
		System.out.println("Using equals method with a String: " + str1.equals(str2)); //'true' as the equals method in the string class checks value
		System.out.println("Using equals method with a String: " + str1.equals(str3)); 
		
		
		str1 = "paddy";
		str2 = "Paddy";
		System.out.println("check paddies: " + str1.equals(str2)); //checks if they've the same values
		System.out.println("check paddies: " + str1.equalsIgnoreCase(str2)); //checks if they've the same values IGNORING CASE
		
		/*
		 * If you want to find out if two strings are the same you should ALWAYS use .equals, not ==
		 */
		
		char[]names1 = {'c', 'o','l','m'};
		char[]names2 = {'m', 'a','r','y'};
		String man= new String(names1); //calling the String classe's constructor, which can take an array of chars. +++++++++++++++++++++++++++
		String woman= new String(names2);
		
		
	}
	
	
	
	static String returnString() {
		return "apple";
	}
	
	
	static void ex2() {
		/*
		 * Methods of the string class. +++++++++++++++++++++++++++++++++NEED TO KNOW ALL OF THESE FOR THE EXAM!!
		 * 
		 * String class is an immutable class. An immutable class is a FINAL CLASS, so methods of a String class DO NOT CHANGE A STRING,
		 * they return a NEW STRING. 
		 */
		
		
		String str = "yo dawg!";
		
		//the REPLACE method takes 2 chars, firsts arg is what to replace, 2nd is what to replace it with:
		System.out.println(str.replace('!', '?')); //This DOESNT REPLACE the string you've called it on. just returns the result++++++++++
		
		/*
		 * Once you've created you can't change a String, you can assign a new value to it, but not change the string.
		 */
		
		
	}
}
