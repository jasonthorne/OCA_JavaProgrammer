package com.android;

public class Flamingo implements Behaviour {

	@Override
	public void jealous() {
		System.out.println("Flamingo jealous");
		
	}

	@Override
	public int anger(double aDouble, char myChar) {
		System.out.println("Flamingo anger");
		return 0;
	}

	@Override
	public void joy() {
		System.out.println("Flamingo joy");
		
	}

	@Override
	public void euphoria() {
		System.out.println("Flamingo euphoria");
		
	}
	
	//Here we are choosing to override the default nervous method from the Behaviour interface: ++++++++++++++++++++++
	
	@Override //this checks if you ARE overriding. (it will give an error if not)
	public void nervous() {
		System.out.println("Flamingo nervous");
	}
	

}
