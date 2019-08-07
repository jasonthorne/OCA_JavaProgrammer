package com.android;

public class Cat {
	int age;
	String name;
	
	Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "cat age is "+age+" name is "+name;
	}

}
