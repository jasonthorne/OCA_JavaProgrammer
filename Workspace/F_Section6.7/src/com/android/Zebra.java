package com.android;
/*
 * the condition interface looks like the following
 * public interface Condition<T> {
	
	void eat(T t,T t2,int num);
	
	you have to supply the generic type name when IMPLEMENTING an interface
	with a generic type
 */
public class Zebra implements Condition<String> {

	@Override
	public void eat(String t, String t2, int num) {
		System.out.println("zebra eat method that takes two strings of "
				+ "which were the generic type T"
				+ "which we define to be a String and an int");
		
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
