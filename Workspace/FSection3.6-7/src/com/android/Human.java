package com.android;

public class Human {
	int age;
	
	void talk() {
		System.out.println("human talking");
	}

}
/*
 * there is no relationship between these two classes, no connection
 * between these two classe, so this is a a loosely coupled set of 
 * classes
 */
class Employee{
	int age;
	
	void talk() {
		System.out.println("Employee talking");
	}
}
