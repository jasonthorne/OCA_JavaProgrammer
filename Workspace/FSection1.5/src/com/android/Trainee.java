package com.android;

import java.util.concurrent.SynchronousQueue;

public class Trainee {
	
	static class StatClass{
		
	}
	
	class Heart{
		
	}
	
	static interface Movment{
		
	}
	/*
	 * every trainee is going to have an age, this is they're OWN age
	 * so if you have 20 trainees, you will have 20 ages
	 */
	int age=56;
	//every trainee will have they're own pps
	String pps="9999999A";
	/*
	 * these are static varialbes, also called class variables. The correct
	 * way to access a class variables is the class name followed by teh 
	 * variable name
	 * i.e Trainee.courseCode or Trainee.couseAddress. We can also
	 * access a static variable via a particular trainee
	 * i.e we have a trainee called tom, we could go
	 * tom.courseCode and tom.courseAddress, but this is NOT recommended.
	 * A static variable is shared by all members of the class. ie.
	 * all trainees have the same courseCode, all trainees have the same
	 * courseAddress.
	 * if you change the courseCode, you change the courseCode for everyone
	 */
	static int courseCode=12665;
	static String courseAddress="GRETB Mervue";
	/*
	 * static methods can only directly access static variables and other
	 * static methods
	 */
	static void statMethod() {
		/*
		 * these are both static variables so we can access them directly
		 * in a static method
		 */
		System.out.println("course code is "+courseCode);
		System.out.println("address is "+courseAddress);
		/*
		 * you can't access directly a instance atributes/non static 
		 * variables inside a static method
		 */
		//age applies to ONE trainee, statics apply to everyone and there
		//is only one for all of the trainess, whereas every trainee has an age
		//System.out.println("age is "+age);//unable to access non static variable
		//System.out.println(pps);//unable to access non static variable
		/*
		 * here you are accessing the age and pps of an individual trainee
		 * this is the only way you can access age and pps in a static 
		 * method
		 */
		Trainee terry=new Trainee();
		System.out.println("age of trainee is "+terry.age);
		System.out.println("pps of Trainee is "+terry.pps);
	}
	/*
	 * ordinary instance methods can access both statics and non
	 * statics
	 */
	void ordMethod() {
		//accessing static variable
		System.out.println("accessing static courseCode "+courseCode);
		//accessing instance variable
		System.out.println("access instance variable age "+age);
	}

}

class Graduate extends Trainee{
	
	void study() {
		
	}
	void ordMethod() {
		System.out.println("graduate ordMethod");
	}
}
