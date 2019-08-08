package com.android;

public class Trace {
	
	void method1() {
		System.out.println("method 1 called");
		method2();
	}
	
	void method2() {
		System.out.println("Method 2 called");
		method3();
	}
	
	
	void method3() {
		System.out.println("method 3 called");
		int[]numList= {45,67,99};
		/*
		 * this will generate an arrayIndexOutOfBoundsException which
		 * is a runtime exception, which means you DON'T HAVE TOO
		 * put it in a try/catch block. So it will compile, but it will
		 * also crash your program. In reality this should NOT be in a try
		 * catch block, as this is something you can easily fix by
		 * just accessing numList[2]
		 */
		System.out.println(numList[4]);
	}

}
