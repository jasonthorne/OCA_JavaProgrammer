package com.android;

public class Dog  implements Behaviour{
	
	int age;

	@Override
	public void angry() {
		System.out.println("Dog angry");
		
	}

	@Override
	public void sad() {
		System.out.println("Dog sad");
		
	}
	
	void pants() {
		System.out.println("Dog panting");
	}

}

class Collie extends Dog{
	
	//overridding
	public void sad() {
		System.out.println("Collie sad");
		
	}
}

