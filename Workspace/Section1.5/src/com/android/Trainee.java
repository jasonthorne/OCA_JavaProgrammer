package com.android;

public class Trainee {
	
	//non statics:
	int age = 33; //every trainee has it's own age
	String pps = "333c"; //every trainee has its own pps
	
	//statics:
	static int courseCode = 333; //static (or class variable) correct way to access is: class name.variable name (Trainee.courseCode)
	
	static String courseAddress = "GRETB GGGGalway";
	
	//We can also access a static variable via a particular trainee (tom.courseCode) but this is NOT recommended.
	
	//All objects share static variable values and if you change one using one object, then they are changed for ALL.
	
	//Static methods can ONLY directly access static variables and static methods.
	static void statMethod() {
		System.out.println("course code is: " + courseCode); //static courseCode
		System.out.println("course code is: " + courseAddress); //static courseAddress
		
		//You can't directly access a non static variable inside a static method:
		//System.out.println("age is: " + age); //Doesnt work! 
		
		//accessing the age of an individual Trainee created within a static method. 
		//THis is the only way you can access a non static var in a static method.
		Trainee terry = new Trainee();
		System.out.println("age of terry is: " + terry.age); 
	}
	
	
	//ordinary methods can access both statics and non statics:
	void ordinaryMethod(){
		
		System.out.println("accessing static 'courseCode':" + courseCode); //static var
		System.out.println("accessing instance variable 'age':" + age); //non static var
	}
	
	

}
