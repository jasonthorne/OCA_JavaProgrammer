package com.android;

public class Dog {
	int age=3;
	String name="spot";
	static int counter=0;
	//id to  uniquely identify a dog
	final int id;
	
	Dog(){
		counter++;
		id=counter;
	}

}
