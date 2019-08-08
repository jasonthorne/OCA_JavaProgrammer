package com.android;

import java.util.concurrent.SynchronousQueue;

public class Athlete implements Behaviour{

	final int finalInt=1000;
	@Override
	public void sad() {
		System.out.println("Athlete sad");
		System.out.println("finalINt is "+finalInt);//1000
		//the finalInt in this class is "shadowing" the finalINt
		//in the Behaviour interface, but we can access it in a
		//static way, class name followed by variable name
		System.out.println("finaINt in Behaviour "+Behaviour.finalInt);
		
	}
	@Override
	public void angry() {
		System.out.println("Athlete angry");	
	}
	@Override
	public void happy() {
		System.out.println("Athlete happy");
	}
	/*
	 * you can't override a static method, this is just a different
	 * static method that has the same method signature as the 
	 * statMethod() method in the Behaviour interface
	 */
	//@Override
	static void statMethod() {
		System.out.println("Athlete Statmethod called");
	}

}
