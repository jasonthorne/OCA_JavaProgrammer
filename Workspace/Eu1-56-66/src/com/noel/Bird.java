package com.noel;

public class Bird {
	int age=10;
	
	
	void eat(){
		System.out.println("Bird eat");
	}
}

class Chicken extends Bird{
	int age=100;
	void eat(){
		System.out.println("chicken eat");
	}
	
	
}
