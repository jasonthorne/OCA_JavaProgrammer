package com.android;

/*
 * Multiple inheritence is not allowed in java. However a class can implement from as many interfaces as you want.
 * Here the duck class implements 2 interfaces: Fly & swim:
 */

public class Duck implements Swim, Fly{

	@Override
	public void launch() {
		System.out.println("Duck launching");
		
	}

	@Override
	public void glide() {
		System.out.println("Duck gliding");
		
	}

	@Override
	public void land() {
		System.out.println("Duck landing");
		
	}

	@Override
	public void findWater() {
		System.out.println("Duck findingWater");
		
	}

	@Override
	public void paddle() {
		System.out.println("Duck paddling");
		
	}
	
	

}
