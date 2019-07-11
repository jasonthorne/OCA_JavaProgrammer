package com.noel;

public class Animal implements Behaviour {
	
	
	static void pack(){
		System.out.println("Animal pack");
		
	}

	@Override
	public void drink() {
		System.out.println("drink animal");
		
	}
	

}

class Dog extends Animal{
	//you can't override a static method
	//@Override
	static void pack(){
		System.out.println("Dog pack");
	}
}
