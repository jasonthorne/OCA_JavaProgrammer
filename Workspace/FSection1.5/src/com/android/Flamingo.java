package com.android;

public class Flamingo implements Behaviour{
	
	void fly() {
		
	}

	@Override
	public void jealous() {
		System.out.println("flamingo jealous");
		
	}

	@Override
	public int anger(double dnum, char myChar) {
		System.out.println("flamingo angry");
		return 0;
	}

	@Override
	public void joy() {
		System.out.println("flamingo full of joy");
		
	}

	@Override
	public void euphoria() {
		System.out.println("flamingo euphoric");
		
	}
	/*
	 * here we choose to override the default nervous method of the
	 * Behaviour interface, but we don't have too
	 */
	@Override
	public void nervous() {
		System.out.println("Flamingo nervous");
	}
	
	static void flock() {
		System.out.println("flamingo flocking");
	}

}
