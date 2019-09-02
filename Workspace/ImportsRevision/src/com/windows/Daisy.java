package com.windows;

public class Daisy {
	
	public static int daisyCounter; //public, so everyone can access
	
	static {
		System.out.println("these will run onyl ONCE");
	}
	
	{
		System.out.println("these wil run everytime we create a daisy");
	}

	Daisy(){
		daisyCounter++;
		System.out.println("ammount of daiys created: " + daisyCounter);
		
	}
	
	public void grow() {
		
	}
	
	public void pollinate() {
		
	}
}
