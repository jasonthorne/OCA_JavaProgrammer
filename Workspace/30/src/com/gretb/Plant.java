package com.gretb;

public class Plant {
	
	
	int age; //age of plant
	
	void grow() {
		System.out.println("plant growing");
	}

}


class Fruit extends Plant{
	
	int yearlyFruit; //amount of fruit produced every year
	
	//overridden grow method (polymorphic)
	void grow() {
		System.out.println("fruit growing");
	}
	
	//unique to the fruit class:
	void flowering() {
		System.out.println("fruit producing flowers");
	}
	
}