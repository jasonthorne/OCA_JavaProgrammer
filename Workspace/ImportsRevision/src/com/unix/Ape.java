package com.unix;

public class Ape {
	
	public static int apeCounter;
	
	static {
		System.out.println("static Ape initialiser run");
	}
	
	public Ape(){
		apeCounter++;
	}
	
	public static void gather() {
		System.out.println("Ape gathering");
	}
	
	public void eat() {
		System.out.println("Ape eating");
	}
	
	static void fight() { ///////////////////////////NOT public, so no access if you statically import this class.
		System.out.println("Apes fighting");
	}
	
	

}
