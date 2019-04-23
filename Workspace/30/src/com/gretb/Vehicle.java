package com.gretb;

public class Vehicle {
	
	void move() {
		
		System.out.println("Vehicle moving");
	}

}


class Car extends Vehicle{
	
	void drive() {
		move(); //getting move from vehicle class
		System.out.println("car driving");
	}
}