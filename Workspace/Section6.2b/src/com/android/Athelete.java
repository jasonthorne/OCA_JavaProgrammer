package com.android;

public class Athelete implements Jumpable, Movable{

	void getValues() {
		System.out.println("max in Jumpable is: " + max); //access max this way
		System.out.println(Jumpable.max); //access max in a static way
		
		/*
		 * If you have two variables of the same name in unrelated interfaces 
		 * and a class implements both of these interfaces, 
		 * you can no longer access that named variable in a non static way.
		 * 
		 * below, doesn't know if your trying to access the Jumpable.min or the Movable.min
		 */
		
		//System.out.println("min is " + min);
		System.out.println("min is " + Jumpable.min);
		System.out.println("min is " + Movable.min);
		
	}
	
}


interface Movable{
	String min = "ten";
}