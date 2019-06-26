package com.android;

public class Cat implements Behaviour {

	@Override
	public void angry() {
		System.out.println("cat angry");
		
	}

	@Override
	public void sad() {
		System.out.println("cat sad");
		
	}
	
	void purr() {
		System.out.println("cat purring");
	}

}
