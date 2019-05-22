package com.android;
/**
 * 
 * Exam objective 6.6 - Determine the effect upon object references & primitive values when they are passed into methods that change the values.
 *
 */

public class Dog {

	int age;
	String name="spot";
	static int counter=0;
	final int id; //final cant be changed
	
	Dog(){
		counter++;
		id=counter;
	}
	
}
