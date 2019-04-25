package com.gretb;

public class Soilder implements Movement{
	/*
	 * these are the Soilder's own variables they are not inherited from 
	 * any class or got from an interface. all sub classes of soilder can
	 * access all of these methods and variables, and they can choose to
	 * override them or not.
	 */
	int age=23;
	String name="sammy";

	@Override
	public void walk() {
		System.out.println("soilder walking");
		
	}

	@Override
	public void run() {
		System.out.println("soilder running");
		
	}

	@Override
	public void fly() {
		System.out.println("soldier flying");
		
	}

	@Override
	public void swim() {
		System.out.println("solidier swimming");
		
	}

	@Override
	public void jump() {
		System.out.println("soldier jumping");
		
	}

	@Override
	public void hop() {
		System.out.println("soldier hopping");
		
	}
	/*
	 * only soldiers and sub classes of soldiers will have access to these
	 * methods. also important to note that these are for soldiers and soldiers
	 * only, they did not inherit or get them from an interface
	 */
	void fight() {
		System.out.println("soldier fighting");
	}
	
	void shoot() {
		System.out.println("soldier shooting");
	}

}
