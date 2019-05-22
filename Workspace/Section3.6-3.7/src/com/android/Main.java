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
		
		//accessing the private Cat vars through public getters:
		System.out.println("age of cat: " + tibbles.getAge() + ". name of cat: " + tibbles.getName());
		
		Zebra zed = new Zebra();
		zed.setAge(4); //setting the private age of the Zebra with a public setter method.
		zed.setName("Zed"); //setting the private name of the Zebra with a public setter method.
		
		//accessing the private Zebra vars through public getters:
		System.out.println("age of Zebra: " + zed.getAge() + ". name of Zebra: " + zed.getName());
	
	}

}
