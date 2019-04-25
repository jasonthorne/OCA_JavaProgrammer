package com.employee;

public class Test {
	/*
	 * here we are accessing the static methods in another package in a 
	 * static way without creating an instance of teh Maths class. Static 
	 * methods exist regardless of whether there is any objects of the class
	 * or not
	 */
	void doSomething() {
		com.gretb.Maths.add(56, 78);
		com.gretb.Maths.multiply(223, 1234);
	}

}
