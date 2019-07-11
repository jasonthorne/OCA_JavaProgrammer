package com.gretb;

public class MyException extends Exception{
	

}

class TestClass{
	/*
	 * myException is a subclass of Exception
	 * which means it is a checked exception
	 * so you either have to throw it or 
	 * surround it in a try/catch block.
	 * here our methods "throws" the exception
	 * . The throws part of the method
	 * declaration has to be the same class
	 * or a superclass of it, this ONLY applies
	 * to checked exceptions. with runtimeExceptions
	 * it does not matter
	 */
	/*
	 * the call of each of the three of these 
	 * methods either has to be in a try/catch 
	 * block or the method calling them has
	 * to throw them, as all these are 
	 * CHECKED exceptions
	 */
	void myMethod()throws Exception{
		throw new MyException();
	}
	
	void myMethod2()throws MyException{
		throw new MyException();
	}
	
	void myMethod3()throws Throwable{
		throw new MyException();
	}
	/*
	 * does not matter if this method "throws" the
	 * exception as this is a runtime exception
	 */
	void myMethod4()throws NullPointerException{
		throw new RuntimeException();
	}
}
