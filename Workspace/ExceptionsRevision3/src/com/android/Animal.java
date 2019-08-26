package com.android;

public class Animal {
	
	Animal() throws Exception{ //a constructor with a throws (A constructor IS A METHOD so can have a throws in its sig)
		
		System.out.println("Animal created");
	}
	
	void eat() throws RuntimeException{
		System.out.println("eat method doesnt have to be put into a try/catch block (as it throws a RUNTIME exception)");
	}
	
	
	void drink() throws Exception{
		System.out.println("drink method HAS to be put into a try/catch block (as it throws an EXCEPTION)");
	}
	

}
