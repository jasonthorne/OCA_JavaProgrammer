package com.android;

import java.util.concurrent.SynchronousQueue;

public class Examples {

	static void ex1() {
		throwRuntime();
		throwIndexOut();
	}
	
	static void throwRuntime()throws RuntimeException{
		System.out.println("throwRuntime method called");
	}
	/*
	 * by default RunTimeExceptions are thrown of the method, you dont' have to
	 * put in a "throws RuntimeException"
	 */
	static void throwIndexOut() {
		int[]nums= {45,77,99};
		System.out.println(nums[5]);
	}
}
