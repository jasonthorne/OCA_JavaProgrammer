package com.android;

public class Animal {
	/*
	 * an overriding method CANNOT throw a super class exception
	 */
	Animal(){
		System.out.println("Animal Constructor");
	}
	void eat()throws Exception{
		System.out.println("Animal eat method");
	}
}
class Dog extends Animal{
	/*
	 * when you are overriding a method that "throws" any exception, the
	 * overriding method can throw the same exception class or a subclass
	 * of that exception class
	 */
	void eat()throws RuntimeException{
		System.out.println("dog eat that throws runtimeException");
	}
	Dog(){
		System.out.println("Dog consructor");
	}
}
class Collie extends Dog{
	Collie(){
		System.out.println("Collie constructor");
	}
	/*
	 * the eat()throws RuntimeException{} in the Dog class means that
	 * this overriding method can only "throws" the same exception or 
	 * a subclass of it, Exception is a super class of RutimeException
	 * so this will NOT COMPILE
	 */
	void eat()throws ClassCastException{
		System.out.println("Collie eat that thrwos ClassCastException");
	}
}

class BorderCollie extends Collie{
	BorderCollie(){
		System.out.println("BorderCollie constructor");
	}
	/*
	when you are overriding a method that throws any type of exception the
	overriding method does NOT HAVE TO throw any exception at all, as Java
	treats a method that throws no exception as a subclass of exception
	 */
	void eat() {
		
	}
}
