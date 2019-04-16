package com.gretb;

public class Main {

	public static void main(String[] args) {
		System.out.println("Yo");
		
		
		
		Car myCar = new Car();
		
		Car myCar2 = new Car("Porche", "911", 233456);
		
		
		//when you put an object (ANY object) in a print statement, the toString() method from the object class is called automatically. 
		//The toString() method just prints out the address. ie: com.gretb.Car@15db9742
		System.out.println("My car is: " + myCar);
		System.out.println("My car is: " + myCar2);
		//System.out.println("My car is: " + myCar.);
		
	}

}
