package com.gretb;

public class Soldier implements Movement{
	
	//soldier's own vars:
	int age=23;
	String name= "Sammy";
	
	//=========================
	//soldier's own methods:
	void fight() {
		System.out.println("Soldier fighting");
	}
	
	void shoot() {
		System.out.println("Soldier shooting");
	}
	
	//=========================

	
	@Override
	public void walk() {
		System.out.println("Soldier walking");
		
	}

	@Override
	public void run() {
		System.out.println("Soldier running");
		
	}

	@Override
	public void fly() {
		System.out.println("Soldier flying");
		
	}

	@Override
	public void swim() {
		System.out.println("Soldier swimming");
		
	}

	@Override
	public void jump() {
		System.out.println("Soldier jumping");
		
	}
	
	

	
	
}
