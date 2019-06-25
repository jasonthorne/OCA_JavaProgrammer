package com.android;

public class Dog implements Behaviour, Behaviour2{

	@Override
	public void scared() {
		System.out.println("Dog scared");
		
	}

	@Override
	public void joy() {
		System.out.println("Dog joy");
		
	}
	
	

}
