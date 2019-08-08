package com.android;

public class Zebra implements Mood,Mood2{
/*
 * if two  unrelated interfaces have two default methods, with the 
 * same method signatures and a class implements both of those 
 * interfaces, then the class does not know which of these methods
 * to choose. So the implementing class HAS TO override that method.
 * here the Zebra class implements Mood and Mood2 and both of these 
 * interfaces has a default void happy(){} method, so it does not know
 * which happy() method to choose, so it has to override the Happy()
 * method
 */
	@Override
	public void angry() {
		System.out.println("angry");
		
	}
	
	@Override
	public void happy() {
		System.out.println("Zebra happy");
	}
	@Override
	public void sad() {
		// TODO Auto-generated method stub
		
	}

}
