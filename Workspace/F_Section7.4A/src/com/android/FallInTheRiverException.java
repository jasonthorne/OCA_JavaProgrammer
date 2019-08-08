package com.android;
/*
 * this class now inherits from the exception class, which means that
 * this class produces an object that is a CHECKED exception. If 
 * you create an object of this class you are creating a checked 
 * exception
 * when someone falls in the water, this exception is generated
 */
public class FallInTheRiverException extends Exception{
/*
 * when this exception is generated the message "get out of the 
 * water you fool" is printed to screen
 */
	public FallInTheRiverException() {
		System.out.println("get out of the water you fool");
	}
}
/*
 * this class extends Exception which means also this is a CHECKED
 * exception
 * when an oar is dropped, this exception is generated
 */
class DropOarException extends Exception{
	/*
	 * when this exception is generated the message 
	 * "pick up your oar" will be printed to screen
	 */
	public DropOarException() {
		System.out.println("pick up your oar");
	}
	/*
	 * here we are creating a DropOarException that takes a string
	 * that will be the message the is generated when this exception
	 * is created.
	 * this in turn calls the constructor in the Super class, which
	 * is exception, which takes a String. There is a constructor in 
	 * the Exception class that takes a String
	 */
	public DropOarException(String message) {
		/*
		 * calling super class Exception constructor that takes a
		 * String		
		 */
		super(message);
		System.out.println("pick up your oar");
	}
}
