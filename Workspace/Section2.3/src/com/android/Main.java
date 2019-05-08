package com.android;

/**
 * 
 * Exam objective 2.1. - Declare and initialize variables (including casting of primitive data types)
 * 
 * Exam objective 2.2. - Differentiate between object
 *
 */

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Every-time we create a dog, we are implementing the static counter var by 1.
		 * This counter var is assigned to be the dogId of each Dog. 
		 * That means every new Dog we create will have a unique id.
		*/
		
		Dog spot = new Dog(); //dogId is 1
		Dog rex = new Dog(); //dogId is 2
		Dog lassie = new Dog(); //dogId is 3
		
		//3 dogs are created at this point, so counter is sitting at 4.
		
		System.out.println("Id of spot " + spot.dogId);
		System.out.println("Id of rex " + rex.dogId); 
		System.out.println("Id of lassie " + lassie.dogId);

	}

}
