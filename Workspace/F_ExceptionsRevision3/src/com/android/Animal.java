package com.android;

public class Animal {
	
	Animal()throws Exception{
		System.out.println("Animal created");
	}
	
	void eat()throws RuntimeException{
		System.out.println("eat method does not have to put in a try catch block");
	}
	
	void drink()throws Exception{
		System.out.println("drink method has to be dealt with");
	}

}
