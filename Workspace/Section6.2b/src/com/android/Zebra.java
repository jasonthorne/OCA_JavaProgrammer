package com.android;

public class Zebra implements Mood, Mood2{

	
	@Override
	public void sad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void angry() {
		// TODO Auto-generated method stub
		
	}

	
	/*If two unrelated interfaces have 2 default methods with the same method signiatures, and a class implements both of these interfaces
	 * then the class does not know which of these methods to override. So the implementing class HAS TO override that method:
	*/
	
	@Override
	public void happy() {
		System.out.println("Zebra happy");
	}


}
