package com.gretb;

public class Statics {
	public static int statInt=23;
	private Statics(){
		
	}
	
	static void accessMe(){
		System.out.println("static accessMe");
	}
	
	public static void publicAccess(){
		System.out.println("static publicAccess");
	}
	
	void eat(){
		
	}

}
