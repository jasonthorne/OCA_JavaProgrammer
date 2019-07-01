package com.android;

public interface Behaviour {
	
	//an abstract method that tkaes 2 ints and returns  an int
	int lambda1(int a, int b);

	default void method1() {
		System.out.println("Behaviour method 1 called");
	}
	
	default void method2() {
		System.out.println("Behaviour method 2 called");
	}
	
}
