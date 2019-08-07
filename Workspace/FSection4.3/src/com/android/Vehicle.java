package com.android;

public class Vehicle {
	int age=5;
	void move() {
		System.out.println("Vehicle moving");
	}

}//end of vehicle class

class Car extends Vehicle{
	int mpg;
	void move() {
		System.out.println("car moves by driving");
	}
	void drive() {
		System.out.println("car driving");
	}
}

class Ford extends Car{
	
}

class Boat extends Vehicle{
	int propellerAmt;
	
	void move() {
		System.out.println("A boat moving");
	}
	void floating() {
		System.out.println("Boat Floating");
	}
}

class Bike extends Vehicle{
	boolean type;
	int age=12;
	
	void move() {
		System.out.println("I move by cycling");
	}
	
	void cycle() {
		System.out.println("cycle me");
	}
}


