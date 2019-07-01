package com.android;

import java.util.ArrayList;

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
		Behaviour b2 = (a,b) -> a*b;
		
		System.out.println("b2.lambda1(45,20)" + b2.lambda1(45, 20));
	}
	
	
	
	

}
