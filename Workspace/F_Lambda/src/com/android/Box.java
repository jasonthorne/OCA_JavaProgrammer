package com.android;

public class Box <T>{
	T myT;
	/*
	 * this constructor takes an object of whatever type we have made
	 * <T> out to be. so if we create a Box with a Dog, this T will
	 * be a dog, if we create a Box with a STring, the T will be 
	 * type String, Integer type T, etc
	 */
	Box(T myT){
		this.myT=myT;
	}
	//methods can now use type T
	void makeMe(T myT) {
		
	}
}
