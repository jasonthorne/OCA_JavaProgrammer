package com.android;


public class Trace {
	
	void method1() {
		System.out.println("method 1 called");
		method2();
	}
	
	
	void method2() {
		System.out.println("method 2 called");
		method3();
	}
	
	void method3() {
		System.out.println("method 3 called");
		int[]numList = {45,67,99};
		
		/*
		 * this will generate an arrayIndexOutOfBoundsException which is a runtime exception. 
		 * which means you dont put it in a try-catch.
		 * So it will compile, but it will also crash the code.
		 * In realisty this SHOULD NOT be in a try catch, as its something you can fix yourself.
		 */
		System.out.println(numList[3]);
	}

}
