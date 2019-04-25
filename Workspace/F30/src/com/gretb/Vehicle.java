package com.gretb;

public class Vehicle {
	
	void move() {
		System.out.println("vehicle move");
	}

}

class Car extends Vehicle{
	
	void drive() {
		//gets move method from Vehicle class
		move();
		System.out.println("car drive");
	}
}
