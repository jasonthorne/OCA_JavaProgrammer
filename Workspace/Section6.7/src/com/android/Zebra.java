package com.android;

public class Zebra implements Condition<String> {

	
	//the condition interface looks like this:
	//void eat(T t, T t2, int num);
	
	//You have to supply the generic type name when IPMLEMENTING an interface with a generic type.
	
	@Override
	public void eat(String t, String t2, int num) {
		System.out.println("Zebra eat method which takes 2 strings of a a generic type, and also takes an int.");
		
	}

	
	
}

class Penguin implements Condition<Boolean>{

	@Override
	public void eat(Boolean t, Boolean t2, int num) {
		// TODO Auto-generated method stub
		
	}
	
}

class Hawk implements Condition<Dog>{

	@Override
	public void eat(Dog t, Dog t2, int num) {
		// TODO Auto-generated method stub
		
	}
	
}
