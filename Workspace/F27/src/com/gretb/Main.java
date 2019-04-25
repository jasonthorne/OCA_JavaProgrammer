package com.gretb;
/**
 * Statics 
 * @author noelf
 *
 */
public class Main {

	int mainNum=56;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before we create Trainees counter is "+Trainee.counter);
		Trainee terry=new Trainee(23435,"terry",23);
		System.out.println("after terry created counter is "+Trainee.counter);
		Trainee mary=new Trainee(3499,"mary",67);
		System.out.println("after mary created counter is "+Trainee.counter);
		Trainee patsy=new Trainee(7788,"patsy",51);
		System.out.println("after patsy created counter is "+Trainee.counter);
		/*
		 * can't access non statics in a static method
		 */
	//	System.out.println(mainNum);
		
		System.out.println(mary.counter);
		System.out.println(patsy.counter);
		System.out.println(terry.counter);
		/*
		 * each of the trainees has it's OWN name
		 */
		System.out.println(terry.name);//terry
		System.out.println(mary.name);//mary
		System.out.println(patsy.name);//patsy
		/*
		 * the trainees SHARE the variable courseCode
		 * only one copy of this variable as it is a static variable
		 */
		System.out.println(terry.courseCode);
		System.out.println(mary.courseCode);
		System.out.println(patsy.courseCode);
		/*
		 * if patsy changes the course code, the course code is changed for 
		 * EVERYONE
		 */
		patsy.courseCode=2222;
		/*
		 * we accessing a static variable in a non static way (we're using
		 * a trainee object to gain access to the static variable courseCode,
		 * which is not recommended
		 */
		System.out.println(terry.courseCode);
		System.out.println(mary.courseCode);
		System.out.println(patsy.courseCode);
		/*
		 * this is accessing a static variable in a static way. which is always
		 * the name of the class. followed by the static variable or method.
		 * static variables are also called CLASS variables.
		 * this is how you should normally access statics
		 */
		System.out.println("accessing static location of course "+Trainee.location);
		
		System.out.println("we have create "+Trainee.counter);
		/*
		 * this calling a static method in a static way. the class name followed
		 * by the method name
		 */
		Trainee.riot();
		/*
		 * this is calling a static method in a non static way, which is through
		 * a trainee object called terry, this is NOT RECOMMENDED
		 */
		terry.riot();
		/*
		 * you do not have to create a Maths object to call the static methods
		 * add() and multiply. In fact you can have a class with nothing in it
		 * but static methods and never create an object of that class and you 
		 * use these, what are called, utility methods
		 */
		Maths.add(3, 45);
		Maths.multiply(56, 345);
		/*
		 * we can have a class with nothing in it but static methods
		 * which we can call at any time in our program but just going
		 * name of class.name of static method. if they are public
		 * they can be accessed from other packages and files
		 */
		com.gretb.Maths.add(23, 56);
	}

}
