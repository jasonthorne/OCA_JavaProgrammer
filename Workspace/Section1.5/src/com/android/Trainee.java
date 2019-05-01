package com.android;

public class Trainee {
	
	//non statics:
	int age = 33; //every trainee has it's own age
	String pps = "333c"; //every trainee has its own pps
	
	//statics:
	static int courseCode = 333; //static (or class variable) correct way to access is: class name.variable name (Trainee.courseCode)
	
	static String courseAddress = "GRETB GGGGalway";
	
	//We can also access a static variable via a particular trainee (tom.coursCode) but this is NOT recommended.
	
	//All objects share static variable values and if you change one using one object, then they are changed for ALL.
	
	//Static methods can ONLY directly access static variables and static methods.
	static void statMethod() {
		System.out.println("course code is: " + courseCode);
		System.out.println("course code is: " + courseAddress);
		
		//You can't directly access a non static variable inside a static method.
		//System.out.println("age is: " + age); //Doesnt work! 
	}
	
	
	
	

}
