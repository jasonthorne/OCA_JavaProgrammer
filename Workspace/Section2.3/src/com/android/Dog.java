package com.android;

public class Dog {
	
	static int counter=1;
	int age=45;
	double weight = 12.34;
	
	//every dog will have a unique ID. which needs an initial value to a final or we get a compilation error.
	final int dogId;
	
	public Dog(){
		
		dogId = counter;
		counter++; //increments every-time constructor called
	}

}
