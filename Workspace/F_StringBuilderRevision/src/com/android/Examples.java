package com.android;

import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Examples {
	
	public static void ex1() {
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder(50);
		/*
		 * you can't assign a string to a StringBuilder
		 * or vice veasa
		 */
		//String myStr=sb1;//will not compile
		//sb1="hello";//will not compile
		String myStr=sb1.toString();
		sb1=new StringBuilder(sb2);
		sb1=new StringBuilder('a');
		Integer myInt=44;
		sb1=new StringBuilder(myInt.toString());
		System.out.println(sb1);
		sb1=new StringBuilder(66);
		System.out.println(sb1);
		String nursery="Mary had a little lamb";
		StringBuilder nurserySb=new StringBuilder(nursery);
		System.out.println(nursery.substring(4, 15));
		System.out.println(nursery);
		System.out.println(nurserySb.append("so she had"));
		System.out.println(nurserySb);
		sb2=new StringBuilder("some text");
		sb1=sb2;
		/*
		 * this is checking to see if they are the same object
		 * they
		 */
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		String str1="orange";
		String str2="orange";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		/*
		 * these are two different objects
		 * and two different references of the word "apple". the equals
		 * method of the StringBuilder class, checks to see if the references
		 * of the two strings used to create the StringBuilder are the same
		 */
		//sb1=new StringBuilder("apple");
		//sb2=new StringBuilder("apple");
		//this will false
		//System.out.println(sb1==sb2);
		//this will be false
		sb1=sb2;
		System.out.println("stringBuilder is "+sb1.equals(sb2));
		String myString="pineapple";
		sb1=new StringBuilder(myString);
		sb2=new StringBuilder(myString);
		System.out.println(sb1==sb2);
		/*
		 * STringBuilers are always different, the equals method will 
		 * always return false, so if we want to check that if two StringBuilder
		 * contain the same "text" we have to use the toString() method of the
		 * StrinBuilder class and call the equals method on that
		 */
		System.out.println(sb1.toString().equals(sb2.toString()));//true
	//	String String;
		StringBuilder StringBuilder;
		List List;
		/*
		God myGod=new God();
		myGod=new God();
		myGod.age=12;
		*/	
	}
	
	static void ex2() {
		System.out.println("methods of the StringBuilder class");
		System.out.println("append changes the StringBuilder object");
		StringBuilder fruit=new StringBuilder("Apple ");
		System.out.println(fruit.append("tree"));
		System.out.println(fruit);
		Dog spot=new Dog();
		fruit.append(spot);
		System.out.println(fruit);
		fruit.append(new Object());
		System.out.println(fruit);
		fruit.append(12);
		System.out.println(fruit);
		//the + symbol and concat does not work with StringBuilder
		//stringBuilder does not have access to it
		System.out.println("hello "+" there");
		System.out.println("hello ".concat("there"));
		/*
		 * you can use the concatenation symbol (+) with a stringBuilder
		 * and a String
		 * you CAN'T USE the concatenation symbols with two StringBuilders
		 */
		System.out.println(fruit+"hello");
		System.out.println("hello"+fruit);
		//will not compile, two StringBuilders
	//	System.out.println(fruit+fruit);
		//once you have a stringBuilder in this line of code, it
		//will not compile
	//	System.out.println("hello".concat(fruit));//will not compile
	//	System.out.println(fruit.concat("hello"));//will not compile
	
	}
	
	static void ex3() {
		System.out.println("insert only available to StringBuilder");
		/*
		 * Inserts text or any other primitive data type or object
		 * into certain locations in your StringBuilder object
		 * array numbering is used, count starts at 0
		 */
		StringBuilder fruit=new StringBuilder("Apple");
		fruit.insert(1, 12);
		
		System.out.println(fruit);
		fruit.insert(2, "tree");
		System.out.println(fruit);
		System.out.println(fruit.insert(4, new Dog()));
		//this produces an StringIndexOutOfBoundsException
		//fruit.insert(100, true);
		System.out.println("**Delete");
		/*
		 * delete removes the characters in a substring of the speicifed
		 * StringBuilder object.
		 * this deletes from index position 2 up to BUT NOT INCLUDING
		 * 5
		 * 
		 */
		fruit=new StringBuilder("pineapple");
		fruit.delete(2, 5);//removes nea
		System.out.println(fruit);//prints out pipple
		fruit=new StringBuilder("pineapple");
		fruit.deleteCharAt(7);//removes L
		System.out.println(fruit);
		//this will delete everything from position 5 onwards
		fruit.delete(5, 1000);
		System.out.println(fruit);
		//this will give StringIndexOutOfBoundsException as the start point
		//is beyond the end of the stringBuilder
		//fruit.delete(20, 30);
		//no trim method of the StringBuilder class
		//no concat of the StringBuilder class
		System.out.println("reverse");
		/*
		 * reverses the order of characters in a StringBuilder object
		 */
		fruit=new StringBuilder("pineapple");
		fruit.reverse();
		System.out.println(fruit);
		System.out.println("replace replaces characters in StringBuilder");
		fruit=new StringBuilder("pineapple");
		fruit.replace(0, 4, "cherry");
		System.out.println(fruit);
		fruit=new StringBuilder("pineapple");
		
	}
	
	static void ex4() {
		System.out.println("methods StringBuilder shares with String");
		//this does not change the StringBuilder()
		StringBuilder fruit=new StringBuilder("   pineapple    ");
		System.out.println(fruit.substring(1,4));
		System.out.println(fruit);
		StringBuilder blankSb=new StringBuilder(50);
		System.out.println(blankSb.length());
		//setCharAt changes the StringBuilder object
		fruit.setCharAt(2, 'u');
		System.out.println(fruit);
		//fruit.trimToSize();
		System.out.println("fruit is"+fruit);
		
	}

}
