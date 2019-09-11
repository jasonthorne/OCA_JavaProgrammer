package com.unix;

public class Ape {
	public static int apeCounter;
	protected static int statInt;
	static {
		System.out.println("static Ape initialiser run");
	}
	
/*	public Ape(){
		apeCounter++;
	}*/
	
	public static void gather() {
		System.out.println("Ape Gathering ");
	}
	
	public void eat() {
		System.out.println("Ape Eating");
	}
	static void fight() {
		System.out.println("Apes fighting");
	}

}
