package com.gretb;

/*
 * a overriden method does not have to throw any 
 * exception, even if the method it is overriding
 * throws a checked or runtime exception. 
 * as java treats no exception as a sub class
 * of exception in this case
 */
public class Animal {
	void eat()throws Throwable{
		System.out.println("Animal Eat");		
	}
	void drink()throws NullPointerException{
		System.out.println("Animal drink");	
	}
}

class Dog extends Animal{
	@Override
	void eat(){
		System.out.println("overriden dog eat method ");
	}
	/*
	 * this method can only throw no exception
	 * or a NullPointer exception, it CANNOT
	 * throw a Exception as exception is 
	 * a super class of NullPointer exception.
	 * there is no subclass of NullPointer.
	 * a overriden method cannot throw a
	 * super class exception
	 */
/*	@Override
	void drink()throws Exception{
		System.out.println("overriden dog drink method");
	}	*/
}
