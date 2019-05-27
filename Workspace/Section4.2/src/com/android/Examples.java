package com.android;

public class Examples {
	
	static void ex1(){
		
		/* A String is an IMMUTABLE object, that once created, cannot be changed. As it is a FINAL class.
		 * So with all string methods of the string class, we are creating a NEW string object.
		 * 
		 * A StringBuilder object is a mutable string that CAN be changed. 
		 * The methods of the StringBuilder class can change the object 
		 * (a lot of methods of the String also exist in the stringBuilder class and are called the same name and have the same function).
		 */
		
		
		//this is the only way to create a stringbuilder:
		StringBuilder sb1 = new StringBuilder("some text");
		
		//You cant assign a string to a stringbuilder obj:
		//sb1 = "computer say's no";
		//StringBuilder sb2 = "computer say's no";
		String str = "computer say's no";
		//sb1 = str;
		
		
		//This is assigning an existing StringBuilder to a new StringBuilder reference:
		 
		StringBuilder sb2 = sb1;
		
		/*
		 * StringBuilder, like String, is an arrray of chars.
		 * With StringBuilder the initial length of all StringBuilder lengths is 16. +++++++++++++++++++++++++++++++++++++++++++++++
		 * That means we have a string char array of size 16 chars storing out stringbuilder object.
		 */
		
		
		StringBuilder sb3 = new StringBuilder(50); //new StringBuilder obj with a size of 50
		
		System.out.println("StringBuilder sb1 is: " + sb1);
		System.out.println("sb2 is: " + sb2);
		
		
		//creating a new StringBuilder object by passing it another sb object.
		StringBuilder sb4 = new StringBuilder(sb1);
		System.out.println("sb4 is: " + sb4);
		
		//you an create a  blank StringBuilder:
		StringBuilder sb5 = new StringBuilder(); //like a blank string (String myStr="")
		
	}
	
	static void ex2() {
		
		//APPEND 
		System.out.println("Append");
			
		/*
		 * Append() adds to the end of the StringBuilder object.
		 * This method CHANGES the stringBuilder object calling it.
		 */
		
		StringBuilder sb1 = new StringBuilder("Toy");
		System.out.println(sb1);
		sb1.append(" Story");
		System.out.println("sb1 is now: "+ sb1);
		
		//You ca append ANY TYPE of data onto a StringBuilder object:
		sb1.append(true);
		System.out.println(sb1);
		sb1.append('!');
		System.out.println(sb1);
		sb1.append(3);
		System.out.println(sb1);
		sb1.append(3.3);
		System.out.println(sb1);
		
		//This takes the toString() method from the object class and just prints out the address of this object
		Dog spot = new Dog();
		System.out.println("spot is: "+spot);
		
		//This takes the toString method from Cat class, which is overriden from the Object class, and prints the name & age of the cat;
		Cat tibbles = new Cat(10, "tibbles");
		System.out.println("tibbles is: "+tibbles);
		
		StringBuilder sbtest = new StringBuilder();
		
		//this appends the address of spot onto sbtest. 
		System.out.println(sbtest.append(spot));
		
		//this appends the string that is returned from toString() method of the Cat class, when tibbles is placed in a print statement:
		System.out.println(sbtest.append(tibbles));
		
		String greeting = "yo ";
		System.out.println(greeting + tibbles); //creates a new string
		
		//=================
		
		//You can append an array of chars to a StringBuilder obj:
		
		StringBuilder sb5 = new StringBuilder("hi ");
		StringBuilder sb6 = new StringBuilder();
		
		char[] name = {'j', 'a', 'v', 'a'};
		System.out.println(sb5.append(name)); //append PERMANENTLY appends to the strnigBuilder string
		
		sb5 = new StringBuilder("hi ");
		
		//this wil append from the name array, from index pos 1 to index pos 3, which is the word "ava":
		System.out.println(sb5.append(name, 1,3));
		
		//if you want to add anything to a stringbuilder, you have to append it: 
		sb5 = sb5.append(sb6);
		
		//you can add a stringbuilder to a string, BUT it then becomes part of that string. (and no longer a SstringBuilder) 
		String str = "hello" + sb6;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
