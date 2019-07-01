package com.android;

public class Zebra implements Condition<String> {

	
	//the condition interface looks like this:
	//void eat(T t, T t2, int num);
	
	//You have to supply the generic type name when IPMLEMENTING an interface with a generic type.
	
	@Override
	public void eat(String t, String t2, int num) {
		System.out.println("Zebra eat method which takes 2 generic types which we define to be strings, and also takes an int.");
		
	}

	
	
}
