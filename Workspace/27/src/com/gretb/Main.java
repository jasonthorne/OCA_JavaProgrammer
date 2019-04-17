package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		Trainee terry = new Trainee(245, "Terry", 33);
		Trainee bob = new Trainee(300, "Bob", 50);
		Trainee jimmy = new Trainee(105, "Jimmy", 40);
		
		System.out.println(terry.name);
		System.out.println(bob.name);
		System.out.println(jimmy.name);
		
		//the same, as they all share this static (or CLASS) variable:
		System.out.println(terry.courseCode);
		System.out.println(bob.courseCode);
		System.out.println(jimmy.courseCode);
		
		jimmy.courseCode = 4; //change this static var. (Accessing a static variable in a non static way. NOT recommended.) +++++++++
		System.out.println("Bob's course code: " + bob.courseCode); //all other objects have new value
		
		//accessing static variable in a static way: Name of the class, followed by the static variable or method. This is the RIGHT way to access a static +++++++++
		System.out.println("accessing static location of course: " + Trainee.location); 
		
		//accessing the static counter:
		System.out.println("counter: " + Trainee.counter); //referenced by the Class, NOT an any instance of that class (eg: terry.counter)
		
		Trainee.riot(); //calling a static method in the RIGHT way. (Class name followed by method name).
		
		//You dont have to create an instance of Maths class to call the static methods add() and multiply() //+++++++++++++++++++
		Maths.add(2,3);
		Maths.multiply(56,345);
	}

}
