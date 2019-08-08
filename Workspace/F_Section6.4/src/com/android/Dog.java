package com.android;

public class Dog implements Behaviour{
	
	int age=4;

	@Override
	public void angry() {
		System.out.println("Dog angry");
		
	}

	@Override
	public void sad() {
		System.out.println("Dog sad");
		
	}
	
	//own method
	void pants() {
		System.out.println("Dog panting");
	}

}

class Collie extends Dog{
	@Override
	public void sad() {
		System.out.println("collie sad");
	}
}
