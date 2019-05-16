package com.android;

public class Pupil {
	
	String name;
	int age;
	static int courseId=3456;
	
	Pupil(String name, int age){
		this.age=age;
		this.name=name;
	}
	
	void eat() {
		//accessing static and non static attributes inside this non static method
		System.out.println("name is: " + name + "age is: " + age + "courseid is: " + courseId);
	}
	
	static void takeCourse() {
		System.out.println("courseid is: " + courseId);
	}
	
	

}
