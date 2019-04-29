package com.android;

import com.animal.mammal.Ape;

//You CANNOT import from the default package, which is in effect no package at all. You can only import from another NAMED package.

/**
 * 
 * Exam Objective 1.2
 * Define the Structure of a Java Class
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Person percy = new Person(); //Person is in main so can be seen without a package import
		
		Ape myApe = new Ape();
		
		myApe.angry(); //the default method from behavior interface
		
		
		
	}

}

