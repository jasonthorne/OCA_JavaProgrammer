package com.gretb;

public class Examples {
	/**
	 * Strings and the methods of the String class
	 */
	static void ex1() {
		/*
		 * when creating a String, that string object is added to the 
		 * "string pool". if we create another string, java first 
		 * checks the pool, if the new string uses the EXACT SAME LETTERS
		 * AND CASES then the new String reference is assigned to the object
		 * in the pool. here below we have "str", "str2", "str3" which refere
		 * to the same object, as they both have the exact same text "hello"
		 * in them
		 */
		String str="hello";
		String str2="hello";
		String str3="hello";
		
		System.out.println("are these two strings object the same "
				+ "object "+(str==str3));
		
		System.out.println("using equals for checking two strings ");
		System.out.println(str.equals(str2));
		/*
		 * if you use the NEW keyword when creating it does not check
		 * the pool, it is not added to the pool
		 */
		String str4=new String("hello");
		System.out.println("comparing one NEW string with string using ==");
		/*
		 * this will return false as str4 is not the same as str
		 */
		System.out.println(str==str4);
		System.out.println("comparing one NEW string with string using "
				+ "equals()");
		System.out.println(str.equals(str4));
		/*
		 * different methods of the String class
		 */
		str3="     pat     ";
		System.out.println("hello"+str3+"there");
		System.out.println("***trim()***");
		/*
		 * trim() is a method of the string class and it gets rid of any
		 * trailing spaces (trailing space is a space at the beginning and
		 * end of your string)
		 * all of the methods of String class they do not change the string 
		 * itself, it only changes the display of the String
		 */
		/*
		 * this prints out 
		 * ***     pat     ***
		 */
		System.out.println("***"+str3+"***");
		//no trailing spaces appear as trim removes the trailing spaces
		/*
		 * this prints out 
		 * ***pat***
		 * this does not change the string, only changes the display of
		 * the string
		 */
		System.out.println("***"+str3.trim()+"***");
		//string is still _____pat_____ (underscores to show spaces)
		System.out.println("***"+str3+"***");
		//this is assigning the trimmer version of str3 to a new string
		//variable called newString
		String newString=str3.trim();
		System.out.println("***"+newString+"***");
		
		System.out.println("***concat()");
		/*
		 * concat joins strings (same as + in prints statements
		 */
		System.out.println(str3.concat(str2));
		
		System.out.println("***substring()");
		str3="humpty dumpty";
		/*
		 * displays part of your string, uses array numbering, so it starts
		 * at 0 and goes UP 8 TO BUT NOT INCLUDING 8. 
		 * this will print out "humpty d" it does not include the "u" as 
		 * "u" is at position 8, which you don't include. you can have the
		 * starting point at any point in a string
		 */
		//will print out "humpty d"
		System.out.println(str3.substring(0, 8));
		//will print out "mpty du"
		System.out.println(str3.substring(2,9));
		/*
		 * this will generate an StringIndexOutOFBoundsException as our
		 * string only goes as far as 12
		 * this is called a StringIndexOutOfBoundsException, this is 
		 * something called a runtimeException() and runtimeException usually
		 * are a error in the logic, so the compiler DOES NOT recognise them
		 * as an error. in its current state, this will crash your program
		 */
		//System.out.println(str3.substring(2,19));
		/*
		 * this starts at position 2 and goes up to postion 13 but not include
		 * postion 13 (which is just as well, as position 13 does not exist
		 * as our numbering goes from 0 to 2)
		 */
		System.out.println(str3.substring(2,13));
		/*
		 * this is an overloaded substring method that will print out 
		 * everything from position 3 onwards
		 */
		System.out.println(str3.substring(3));
		System.out.println("***length()***");
		/*
		 * this will get the amount of characters in our string
		 * remember a space IS A CHARACTER
		 */
		System.out.println(str3.length());
		
		System.out.println("***charAt()***");
		/*
		 * gets the character at the position 2, which is m
		 */
		System.out.println(str3.charAt(2));
		
		System.out.println("***indexAt***");
		/*
		 * will print out the number of the index where this character first
		 * appears. so for instance this will get the 'u' at position 1, not
		 * at postion 8
		 */
		System.out.println(str3.indexOf('u'));
		
		String myString="noel";
		String myString2="NOEL";
		//this is going to be false as different case
		System.out.println(myString.equals(myString2));
		//this only checks the spelling and ignores the case, true
		System.out.println(myString.equalsIgnoreCase(myString2));
		
		Cat tibbles = new Cat(2,"tibbles",2.3);
		System.out.println("name of cat is "+tibbles.name);
		System.out.println("age of cat is "+tibbles.age);
		System.out.println("weight of cat is "+tibbles.weight);
		
		tibbles.age=500;
		/*
		 * the name and weight atribute in the Cat class is final, so
		 * once it is given a value yo cannot change the name or weight
		 * of this cat
		 */
	//	tibbles.name="tom";//will not compile
	//	tibbles.weight=600.23;//will not compile
		/*
		 * a class can also be final, the String class is final, that 
		 * means when you create a string, you can't change the String
		 * i.e "pat     ".trim will still be "pat    " as the trim method
		 * does not change the original text, only the display of the 
		 * text.
		 */
		
		String myStr="    pat   ";
		System.out.println("myString is"+myStr.trim()+"****");
		/*
		 * this is still "      pat    "
		 */
		System.out.println("myString is"+myStr+"****");
		/*
		 * you have to assign whatever is produced by a method being called
		 * by a string to a new string reference
		 */
		newString=myStr.trim();
		System.out.println("newString is "+newString);
	}
	
	static void ex2() {
		System.out.println("StringBuilders");
		/*
		 * the String class is final, or can be said to be immutable, once
		 * you create a string, any methods of the String class does not
		 * change the original string.
		 * StringBuilder is type of String class that is MUTABLE, not final
		 * so this means that the methods of the StringBuilder class CAN
		 * change the text inside a StringBuilder object
		 * this is the best way to create a stringBuilder
		 */
		StringBuilder sb=new StringBuilder("hello there");
		
		System.out.println("before change stringbuilder is "+sb);
		System.out.println("append()");
		//append adds to end of the Stringbuilder text
		sb.append(10);
		sb.append("top");
		sb.append('!');
		sb.append(true);
		sb.append(2.88);
		//hello there10top!true2.88
		System.out.println("After change stringbuilder is "+sb);
		//this is called chainging method, where one method call can call another
		sb.reverse().append("hello").charAt(1);
		System.out.println(sb);
	}

}
