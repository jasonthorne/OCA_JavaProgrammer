package com.android;

/**
 * 
 * Exam Objective 2.3 - Know how to read or write to object fields
 * 
 * 
 *Exam Objective 3.7 - Apply encapsulation principles to  class
 */

public class Main {

	public static void main(String[] args) {
		
		//creating a Dog and setting the age and name using a constructor:
		Dog spot = new Dog(5, "Spot");
		
		System.out.println("age of dog: " + spot.age + ". name of dog: " + spot.name);
		
		Cat tibbles = new Cat(4, "tibbles");
		
		//accessing the Cat vars through getters:
		System.out.println("age of cat: " + tibbles.getAge() + ". name of cat: " + tibbles.getName());
	
	}

}
