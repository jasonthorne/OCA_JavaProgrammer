package com.windows.microsoft;

import java.util.concurrent.SynchronousQueue;

public class Tower {
	
	public static int floorNumber;
	
	public double height;
	
	public double area;
	
	public static void build() {
		System.out.println("static tower build method");
	}
	
	public void liveIn() {
		System.out.println("People liveIn a tower");
	}
	
	static void knockDown() {
		System.out.println("static tower knockDown method");
	}
	

}
