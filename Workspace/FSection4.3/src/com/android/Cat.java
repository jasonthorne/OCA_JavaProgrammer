package com.android;

import java.util.concurrent.SynchronousQueue;

public class Cat {
	int age;
	String name;
	public Cat(int age, String name) {
		this.age = age;
		this.name = name;
	}
	//eat method
	void eat() {
		System.out.println(name+" is a cat eating");
	}
	
	void drink() {
		System.out.println(name+" is a cat drinking");
	}
	

}
