package com.gretb;

//PASS BY VALUE and PASS BY REFERENCE

//All primitive variables are passed by value
//All objects are passed by reference

public class Examples {
	
	static void ex1() {
		
		// +++++++++++++++ PASS BY VALUE +++++++++++++++
		
		//Primitives are passed to methods by value *******
		
		//initial values of PRIMITIVE vars:
		int num=4;
		double dNum=4.5;
		
		System.out.println("num before method call: " + num);
		System.out.println("dNum before method call: " + dNum);
		
		byValue(num, dNum); //these vars are PASSED BY VALUE.
		
		System.out.println("\nnum after method call: " + num);
		System.out.println("dNum after method call: " + dNum);
		
	}
	
	static void byValue(int num, double dNum) {
		num=num*2;
		dNum=dNum*10;
		
		System.out.println("\nnum inside method is: " + num);
		System.out.println("dNum inside method is: " + dNum);
	}
	
	
	static void ex2() {
	
		// +++++++++++++++ PASS BY REFERENCE +++++++++++++++
		
		//Objects are passed to methods by reference *******
		
		Dog spot = new Dog(); //make a dog with default instance vars (age = 10, name= "Andy")
		
		//change values of instance vars:
		spot.name="Spot";
		spot.age=50;
		
		System.out.println("\nDog name before method call: " + spot.name);
		System.out.println("Dog age before method call: " + spot.age);
		byReference1(spot);
		System.out.println("\nDog name after 'byReference1' method call: " + spot.name);
		System.out.println("Dog age after 'byReference1' method call: " + spot.age);
		
		byReference2(spot);
		System.out.println("\nDog name after 'byReference2' method call: " + spot.name);
		
	}
	
	private static void byReference1(Dog dog) {
		dog = new Dog(); //changing the Dogs reference, thereby breaking its original link.
		System.out.println("\nInside method, name is: " + dog.name);
		System.out.println("Inside method, age is: " + dog.age);
	}
	
	private static void byReference2(Dog dog) {
		dog.name="Rex";
	}
	
	
}
