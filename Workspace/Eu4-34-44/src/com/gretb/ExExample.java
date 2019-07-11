package com.gretb;

public class ExExample {
	void method1(){}
	
	void method2()throws Exception{}
	/*
	 * the base class method has to 
	 * an exception or a superclass 
	 * of exception, which is throwable
	 */
	void method3()throws Exception{}
}

class ExExample2 extends ExExample{
	/*
	an overriding method can throw ANY
	RuntimeException regardless of whether
	the original method throws ANY exception
	 */
	@Override
	void method1()throws RuntimeException{}
	void method2()throws ArrayIndexOutOfBoundsException{}
	/*
	this will ONLY compile if the base class
	method3() we are overriding throws at least
	a Exception or a throwable object, as throwable
	is a superclass of Exception
	 */
	void method3()throws Exception{}
}
