package com.gretb;

public class Trainee {
	
	int pps;
	String name;
	int age;
	
	/*
	 Static is what is known as a class variable in that there is only ONE copy of the variable for the whole class. 
	 As opposed to an instance where every object has a pps, name, age, etc.
	 */
	
	//STATIC or CLASS variables:
	static int courseCode = 2367; //all objects will share this same variable. If this is changed anywhere, it will change for all Trainee objects. ++++++++++++++++++
	static String location = "Galway"; //All attendees are attending the course that is in Galway. 
	
	
	static int counter = 0; //counts how many objects are being created

	//constructor for Trainees
	public Trainee(int pps, String name, int age) {
		super();
		this.pps = pps;
		this.name = name;
		this.age = age;
		counter++;
	}
	
	
	//Static method +++++++++++++++++++++++++++++++++
	/*
	 Static method is the same as static variables in that these methods apply to the class and not the individual objects.
	 The riot method below belongs to everyone in the class, you cant access individual attributes of a particular trainee
	 */
	static void riot() { //you can ONLY access static things in this method!
		
		//You cant access instance vars/attributes of an individual trainee in a method that applies to every trainee. 
		//System.out.println("age is " + age); //age can't be accessed here
		System.out.println("courseCode is " + courseCode);
		System.out.println("location is " + location);
		
		//How to access non static vars in a static method:
		Trainee roger = new Trainee(234, "Roger", 34);
		System.out.println(roger.age);
		
		//You can access static methods inside other static methods:
		swarm();
		//learn(); //wont work as not static (each object has their own learn method)
		
	}
	
	static void swarm() {
		System.out.println("We are swarming!");
	}
	
	//REGULAR methods can access BOTH statics and non statics: ++++++++++++++++++++++++
	
	public void learn() {
		
		System.out.println("Non static age is: " + age);
		System.out.println("Static counter is: " + counter);
		riot(); //static method
		swarm(); //non static method
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
