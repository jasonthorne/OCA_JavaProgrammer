package com.windows.microsoft;

public class Tower {
	
	public static int floorNumber;
	
	public double height;
	
	public double area; 
	
	public static void build() {
		System.out.println("static tower build method");
	}
	
	public void liveIn() {
		System.out.println("people liveIn a tower");
	}
	
	static void knockDown() {
		System.out.println("static knockDown tower method");
	}
	
	

}
