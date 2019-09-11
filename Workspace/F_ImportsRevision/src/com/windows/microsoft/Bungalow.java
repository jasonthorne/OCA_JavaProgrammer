package com.windows.microsoft;

public class Bungalow {
	public static int bungalowNumber;
	
	public double height;
	
	public double area;
	
	public static void build() {
		System.out.println("static bungalow build method");
	}
	
	public void liveIn() {
		System.out.println("People liveIn a bungalow");
	}
	
	static void knockDown() {
		System.out.println("static knockDown bungalow method");
	}

}
