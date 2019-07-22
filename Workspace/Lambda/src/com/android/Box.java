package com.android;

public class Box <T>{
	
	T myT;

	//this constructor takes an object of whatever type we have made T out to be:
	public Box(T myT) {
		this.myT = myT; //assign myT to be the type of what was passed to Box
	}
	
	
	//a method that takes type T:
	void makeMe(T myT) {
		//do stuff
	}

	
	
}
