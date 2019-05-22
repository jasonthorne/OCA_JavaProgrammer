package com.android;

public class Main {

	public static void main(String[] args) {
		
		//PRIMITIVE VARS
		int num = 10; 
		boolean myBool = false;
		
		System.out.println("Before method call:");
		System.out.println("num is: " + num);
		System.out.println("bool is: " + myBool);
		
		changePrimitive(num, myBool); //passing COPIES of primitive vars (passing by value)
		
		System.out.println("\nAfter method call:");
		System.out.println("num is: " + num);
		System.out.println("bool is: " + myBool);
		
		//=========
		
		Dog spot = new Dog();
		System.out.println("\nBefore method call, the id of the Dog is: " + spot.id); //id of 1 b4 method call, and STILL an id of 1 after method call.
		changeDog(spot);
		System.out.println("After method call, the id of the Dog is: " + spot.id);
		
		//========
		
		System.out.println("\nBefore method call, the age of the Dog is: " + spot.age); 
		System.out.println("Before method call, the id of the Dog is: " + spot.id);
		changeAttribute(spot);
		System.out.println("\nAfter method call, the age of the Dog is: " + spot.age);
		System.out.println("After method call, the id of the Dog is: " + spot.id);
	}
	
	static void changePrimitive(int num, boolean myBool) { //Passed by value 
		num*=num; //num=num*num
		myBool=true;
		System.out.println("\nInside method, the values are: " + num + ". and: " + myBool + ".");
	}
	
	static void changeDog(Dog spot) { //Passed by value 
		spot = new Dog(); //change spot reference to an instance of a new object. ONLY REASIGNED INSIDE THIS METHOD
		System.out.println("Inside method, the id of the Dog is: " + spot.id);
	}
	
	static void changeAttribute(Dog spot) {
		spot.age=100;
		spot.name="fido";
		System.out.println("\nInside method, the age of the Dog is: " + spot.age);
		System.out.println("Inside method, the name of the Dog is: " + spot.name);
	}
	
	

}
