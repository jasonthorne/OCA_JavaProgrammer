package com.gretb;

public class Plant {
	//age of plant
	int age;
	void grow() {
		System.out.println("plant growing");
	}

}

class Fruit extends Plant{
	//amount of fruit produced every year
	int yearlyFruit;
	//overriden grow method, polymorphic method
	void grow() {
		System.out.println("Fruit growing");
	}
	//this is a method unique to the Fruit class
	void flowering() {
		System.out.println("Fruit producing flowers");
	}
}
