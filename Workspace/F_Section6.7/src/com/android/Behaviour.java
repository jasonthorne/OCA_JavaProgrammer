package com.android;

public interface Behaviour {
	/*
	 * an abstract method called lambda1 (can be called anything you want)
	 * that takes two ints and returns an int
	 */
	int lambda1(int a,int b);
	
	default void method1() {
		System.out.println("Behaviour method1 called");
	}
	
	default void method2() {
		System.out.println("behaviour method2 called");
	}
	
	static void statMethod() {
		System.out.println("Behaviour static method called");
	}

}
