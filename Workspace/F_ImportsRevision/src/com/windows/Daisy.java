package com.windows;

public class Daisy {

	public static int daisyCounter;
	
	static {
		System.out.println("these will run only once");
	}
	
	{
		System.out.println("these will run only when we create a Daisy");
	}
	
	Daisy(){
		daisyCounter++;
		System.out.println("amount of daisies created "+daisyCounter);
	}
	
	public void grow() {
		
	}
	
	void pollinate() {
		
	}
}
