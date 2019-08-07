package com.android;

public class Dog {
	int age;
	String name;
	static int counter=0;
	final int id;
	Dog(int age,String name){
		this.age=age;
		this.name=name;
		counter++;
		id=counter;
	}
	

}
