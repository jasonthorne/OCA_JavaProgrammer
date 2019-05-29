package com.android;

public abstract class Animal { //cant create objects from an abstract class ++++++++++++++++++++++++
	
	int age=23;
	
	void eat() {
		System.out.println("animal eating");
	}
	
	
	 //Any class that inherits from animal HAS to override this drink method:
	abstract void drink();
	
	//inherited classes can choose whether to override or not
	void sleep() {
		System.out.println("Animal sleeping");
	}
	
	

}//end of animal

class Monkey extends Animal{

	//The monkey class HAS TO override the Drink method, as the drink() method is abstract, and this method is extending from Animal. 
	@Override
	void drink() {
		System.out.println("Monkey drinking");
		
	}
	
	//the Monkey class has it's own method climb()
	void climb() {
		System.out.println("Monkey climbing");
	}
	
	
	
}//animal


class Hippo extends Animal{

	@Override
	void drink() {
		System.out.println("hippo drinking");
		
	}
	
	//overriding the sleep method from the animal class. You dont have 
	void sleep() {
		System.out.println("hippo sleeping");
	}

	public void swim() {
		System.out.println("hippo swimming");
		
	}
	
}


class Bird extends Animal{

	@Override
	void drink() {
		System.out.println("bird drinking");
		
	}
	
	//we choose to override the eat method of the Animal class
	void eat() {
		System.out.println("bird eating");
	}
	
	void fly() {
		System.out.println("bird flying");
	}
	
}
