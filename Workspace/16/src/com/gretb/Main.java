package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		Dog spot = new Dog(); //create a new dog
		spot.name = "spot";
		spot.age=4;
		spot.weight=14;
		
		
		Dog dog2 = new Dog();
		dog2.name="lassie";
		dog2.age=3;
		dog2.weight=7;
		
		/*
		 * When you want to call a method of a particular object we go to the name of the object.name of method()
		 */
		
		spot.run();
		dog2.run();
		
		spot.lick();
		dog2.lick();
		
		spot.eat();
		dog2.eat();
		
		Maths myMaths = new Maths(); //make a Maths object
		int num1=25, num2=50; //these are the vars that will be sent to our add() method
		double sum = myMaths.add(num1, num2);
		System.out.println("Sum is: " + sum);
		
	}
	

}
