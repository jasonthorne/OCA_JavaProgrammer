package com.noel;

public class Animal {
	
	static void eat(){
		System.out.println("animals eating");
	}
	
	void drink(){
		System.out.println("animals drinking");
	}
}

class Dog extends Animal{
	/*
	 * static methods are not overriden they
	 * are "shadowed"
	 */
	static void eat(){
		System.out.println("Dogs eating");
	}
	/*
	 * you can't override an instance method with
	 * a static method or vice vearsa
	 * this will give an error
	 */
/*	static void drink(){
		
	}*/
}
