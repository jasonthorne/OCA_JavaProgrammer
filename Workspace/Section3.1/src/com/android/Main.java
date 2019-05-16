package com.android;

public class Main {

	public static void main(String[] args) {
		Examples.test();
		
		Local local1 = new Local();
		///local1.accessLocal(4);
		
		Local local2 = new Local();
		
		local1.address="Dublin";
		local2.address="Cork";
		
		System.out.println("Address for myLocal1 is: " + local1.address);
		System.out.println("Address for myLocal2 is: " + local2.address);
		
		
		 // Accessing a static attribute in a NON STATIC way. Which is through the object of a class 9which is NOT RECOMMENDED!):
		System.out.println(local1.courseId);
		System.out.println(local2.courseId);
		
		
		//Static vars should be accessed in a STATIC WAY:
		System.out.println("accessing in a static way: " + Local.courseId);
		
		Pupil.takeCourse();
		
		Phone phone = new Phone();
		phone.dialUp(3);
	}

}
