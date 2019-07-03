package com.android;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 
 * Objective 9.5 - Write a simple lambda expression that consumes a lambda predicate expression
 *
 */
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer>intList = new ArrayList<>(); //arraylist of Ints 
		ArrayList<Bird>birdList = new ArrayList<>(); //arraylist of Birds 
		
		Box<Dog>dogBox; //Box class reference accepting a Dog obj 
		Box<Cat>catBox = new Box<>(); //instantiated BOx obj, that takes Cat Objs
		
		Box<Dog>dogBox2 = new Box<>(); //Box class reference accepting a Dog obj 
		
		//-----------------------
		
		//LAMBDAS: ++++++++++++++++++++++++++++++++++++++++++
		
		Dog spot = new Dog(); //dog obj
		spot.bark();
		spot.lambda1(12,56); //abstract method from Behaviour interface
		spot.method1(); //default method from Behaviour interface
		
		
		/*
		 * Do implements Behaviour. so that mens all abstract methods in the Behaviour interface have to be overriden in the Dog class.
		 * So object only have access to the abstract & default methods of the interface Behaviour 
		 * (but we dont care about default methods)
		 */
		Behaviour myBehave = spot; //a Behaviour interface reference to a Dog obj
		Behaviour myBehave2 = new Dog();
		myBehave.lambda1(37,56);
		
		
		
		/*
		 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 * 
		 * 1st rule of lambdas: Lambdas can ONLT be created from interface that have ONLY one abstract method inside them. 
		 * They can have as many default & static methods you like (these wont effect the lambda).
		 * 
		 * 2nd rule:
		 *Lambdas alway start with an interface reference. On the left hand side.
		 *On the right hand side of the assignment opperator (=) we have to put a parameter list enclosed in parenthesis,
		 *which will match the vars in the param list of the abstract method in the interface.
		 *
		 *The abstract method in the Behaviour interface is called lambda 1, which takes 2 ints.
		 *The structure is reference type of left, followed by assignment, followed by param list
		 *which has to be the same as the only abstract method in the Behaviour, which is the method int 
		 */
		
		
		//Longway: 
		
		Behaviour b1 = (int a, int b) -> {
			System.out.println("b1 behaviour lambda1 called");
			int sum=a*b;
			return sum;
		};
		
		System.out.println("b1.lambda1(45,20)" + b1.lambda1(45, 20));
		
		//Short way:
		Behaviour b2 = (a,b) -> a+b;
		
		System.out.println("b2.lambda1(45,20)" + b2.lambda1(45, 20));
		
	
		//one arg:
		//Behaviour b3 = a -> a*2;
		
		
		/*
		 * if you have more than one line of code in the lambda body, then you need curly brackets.
		 * 
		 */
		
		Behaviour b4 = (a,b) -> {
			System.out.println("More than one line of code");
			int sum= a*b;
			return sum;
		};
		
		//---------
		/*
		 * You can also use this object to access the default methods of the Behaviour interface (But not recommended)
		 */
		b4.method1(); // not recommended (just use the lambda var for it's own lambda function)
		b4.method2(); // not recommended (just use the lambda var for it's own lambda function)
		
		//Wont compile as if you have curly brackets you NEED the "return" keyword 
		//Behaviour b5 = (a,b) -> {a*b;};
		
		//does work:
		Behaviour b5 = (a,b) -> {return a*b;};
		
		
		
		//==============================
		System.out.println("");
		takeLam(2,"yo", b1);
		takeLam(2,"dawg", b2);
		takeLam(2,"woo", new Dog());
		takeLam(2,"woo", new Dog());
		Behaviour behaveDog=new Dog();
		takeLam(99,"woo", behaveDog);
		
		
		//=============================
		//ed has an attribute called myBehave which is accessed by: ed.myBehave
		Employee ed = new Employee(40, "Ed", 4, b1); //passing the lambda (to be received in the Behaviour reference)
		
		//edel has an attribute called myBehave which is accessed by: edel.myBehave
		Employee edel = new Employee(40, "Edel", 7, new Dog()); //passing a Dog object (which implements Behaviour)
		
		
		ed.myBehave.lambda1(7, 8); //accessing eds lambda function
		System.out.println(ed.myBehave.lambda1(7, 8));
		
		
		//=============================++++++++++++++++++++++++++++++++++++++
		
		//3 emotion lambdas:
		//each one is overriding the sad method in the Behaviour Interface
		
		Emotion e1 =()-> {
			System.out.println("Sad Emotion e1 called");
		};
		

		Emotion e2 =()-> {
			System.out.println("Sad Emotion e2 called");
		};
		

		Emotion e3 =()-> {
			System.out.println("Sad Emotion e3 called");
		};
		
		
		e1.sad();
		e2.sad();
		e3.sad();
		
		//======================boolean check(Employee emp);=================================
		
		System.out.println("\nlong form validatePerformance:");
		Validate validatePerformance1 = (Employee emp) -> {
			if (emp.getRating()>5) {
				return true;
			}else {
				return false;
			}
		};
		
		
		System.out.println("short form validatePerformance:");
		Validate validatePerformance2 = (emp) -> emp.getRating()>5;
		
		
		System.out.println("Does ed make the standard? (of 5)");
		System.out.println(validatePerformance1.check(ed));
		
		System.out.println("Does edel make the standard? (of 5)");
		System.out.println(validatePerformance2.check(edel));
		
		//=======================================
		
		//Manners interface
		
		Manners<Employee>myMood=(Employee emp) ->{
			System.out.println("lambda of the test function in Manners");
			System.out.println("in the Manners interface that has a generic type T");
			return emp.getRating()>5;
		};
		
		
		System.out.println(myMood.test(ed));
		System.out.println(myMood.test(edel));
		
		
		Manners<String>myMood2 = (str) -> str.length()>6;
		String myStr = "dfdfdfsfdsfdsfdf";
		System.out.println("string larger than 6? " + myMood2.test(myStr));
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		 * This is a lambda that uses a string to implement the Test method in the Manners interface. 
		 * This is the shortened version with only 1 arg, so dont need brackets: 
		 */
		
		Predicate<Employee>predEmployee = (Employee emp) ->{
			System.out.println("Predicate with Employee data tye");
			return emp.getRating()>5;
		};
		
		System.out.println("");
		System.out.println(predEmployee.test(ed));
		System.out.println(predEmployee.test(edel));
		
	}
	
	/*
	 * This is a method that takes an int, String and an object with a Behaviour reference. Which can be:
	 * + An object of a class that implements the Behaviour interface (a Dog)
	 * + A lambda that directly implements the abstract method in the behaviour (b1,b2,b3,b4,b6)
	 * + Or a behaviour reference to an object that implements the behaviour interface.
	 */
	
	static void takeLam(int num, String str, Behaviour myB) {
		System.out.println("String is: " + str);
		System.out.println("number is: " + num);
		System.out.println("product of lambda is: " + myB.lambda1(num, num));
	}
	
	
	
	

}
