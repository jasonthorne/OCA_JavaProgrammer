package com.noel;

import java.io.FileInputStream;

public class Animal {
	
	void eat()throws Exception{
		/*
		 * this creates a new Exception
		 * object. there is a constructor
		 * in the Exception class that takes
		 * a string
		 */
		throw new Exception("eat exception thrown");
	}
}
/*
 * this is a checked exception
 * we are creating our own Exception class
 */
class animalException extends Exception{
	/*super(msg)
	 * calls the construtor in the super
	 * class (which is the Exception class)
	 * that takes an string
	 */
	animalException(String msg){
		super(msg);
	}
}
/*
 * statics first, then instances, then constructor
 */
class Order{
	//first
	static{
		String str1=returnString(" static 1");
	}
	//third
	{
		String str2=returnString("instance 3");
	}
	//second
	static String statString=returnString("static 2");
	
	//fourth
	String str4=returnString("instance 4");
	
	//fifth
	Order(){
		String str5=returnString("constructor 5");
	}
	
	static String returnString(String str){
		System.out.println(str);
		return "string is "+str;
	}
	
}
