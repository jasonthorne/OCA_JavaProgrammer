package com.android;

public class Pupil {
	
	String name;
	int age;
	static int courseId=3456;
	Pupil(String name,int age){
		this.age=age;
		this.name=name;
	}
	//instance method
	void eat() {
		/*
		 * accessing static and non static atributes inside this 
		 * non static method
		 */
		System.out.println("name is "+name+" age is "+age+" course id is "
				+courseId);
	}//end of method
	
	static void takeCourse() {
		System.out.println("we are taking the course with id of "+courseId);
		//System.out.println(name);
	}

}
