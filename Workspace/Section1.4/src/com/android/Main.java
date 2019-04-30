package com.android;

import com.building.Animal;

/**
 * 
 * Exam objective 6.4 - Apply Access Modifiers
 *
 */

public class Main {

	public static void main(String[] args) {
		
		/*
		 * See Animal class,
		 * then Access class,
		 * then Main class,
		 * then Dog class
		 */
		
		//this object is from the Animal class which is in a different package (com.building).
		//This means we've only access to the public members of the Animal class. There is NO INHERITENCE relationship between this class and the Animal class.
		Animal andy = new Animal(); //public constructor in Animal class 
		//we've only access to public members here:
		System.out.println(andy.name);
		andy.run();
		
		Animal andy2 = new Animal(3); //calling another public constructor in Animal.

	}

}
