package com.android;

public class Human {
	int age;
	
	void talk() {
		System.out.println("Employee talking");
	}
}

//There is no relationship between these 2 classes so they are loosely coupled set of classes (loosely because they're in the same file)
class Employee{
	int age;
	
	void talk() {
		System.out.println("Employee talking");
	}
}


