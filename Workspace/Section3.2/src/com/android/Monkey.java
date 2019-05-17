package com.android;

public class Monkey {
	
	static int counter = 1; //counts how many Person objects are created.
	int id;
	
	//constructor
	Monkey(){
		id=counter;
		counter++;
	}
	
	

}
