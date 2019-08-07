package com.android;

import java.util.concurrent.SynchronousQueue;

public class Examples {
	static void ex1() {
		/*
		 * when you create a string by assigning a value, you place
		 * the text in what is called the "String pool", so the 
		 * name "pat" is placed in the pool in a particular location
		 * in your memory
		 */
		String name="pat";
		/*
		 * every another new string is created by assigning a value
		 * directly to a variable, it first checks the String pool 
		 * to see if the word already exists. if it does, it assigns
		 * the value in the pool to the new string reference.
		 * So name and name2 now refer to the same String Object
		 * which contains the word "pat"
		 */
		String name2="pat";
		/*
		 * name and name2 are the same object, so this will print
		 * true
		 */
		System.out.println(name==name2);
		/*
		 * both contain the word "pat" so this will print true
		 */
		System.out.println(name.equals(name2));
		//"apple" is addded to the pool
		String Fruit =returnString();
		/*
		 *when you use the "new" keyword to create a String, that 
		 *String is NOT added to the pool, and also that variable
		 *does not check the pool to see if the string is already
		 *in the pool
		 */
		String str2="katie";
		String str1=new String("katie");
		String str3=new String("katie");
		/*
		 * both of these will print false, str1 and str3 were created
		 * using the "new" keyword so they were NOT placed in the pool
		 * and do not check the pool for comparisons
		 * if you want to check if two strings are the same, you should
		 * NOT USE THIS METHOD
		 */
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		/*
		 * both of these will print true as the equals() method in
		 * the String class, checks if the the tow strings contain
		 * the same word and this is CASE SENSITIVE
		 */
		System.out.println("using equals method with a String");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		/*
		 * this is Katie with a capital "K", which is different from
		 * katie with a lowercase "k"
		 */
		str1="Katie";
		System.out.println(str1.equals(str2));
		/*
		 * one is upper case P
		 * one is lower case p
		 */
		str1="paddy";
		str2="Paddy";
		//this is false
		System.out.println("two paddies different "+str1.equals(str2));
		//this only checks the letters, not the case
		System.out.println("ignore case "+str1.equalsIgnoreCase(str2));
		/*
		 * if you want to find out if two strings are the same, you
		 * should ALWAYS USE EQUALS() not ==
		 */
		/*
		 * you can also create a string by passing an array of 
		 * characters
		 */
		char[]names1= {'c','o','l','m'};
		char[]names2= {'m','a','r','y'};
		String man=new String(names1);
		String woman=new String(names2);	
	}//end of ex1
	
	static String returnString() {
		return "apple";
	}
	
	static void ex2() {
		/*
		 * methods of the String class
		 * String class is known as a immutable class, an immutable
		 * class is a FINAL CLASS, so the methods of a String class
		 * DO NOT CHANGE A STRING, they return a NEW STRING
		 */
		String str="hello there nice to meet you";
		/*
		 * the replace method takes two chars, first argument what
		 * character we will replace in our string, the second
		 * argument what we will replace it with.
		 * All Strings produced by these methods ARE NOT PLACED in 
		 * the pool, these all produce brand NEW strings
		 */
		System.out.println(str.replace('e', '?'));
		//
		/*
		 * str is NOT CHANGED as none of the methods of the STring
		 * class change a string
		 */
		System.out.println(str);
		/*
		 * created a new string variable and assigned what is produced
		 * from the str.replace() method to the variable badStr
		 */
		String badStr=str.replace('e', '?');
		System.out.println(badStr);
		/*
		 * once created you can't change a String, you can assign a
		 * new value to it, but not change the string for instance
		 * changing all of our 'e' to '?'
		 */
	}
	
	static void ex3() {
		String name="paul";
		/*
		 * all of the methods are case sensitive, unless explicitly 
		 * stated to be not
		 */
		System.out.println("Charat()");
		/*
		 * char() shows what character is at a particular  index 
		 * in a string. Numbering in a string is array numbering
		 * so it starts at 0
		 */
		System.out.println("at position 0 "+name.charAt(0));//p
		System.out.println("at position 3 "+name.charAt(3));//l
		/*
		 * this gives us StringIndexOutOfBounds as name only has
		 * four characters so numbering goes from 0 to 3
		 */
		//name.charAt(4);
		System.out.println("length");
		/*
		 * if you want to get the length of your string, you use
		 * the length method.
		 * This will give use the lenght of the string that contains
		 * "paul" which is 4
		 */
		System.out.println("length of String "+name.length());
		/*
		 * this will get you the last character in our string
		 * it CANNOT BE name.charAt(name.length())becuase this would
		 * be name.charAt(4) which is out of bounds, so we take 
		 * away 1 and it become
		 * name.charAt(3), which is the letter 'L'
		 */
		System.out.println(name.charAt(name.length()-1));
		
		System.out.println("indexOf");
		String nursery="mary had a little lamb, whose fleece was "
				+ "white as snow and everywhere that mary went "
				+ "the lamb was sure to go";
		/*
		 * indexOf will show the first occurance of a character or
		 * set of characters (could be word) in a string
		 * so this string has 109 characters, so indexing goes from
		 * 0 to 107 (does not include double quotes)
		 */
		System.out.println(nursery.length());//108 characters
		/*
		 * this will get the FIRST occurance of the letter 'h', which
		 * is at index position 5, this will not get where 'h' is in
		 * the rest of the string
		 */
		System.out.println("h is at position "+nursery.indexOf('s'));
		/*
		 * this will get the FIRST occurance of the word 'lamb', it
		 * will NOT GET the second occurance of the word 'lamb'
		 * the first occurance of the word 'lamb' is at index position
		 * 18
		 */
		System.out.println("lamb is at "+nursery.indexOf("lamb"));
		/*
		 * this will start our search from postion 19
		 */
		System.out.println("second lamb "+nursery.indexOf("lamb",19));
		/*
		 * this gives us the position of the first lamb
		 * which is index position 18
		 */
		int search=nursery.indexOf("lamb");
		/*
		 * 	this adds one to the index postion of the first lamb
		 * , so this will be 19	
		 */
		search++;
		System.out.println("second lamb "+nursery.indexOf("lamb",search));
		/*
		 * if indexOf can't find a particular character or String
		 * it will return -1
		 */
		System.out.println("search for Z "+nursery.indexOf('z'));
		
		System.out.println("substring");
		/*
		 * there are a few overloaded substring() methods. the first
		 * type takes as an argument the starting postion index.
		 * in this example below with the word "oracle", it starts
		 * at position 2, which is the word 'a' and will produce
		 * the string "acle"
		 */
		String exam="oracle";
		String cut=exam.substring(2);//acle
		System.out.println("oracle starting at index pos 2 "+cut);
		/*
		 * starting position is 2 and UPTO BUT NOT INCLUDING position
		 * 4, so will print out "ac" from the word oracle
		 */
		cut=exam.substring(2, 4);//ac
		System.out.println("oracle starting pos 2 upto pos 4 "+cut);
		/*
		 * starting position is at 2 and UP TO BUT NOT INCLUDING
		 * position 6, so will print out "acle"
		 */
		cut=exam.substring(2,6);
		System.out.println(cut);
		
		System.out.println("Trim");
		/*
		 * trim() gets rid of the trailing spaces in a string (
		 * trailing space is any spaces at the beginning and end
		 * of a string), this DOES NOT get rid of spaces between words
		 * 
		 */
		name="   tom jones is a   singer  ";
		System.out.println("our word"+name+"finish of word");
		cut=name.trim();//trailing spaces are removed
		System.out.println("our word"+cut+"finish of word");
		
		System.out.println("replace");
		/*
		 * this replaces either characters or strings with another
		 * character or String
		 */
		name="tommy";
		/*
		 * this repaces both 'm's with an n
		 */
		cut=name.replace('m','n');
		System.out.println(cut);
		/*
		 * this replaces both instances of fox with wolf
		 */
		String str="the quick brown fox jumped over the lazy fox";
		cut=str.replace("fox", "wolf");
		System.out.println(cut);
		/*
		 * this does not change anything, just prints out the 
		 * unchanged string
		 */
		System.out.println(str.replace("cat","sheep"));
		/*
		 * you can't replace a string with a char or vice versa
		 */
		//cut=str.replace("fox", 'f');//will not compile
		System.out.println("endsWith and startsWith");
		str="ABCAB";
		/*
		 * these method return a boolean, always take a string
		 */
		System.out.println(str.startsWith("AB"));//true
		System.out.println(str.startsWith("a"));//false
		/*
		 * this check the character at postion 3, which is 
		 * "A"
		 */
		System.out.println(str.startsWith("A",3));//true
		
		System.out.println(str.endsWith("B"));//true
		System.out.println(str.endsWith("CAB"));//true
		System.out.println(str.endsWith("A"));//false
		//str.trim().endsWith("B");
	}//end of ex3
	
	static void ex4() {
		String str="hello";
		String str2="there";
		System.out.println(str+str2);
		/*
		 * this is the concat() method which does the exact same
		 * as the (+) operator when between two strings
		 */
		System.out.println(str.concat(str2));
		System.out.println("Method chaining");
		String myDay="     sunday      ";
		String day=myDay.replace('d', 'Z').trim().concat("men");
		System.out.println("hello"+day+"there");
		
		day="Monday";
		String newDay=day.replace("M", "T").concat("Day").
				substring(2,6);
		System.out.println(newDay);
		
		day="Saturday";
		newDay=day.substring(3,7).replace('u', 'o').
				concat(day);
		System.out.println(newDay);
	}
	
	static void ex5() {
		System.out.println("simple word and character count");
		String str=" the quick brown fox jumped over the lazy Dog ";
		/*
		 * count the characters (excluding spaces) in this sentence
		 * count the words in this sentence
		 */
		/*
		 * gets ride of any spaces before or after the string
		 */
		//System.out.println(str.trim());
		str=str.trim();
		/*
		 * this is a counter that will have how many spaces are 
		 * in our string
		 * at the end of our program, this should be 8
		 */
		int spaceCount=0;
		System.out.println(str.length());//this will loop 44 times
		/*
		 * this will loop for the entire length of the string, which
		 * is 44, so will will loop 44 times
		 */
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				spaceCount++;
			}//end of if statement
		}//end of for loop
		
		System.out.println("amount of spaces is "+spaceCount);
		/*
		 * in properly formatted text with no more than one space
		 * between each word, there is only one space, which is
		 * always going to be one less than the amount of words
		 * (there are no spaces at the beginning or end of the text
		 * as trim() has taken care of this
		 * so we add 1 onto the amount of spaces to get the 
		 * amount of words
		 * 
		 */
		int wordAmount=spaceCount+1;
		System.out.println("amount of words is "+wordAmount);
		/*
		 * amount of characters excluding spaces is the length
		 * of the string minus the amount of spaces
		 */
		int charAmount=str.length()-spaceCount;
		System.out.println("amount of characters is "+charAmount);
	}//end of ex4
	
	static void ex6() {
		String poet="Wordsworth";
		/*
		 * Methods of the String class, ALWAYS produced a NEW
		 * STRING, which means they are NOT added to the pool or
		 * they do NOT check the pool to see if string already 
		 * exists
		 */
		String str1=poet.substring(5);//produces new word "worth"
		System.out.println(str1);
		String str2=poet.substring(5);//produces new word "worth"
		/*
		 * this prints true as they both contain the word
		 * "worth"
		 */
		System.out.println(str1.equals(str2));
		/*
		 * this will be false as subString() produces a NEW string,
		 * it uses the NEW keyword to create a new string, and anytime
		 * the new keyword, is used to create a string it is NOT placed
		 * in the pool 
		 */
		System.out.println(str1==str2);
		/*
		 * only at this point is the word "worth" placed in the pool
		 */
		String str3="worth";
		/*
		 * this will be false, as str1 was not placed in the pool
		 * as it it was created using a method of the String class
		 */
		System.out.println(str1==str3);
		/*
		 * this will be true as str1 and str3 both contain the word
		 * "worth"
		 */
		System.out.println(str1.equals(str3));
		
		String str4="worth";
		/*
		 * these are the same object, as str3 places the String
		 * "worth" in the pool so that means the str4 is the same
		 * object as str3
		 */
		System.out.println(str3==str4);
	}
	
	static void ex7() {
		/*
		 * with strings you can only use certain operators
		 * namely concatenation
		 * +,+=
		 */
		String name="mary";
		/*
		 * this is the same as name=name+" fahy";
		 */
		name+=" Fahy";
		System.out.println(name);
		/*
		 * and equality 
		 * ==, 
		 * != checks to see if they are not the same string object
		 */
		String str1="apple";
		String str2=new String("apple");
		//this will return true as they are NOT the same object
		System.out.println(str1!=str2);
		//this is jsut simple concatenation, joins the strings up
		String aString="santa "+" claus "+" is coming to town";
		System.out.println(aString);
		
		int num=10;
		int num2=30;
		/*
		 * the first location we find a string in a print statement
		 * , everything after that is treated as string. So 
		 * everthing before a string is treated as whatever data 
		 * type it is
		 * in this case num is an int
		 * num2 is an int
		 * so num+num2 is the sume 10+30, which is 40
		 * so this print out
		 * 40SantaClaus is coming to town
		 */
		System.out.println(num+num2+aString);
		/*
		 * everything after a string is treated as a string in 
		 * print statement
		 * so num+num2 is a concatenator, so this will be 1030
		 * so this will print out 
		 * santa claus is coming to town1030
		 */
		System.out.println(aString+num+num2);
		/*
		 * inner brackets are done first, so num+num2 are treated
		 * as numbers, so this will be 10+30 which is 40
		 * so it print 
		 * santa claus is coming to town40
		 */
		System.out.println(aString+(num+num2));
		
		Dog spot=null;
		System.out.println(spot);
		/*
		 * if you try to print off a null object with a non string
		 * data type, you will get an error
		 */
		//System.out.println(spot+num);
		//System.out.println(num+spot);
		//System.out.println('c'+spot);
		/*
		 * this will not print out as this is a null object without
		 * a reference
		 */
		//System.out.println(null);
		/*
		 * when you use a string with a null in a print statemnt
		 * it converts the null object to the string "null"
		 */
		System.out.println(spot+"hello");
		System.out.println("hello"+spot);
		System.out.println(null+"hello");
		/*
		 * if you have other data types besides string and null
		 * in your print statement, you have to have the null AFTER
		 * THE STRING for it to print out
		 */
		System.out.println(10+20+"hello"+null);//this compiles
		System.out.println(10+20+"hello"+spot);//will compile
		
		//System.out.println(null+10+20+"hello");//will not compile
		//System.out.println(10+20+spot+"hello");//will not compile
		
		//Dog
	}
	
	
	

}
