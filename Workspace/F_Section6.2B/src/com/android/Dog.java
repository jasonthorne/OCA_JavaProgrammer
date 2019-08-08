package com.android;
/*
 * Dog class does not override the default method agressive() so it takes
 * the agressive method from whichever is a sub interface, which is
 * behaviour2
 */
public class Dog implements Behaviour,Behaviour2{

	@Override
	public void scared() {
		System.out.println("Dog scared");
		
	}

	@Override
	public void joy() {
		System.out.println("dog full of joy");
		
	}

}
