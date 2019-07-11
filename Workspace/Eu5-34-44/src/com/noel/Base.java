package com.noel;

public class Base {
/*
 * a overriding method that throws
 * a checked exception can throw the same 
 * exception, a subclass of the exception or none
 * this is the rule for CHECKED EXCEPTIONS.
 * with runtime exceptions you can throw any
 * or no exception in an overriding exception
 * as long as the overriding method is not throwing
 * a checked exception
 * myMethod throws IndexOutOfBoundsException which is
 * a super class of ArrayIndexOutOfBounds but these
 * are both RunTimeExceptions
 */
	
	
	
	
	void myMethod()throws IndexOutOfBoundsException{
		
	}
	void myMethod2()throws Exception{
		
	}
	
	void myMethod3()throws RuntimeException{
		
	}
}

class SubClass extends Base{
	/*
	 if you base class method throws a runtimeException
	 your overriding method CANNOT throw a checked
	 exception
	 */
/*	@Override
	void myMethod3()throws Exception{
		
	}*/
	/*
	 * if you base class method throws Any
	 * exception, your overriding method does
	 * NOT HAVE to throw any exception
	 */
	@Override
	void myMethod2(){
		
	}
	/*
	 * comment in and out the Override
	 * annotation to see effect
	 * base class myMethod throws a runtimeException
	 * so the overriding method can throw ANY
	 * runtimeException, even a super class
	 */
	@Override
	void myMethod()throws 
	ArrayIndexOutOfBoundsException{
		
	}
	
	
	
	
}
