package com.android;

public interface Mood {
	
	void angry();
	
	default void happy() {
		System.out.println("happy in mood i am");
	}

}

interface Mood2{
	void sad();
	
	default void happy() {
		System.out.println("happy in mood 2 interface");
	}
}
