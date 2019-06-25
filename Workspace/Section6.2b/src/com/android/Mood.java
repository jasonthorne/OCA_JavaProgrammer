package com.android;

public interface Mood {
	
	void angry();
	
	default void happy() {
		System.out.println("happy in mood I am");
	}
	

}

interface Mood2{
	void sad();
	
	default void happy() {
		System.out.println("happy in Mood2 interface");
	}
}

