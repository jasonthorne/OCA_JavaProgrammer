package com.android;

public class Dog implements Behaviour{

	@Override
	public boolean mad(String myStr) {
		System.out.println("Dog mad method implemented from behaviour "
				+ "interface");
		return false;
	}
	/*
	 * overloaded method mad, nothing to do with the OVERRIDEN method
	 * from the Behaviour interface, differenet parameter list so this
	 * is a different overloaded method
	 */
	public boolean mad(int myStr) {
		return true;
	}

}
