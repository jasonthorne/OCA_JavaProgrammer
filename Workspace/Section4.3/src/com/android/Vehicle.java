package com.android;

public class Vehicle {
	
	int age = 5;
	
	void move() {
		System.out.println("Vehicle moving");
	}
	
}

class Car extends Vehicle{
	int mpg;
	
	void move() {
		System.out.println("Car moves by driving");
	}
	
	void drive() {
		System.out.println("Car driving");
	}
}

class Ford extends Car {
	
}

class Boat extends Vehicle{
	int propAmmount;
	
	void move() {
		System.out.println("Boat moving");
	}
	
	void floating() {
		System.out.println("Boat floating");
	}
	
}


class Bike extends Vehicle{
	boolean type;
	int age=12;
	
	void move() {
		System.out.println("Bike moving");
	}
	
	void cycle() {
		System.out.println("Bike cycling");
	}
	
}

