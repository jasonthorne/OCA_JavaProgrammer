package com.android;

public class Dog implements Behaviour{

	@Override
	public boolean mad(String myStr) {
		System.out.println("Dog mad method implemented from Behaviour interface");
		return false;
	}

	

}
