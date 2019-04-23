package com.gretb;


//As there is no such thing as an object that is JUST an animal, an animal is ALWAYS a subclass of Animal e.g a dog is an Animal)
//When you mark a class as Abstract, you CANt create an object of that class. (use the 'new' keyword).
//An Abstract method can only appear in an abstract class. However you CAN have an abstract class with NO abstract methods in it. +++++++++++++++++++++++
public abstract class Animal{
	
	double weight; //every Animal will have a weight
	int age; //every Animal will have an age
	
	//constructor. Even though you cant create an Animal Object, there is still a constructor here, need for the Dog object. 
	Animal(){
		System.out.println("Animal constructor called");
	}
	
	//Any class inheriting from Animal can choose whether to override the sleep method or not. 'CONCRETE METHOD' as it has a body
	void sleep() {
		System.out.println("Animal sleeping");
	}
	
	//Abstract methods ++++++++++++++++
	//these have NO BODY. Has to have the keyword 'Abstract'
	//can ONLY exist in an abstract class and MUST be overridden by children. They FORCE implementation
	abstract void eat();
	
	
	abstract int drink(double amount); //abstract method that returns an int and takes a double
	
	
}



class Dog extends Animal{
	
	int sniffRating; //Only available to objects that have a Dog reference or its children. 
	
	Dog(){
		System.out.println("Dog constructor called");
	}
	
	//this overrides the eat method from the Animal abstract class:
	void eat(){
		System.out.println("Dog eating");
	}

	@Override
	int drink(double ammount) {
		System.out.println("Dog drinking");
		return 0;
	}
	
	//This method will be available ONLY to Dog references or subclasses. It is unique to the Dog class:
	void pant() {
		System.out.println("Dog panting");
	}
	
}


class Cat extends Animal {
	
	int evilRating; //an instance var unique to cat objects or their children

	@Override
	void eat() {
		System.out.println("Cat eating");
		
	}

	@Override
	int drink(double ammount) {
		System.out.println("Cat drinking");
		return 0;
	}
	
	//Choosing to override the concrete method of the abstract Animal class:
	void sleep() {
		System.out.println("Cat sleeping");
	}
	
	
	//this method is unique to the Cat class:
	void purr() {
		System.out.println("Cat purring");
	}
	

	
}





