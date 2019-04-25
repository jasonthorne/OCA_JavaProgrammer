package com.gretb;

public class Trainee {
	/*
	 * these are instance variables/atributes, each trainee we create has it's
	 * own pps number, it's own name and it's own age
	 */
	int pps;
	String name;
	int age;
	/*
	 * Static is what is known as a class variable in that there is only 
	 * ONE copy of the variable for the whole class, as opposed to an instance
	 * where every object has a pps, name, age, etc.
	 * if you change the static variables it changes for ALL TRAINEES, as all
	 * trainees share this value (i.e all trainees in this course have the same
	 * course code, all trainees are attending the course that is in Galway)
	 */
	static int courseCode=2367;
	static String location="Galway";
	//constructor for trainees
	/*
	 * this is a constructor that takes an int, string and an int and creates
	 * our trainee.
	 * this also increments a static int called counter. this is a static variable
	 * that will count how many trainees are created. EAch time we create a trainee
	 * the counter will be incremented by one. no static variables belong to any
	 * individual but to the whole class
	 */
	public static int counter=0;
	public Trainee(int pps, String name, int age) {
		super();
		this.pps = pps;
		this.name = name;
		this.age = age;
		counter++;
	}
	/*
	 * static method are the same as static variables in that these methods 
	 * apply to the class and not to individual objects. 
	 * As the riot() method belongs to everyone in the class, you can't access
	 * individual atributes of a of a particular trainee. 
	 * in other words, you can't access instance variables in a static method
	 */
	static void riot() {
		/*
		 * you can't access instance variables/atributes of an individual trainee
		 * in a method that applies to every trainee. age is a an atribute of
		 * an individual trainee
		 */
	//	System.out.println("age is "+age);//cannot access
	//	System.out.println("name is "+name);//cannot access
	//	System.out.println("pps is "+pps);//cannot access
		System.out.println("this is the static riot method");
		System.out.println("static course code is "+courseCode);
		System.out.println("static location is "+location);
		System.out.println("static counter is "+counter);
		/*
		 * if we want to access an instance variable inside a static method, we 
		 * first have to create a trainee, then access the age of that trainee
		 */
		Trainee roger=new Trainee(2345,"Roger",34);
		/*
		 * local variables can't be statics
		 */
		//static int num;
		/*
		 * you can access static methods directly inside other static methos
		 */
		swarm();
		/*
		 * this is an instance  method, each trainee has they're own learn method
		 * you can't access non static methods directly inside a static method
		 */
	//	learn();
	}
	
	static void swarm() {
		System.out.println("we are swarming");
	}
	/*
	 * instance methods, can access both statics and non statics
	 */
	void learn() {
		System.out.println("non static age is "+age);
		System.out.println("static counter is "+counter);
		riot();//static method called
		swarm();//static method called
		eat();//non static method called
	}
	
	void eat() {
		System.out.println("trainee eating");
	}
	
	

}
