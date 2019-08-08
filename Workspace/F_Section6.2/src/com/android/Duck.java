package com.android;
/*
 * multiple inheritances is NOT ALLOWED in java, However a class 
 * can implement as many interfaces as you want. Here the Duck
 * class implments two interfaces Fly and Swim, simply because a
 * Duck can do both
 */
public class Duck implements Swim,Fly{
	int age=5;
/*
the methods launch(), glide() and land() are all abstract methods
in the Fly interface, so Duck class has to implement them
 */
	@Override
	public void launch() {
		System.out.println("Duck launching");
		
	}

	@Override
	public void glide() {
		System.out.println("Duck Gliding");
		
	}

	@Override
	public void land() {
		System.out.println("Duck landing");
		
	}
/*
 * the methods paddle() and findWater() are both abstract methods from
 * the Swim interface and Duck implements Swim so it has to override
 * paddle() and findWater();
 */
	@Override
	public void paddle() {
		System.out.println("Duck paddling");
		
	}

	@Override
	public void findWater() {
		System.out.println("Duck finding water");
		
	}

}
