package com.android;

import java.util.ArrayList;

public class Cat {
	int age;
	String name;
	final int id;
	static int counter=0;
	public ArrayList<Cat>litter;
	
	Cat(int age,String name){
		this.age=age;
		this.name=name;
		counter++;
		id=counter;
	}
	
	Cat(){
		counter++;
		id=counter;
	}

	@Override
	public String toString() {
		return "Cat "+id+" age is " + age + ", name is " + name;
	}
	
	void eat() {
		System.out.println(name +" cat name is eating");
	}
	
	
	

}
